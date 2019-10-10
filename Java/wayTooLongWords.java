import java.io.*;

public class wayTooLongWords {
	public static PrintWriter out;
	static class FastReader{
		BufferedReader br;
		public FastReader() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}
		String nextLine() {
			String str = "";
			try
			{
				str = br.readLine();
			
			}
			catch(IOException e) {
				e.printStackTrace();
			}
			return str;
		}
	}
	
	public static void main(String[] args) {
		out = new PrintWriter(new BufferedOutputStream(System.out),true);
		FastReader in = new FastReader();
		int words = Integer.parseInt(in.nextLine());
		while(words>0) {
			String word = in.nextLine();
			out.println((word.length()>10)?(word.charAt(0)+Integer.toString(word.length()-2)+word.charAt(word.length()-1)):(word));
			words--;
		}
		
	}
}
