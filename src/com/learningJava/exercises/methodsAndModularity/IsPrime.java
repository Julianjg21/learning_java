package com.learningJava.exercises.methodsAndModularity;

import java.util.Scanner;

public class IsPrime {

    // Method to check if a number is prime
    public static boolean isPrime(int number) {
        if (number < 2) {
            return false; // Numbers less than 2 are not prime
        }
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false; // If divisible by any number other than 1 and itself, it's not prime
            }
        }
        return true; // Number is prime
    }

    public static void main(String[] args) {
        int number; // User input

        Scanner scanner = new Scanner(System.in); // Scanner for user input

        System.out.println("Enter a number to check if it is prime:");
        number = scanner.nextInt(); // Read input

        // Check and display if the number is prime
        if (isPrime(number)) {
            System.out.println("The number is prime");
        } else {
            System.out.println("The number is not prime");
        }
    }
}
