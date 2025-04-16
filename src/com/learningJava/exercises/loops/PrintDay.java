package com.learningJava.exercises.loops;

import java.util.Scanner;

public class PrintDay {
    public static void main(String[] args) {

        int number = 0; // Stores the number entered by the user
        String day;     // Stores the name of the day

        Scanner scanner = new Scanner(System.in); // Scanner for user input

        System.out.println("Enter a number between 1 and 7:");
        number = scanner.nextInt(); // Read the input number

        // Validate if the number is within the valid range
        if (number < 1 || number > 7) {
            System.out.println("Invalid number");
            return; // Exit the program if input is invalid
        } else {
            // Map number to corresponding day using switch expression
            day = switch (number) {
                case 1 -> "Monday";
                case 2 -> "Tuesday";
                case 3 -> "Wednesday";
                case 4 -> "Thursday";
                case 5 -> "Friday";
                case 6 -> "Saturday";
                case 7 -> "Sunday";
                default -> throw new IllegalStateException("Unexpected value: " + number); // Should never happen
            };

            // Output the result
            System.out.println("Tu day is " + day + ".");
        }
    }
}
