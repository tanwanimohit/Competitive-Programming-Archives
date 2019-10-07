package Basics;

import java.util.Arrays;
import java.util.Scanner;

/**
 *  Write a Java program to sort a numeric array and a string array.
 */
public class SortNumericAndStringArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of elements in the array >");

        int numOfElements = scanner.nextInt();
        String[] array = new String[numOfElements];


        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter element " + (i+1));
            array[i] = scanner.next();
        }

         Arrays.toString(array);
         Arrays.sort(array);

        System.out.println(Arrays.toString(array));
    }
}
