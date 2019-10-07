package Basics;

/**
 * Java program for Bubble Sort
 * The user enters an array of numbers and then the computer sorts it using Bubble Sort
 */

import java.util.Arrays;
import java.util.Scanner;


public class BubbleSort {
    /**
     * This method checks if the
     * @param arr is the array of integers that entered by the user
     */
    private static void bubbleSort(int[] arr) {
        int n = arr.length;
        int temp = 0;

        /**
         * Checking if the current value is greater than the next value
         * if yes, swap
         * if no, leave as it as
         */
        for(int i=0; i < n; i++){
            for(int j=1; j < (n-i); j++){
                if(arr[j-1] > arr[j]){
                    //swap elements
                    temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }

            }
        }

    }
    public static void main(String[] args) {

        //getting user input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of elements in the array >");
        int numOfElements = scanner.nextInt();
        int[] arr = new int[numOfElements];

        for(int i = 0; i < numOfElements; i++){
            System.out.println("Enter element " + (i+1));
            arr[i] = scanner.nextInt();
        }

        System.out.println("Array Before Bubble Sort");
        Arrays.stream(arr).mapToObj(item -> item + " ").forEach(System.out::print);
        System.out.println();

        //sorting array elements using bubble sort
        bubbleSort(arr);

        System.out.println("Array After Bubble Sort");
        Arrays.stream(arr).mapToObj(item -> item + " ").forEach(System.out::print);

    }
}
