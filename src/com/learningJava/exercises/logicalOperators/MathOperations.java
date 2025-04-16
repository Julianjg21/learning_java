package com.learningJava.exercises.logicalOperators;

import java.util.Scanner;

public class MathOperations {
    public static void main(String[] args) {
        int number1, number2, total = 0; // Store the two input numbers and the result
        boolean exit = false; // Controls whether the program should exit
        int options; // Stores the user's selected option

        Scanner scanner = new Scanner(System.in); // Scanner for user input

        while(!exit){
            // Display the operation menu
            System.out.println("""
                    Welcome, please enter the number of the operation you want to perform:
                    1.Multiplication
                    2.Division
                    3.Sum
                    4.Subtraction
                    5.Exit""");

            options = scanner.nextInt(); // Read the selected option

            if(options == 5){
                // Exit the program
                System.out.println("Thank you for using our service");
                exit = true;
            } else if(options > 0 && options < 5){
                // Valid option selected, ask for input numbers
                System.out.println("Insert the first number:");
                number1 = scanner.nextInt();
                System.out.println("Insert the second number:");
                number2 = scanner.nextInt();

                // Perform the corresponding operation
                total = switch (options) {
                    case 1 -> number1 * number2;     // Multiplication
                    case 2 -> number1 / number2;     // Division
                    case 3 -> number1 + number2;     // Addition
                    case 4 -> number1 - number2;     // Subtraction
                    default -> total; // Just in case, though it won't be triggered
                };

                // Show the result
                System.out.println("The result of the operation is :" + total);
            } else {
                // Handle invalid menu option
                System.out.println("Invalid option, try again");
            }
        }
    }
}
