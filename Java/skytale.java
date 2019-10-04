public class Skytale {

    private int n;

    public Skytale(int n) {
        if (n < 1) {
            this.n = 1;
        } else {
            this.n = n;
        }
    }

    public String encrypt(String klartext) {
        String geheimtext = "";
        int pos = 0;
        int m = klartext.length() / n;

        if (klartext.length() % n != 0) {
            m++;
        }

        char[][] buchstaben = new char[n][m];

        // Fill char-array line by line
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (pos < klartext.length()) {
                    buchstaben[i][j] = klartext.charAt(pos++);
                } else {
                    buchstaben[i][j] = ' ';
                }
            }
        }

        // Read from char-array column by column
        for (int j= 0; j < m; j++) {
            for (int i = 0; i < n; i++) {
                geheimtext += buchstaben[i][j];
            }	
        }

        return geheimtext;
    }

    public String decrypt(String geheimtext) {
        String klartext = "";
        int pos = 0;
        int m = geheimtext.length() / n;

        if (klartext.length() % n != 0) {
            throw new IllegalStateException();
        }

        char[][] buchstaben = new char[n][m];

        // Fill char-array column by column
        for (int j= 0; j < m; j++) {
            for (int i = 0; i < n; i++) {
                buchstaben[i][j] = geheimtext.charAt(pos++);            
            }
        }

        // Read from char-array line by line
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                klartext += buchstaben[i][j];
            }	
        }

        return klartext.trim();
    } 
}
