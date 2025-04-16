package com.learningJava.exercises.methodsAndModularity;

import java.util.Scanner;

public class largestNumber {

    // Method that returns the largest of three integers
    public static int largest(int a, int b, int c){
        return Math.max(a, Math.max(b, c));
    }

    public static void main(String[] args) {
        int a, b, c; // Variables to store user input

        Scanner scanner = new Scanner(System.in); // Scanner for user input

        // Prompt user for three numbers
        System.out.println("To be able to find the largest number, you need to enter three numbers:");
        System.out.println("Enter the first number:");
        a = scanner.nextInt();
        System.out.println("Enter the second number:");
        b = scanner.nextInt();
        System.out.println("Enter the third number:");
        c = scanner.nextInt();

        scanner.close(); // Close the scanner

        // Display the largest number
        System.out.println("The largest number is " + largest(a, b, c));
    }
}
