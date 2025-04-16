package com.learningJava.exercises.logicalOperators;
import java.util.Scanner;

public class WelcomeMessage {
    public static void main(String[] args) {
        String name;
        int edad ;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter you name:");
        name =  scanner.nextLine();
        System.out.println("Enter your age:");
        edad = scanner.nextInt();
        scanner.close();

        System.out.println("Hello " + name + " your age is " + edad);

    }

}
