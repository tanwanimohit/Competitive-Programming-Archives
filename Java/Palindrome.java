import java.util.Scanner;
/**
 *  a Java program to check if the inputted string is the same backwards
 */
public class Palindrome {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String input = scanner.nextLine();

        input = input.toLowerCase();
        String reverse = "";

        int i = 0;
        int j = input.length()-1;

        while (i<=j) {
            reverse = reverse + input.charAt(j);
            j--;
        }

        if(input.equals(reverse)) {
            System.out.println(input + " is a palindrome");
        }
        else {
            System.out.println(input + " is NOT a palindrome");
        }
    }
}