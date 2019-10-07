package Basics;

import java.util.Scanner;

/**
 * A Java program to count the letters, spaces, numbers and other characters of an input string.
 */

public class CountLettersSpacesSpecialChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a String : ");
        String inputString = scanner.nextLine();

        //creating an object of the class
        CountLettersSpacesSpecialChars countLettersSpacesSpecialChars = new CountLettersSpacesSpecialChars();
        countLettersSpacesSpecialChars.countCaptitalLetter(inputString);
    }

    /**
     * The method converts the String into an char array and then
     * checks if each element is a Capital Letter or Small Letter
     * or Number or Special Character and displays the total count
     * for each in the entered String
     *
     * @param inputString is the string entered by the user
     */
    private void countCaptitalLetter(String inputString) {

        //declaring count vars for the types of input in the String
        int countCapitalChars = 0, countSpaces = 0, countSpecialChar = 0, countSmallChars = 0, countNum = 0;

        //converting the String into Char[]
        char[] enteredString = inputString.toCharArray();

        for (int i = 0; i < enteredString.length; i++) {
            if (inputString.charAt(i) >= 65 && inputString.charAt(i) <= 90) {
                countCapitalChars++;
            } else if (inputString.charAt(i) == 32) {
                countSpaces++;
            }else if (inputString.charAt(i) >= 48 && inputString.charAt(i) <= 57 ) {
                countNum++;
            }else if (inputString.charAt(i) >= 33 && inputString.charAt(i) <= 63) {
                countSpecialChar++;
            } else if (inputString.charAt(i) >= 97 && inputString.charAt(i) <= 122) {
                countSmallChars++;
            }
        }

        System.out.println("Spaces = " + countSpaces + "\nspecial chars = " + countSpecialChar + "\nCaptial Chars = "
                + countCapitalChars + "\nSmall Chars = " + countSmallChars + "\nNumber = " + countNum);
    }
}