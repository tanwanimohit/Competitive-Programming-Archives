package Basics;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Write a Java program to test if an array contains a specific value.
 */
public class CheckIfArrayContainsASpecificVal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many elements in the array ? >");
        int numOfElements = scanner.nextInt();

        int[] array = new int[numOfElements];

        for (int i = 0; i < array.length; i++){
            System.out.println("Enter element " + (i+1));
            array[i] = scanner.nextInt();
        }

        System.out.println("Enter the element to be found. ");
        int numToFind = scanner.nextInt();

        boolean isElementPresentBinarySearch = binarySearch(array, numToFind);
        boolean isElementPresentLinearSearch = linearSearch(array, numToFind);

        if (!isElementPresentLinearSearch){
            System.out.println("The element is not in the list");
        }
    }

    private static boolean linearSearch(int[] array, int numToFind){
       for (int i = 0; i < array.length; i++ ){
           if (array[i] == numToFind){
               System.out.println("The element is found at position " + (i+1));
                return true;
           }
       }
       return false;
    }

    private static boolean binarySearch(int[] array, int numToFind){
        Arrays.sort(array);
        int middle = array.length / 2;
        if (array[middle] < numToFind){
             ;
        }else if (array[middle] > numToFind){
            return true;
        }else {
            System.out.println("The num is present at " + middle);
            return true;
        }
        return false;
    }
}