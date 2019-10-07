package Basics;

import java.util.Scanner;

/**
 * Write a Java program and compute the sum of the digits of an integer.
 */
public class SumOfDigitsOfInt {
    private int number;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number : ");
        SumOfDigitsOfInt sum = new SumOfDigitsOfInt();
        sum.number = scanner.nextInt();
        sum.findLastDigit(sum.number);
    }
    private void findLastDigit(int number){
        int sumOfDigits = 0;
        while (number != 0 ){
            sumOfDigits = sumOfDigits + number % 10;
            number = number/10;
        }
        System.out.println(sumOfDigits);
    }
}
