package com.learningJava.exercises.methodsAndModularity;

import java.util.Scanner;

public class ConvertNumberToBinary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Scanner for user input

        System.out.print("Enter a number: ");
        double number = scanner.nextDouble(); // Read the input number

        // Separate the integer part
        int integerPart = (int) number;
        String binaryInteger = Integer.toBinaryString(integerPart); // Convert integer part to binary

        // Extract the decimal part
        double decimalPart = number - integerPart;
        StringBuilder binaryDecimal = new StringBuilder(); // To build binary of decimal part

        // Convert decimal part to binary (up to 10 bits of precision)
        while (decimalPart > 0 && binaryDecimal.length() < 10) {
            decimalPart *= 2;
            if (decimalPart >= 1) {
                binaryDecimal.append("1");
                decimalPart -= 1;
            } else {
                binaryDecimal.append("0");
            }
        }

        // Display full binary result
        System.out.println("The binary representation of " + number + " is " + binaryInteger + "." + binaryDecimal);

        scanner.close(); // Close the scanner
    }
}
