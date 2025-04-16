package com.learningJava.exercises.loops;

import java.util.Scanner;

public class FactorialCalculator {
    public static void main(String[] args) {
        int total = 1; // Stores the result of the factorial
        int number;    // Number entered by the user

        Scanner scanner = new Scanner(System.in); // Scanner for user input

        System.out.println("Enter an integer number to calculate its factorial:");
        number = scanner.nextInt(); // Read the input number

        // Loop to calculate the factorial
        for(int i = 1; i <= number; i++) {
            total *= i;
        }

        // Output the result
        System.out.println("The factorial of " + number + " is " + total);
    }
}
