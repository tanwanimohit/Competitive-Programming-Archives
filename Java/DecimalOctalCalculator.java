import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DecimalOctalCalculator {

    private static final int BASE_8 = 8;
    private static BufferedReader br;


    public static void main(String[] args){
        br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please input decimal number:");
        try {
            int decimalNumber = Integer.parseInt(br.readLine());
            System.out.println("The Octal number for the decimal " + decimalNumber + " is: " + DecimalOctalCalculator.calculateDecimalFromOctal(decimalNumber));
        } catch (IOException e) {
            e.printStackTrace();
        } catch (NumberFormatException ex){
            System.err.println("Invalid Number, only is allow numeric values");
        }

    }


    public static String calculateDecimalFromOctal(int decimalNumber) {
        String result = "";
        int quotient;
        int tmp = decimalNumber;

        int rest;
        do {

            quotient = tmp / BASE_8;
            rest = (tmp % BASE_8);
            result = String.valueOf(rest) + result;
            tmp = quotient;

        } while (quotient > BASE_8);


        return (quotient + result);

    }


}
