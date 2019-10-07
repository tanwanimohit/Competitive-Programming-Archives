package Basics;

import java.util.Scanner;

/**
 *  a Java program to reverse a string.
 */
public class ReverseAString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string : ");
        String inputString = scanner.nextLine();

        ReverseAString reverse = new ReverseAString();
        reverse.reverseString(inputString);
    }
    private void reverseString(String string){
        for (int i = string.length() - 1; i >= 0; i--){
            System.out.print(string.charAt(i));
        }
    }
}
