package com.learningJava.exercises.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayOperations {

    // Method that calculates the average and finds the largest number
    public static void ArrayOperation(int a, int b, int c, int d, int e) {
        int total = 0;
        int[] array = {a, b, c, d, e}; // Store the five input numbers in an array

        // Calculate the sum of all elements
        for (int i = 0; i < array.length; i++) {
            total += array[i];
        }

        total /= array.length; // Calculate average

        // Display the average and the largest number
        System.out.println("The average is: " + total + " and the largest number is: " + Arrays.stream(array).max().getAsInt() + ".");
    }

    public static void main(String[] args) {
        int a, b, c, d, e; // Variables to hold the user input
        Scanner scanner = new Scanner(System.in);

        // Prompt user for 5 numbers
        System.out.println("To calculate the average and the highest number you must enter 5 numbers.");
        System.out.println("Enter the first number:");
        a = scanner.nextInt();
        System.out.println("Enter the second number:");
        b = scanner.nextInt();
        System.out.println("Enter the third number:");
        c = scanner.nextInt();
        System.out.println("Enter the fourth number:");
        d = scanner.nextInt();
        System.out.println("Enter the fifth number:");
        e = scanner.nextInt();

        scanner.close(); // Close the scanner

        // Call method to perform operations
        ArrayOperation(a, b, c, d, e);
    }
}
