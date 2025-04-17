package com.learningJava.exercises.poo;

import java.util.Scanner;

public class Rectangle {
    // Attributes for the dimensions of the rectangle
    private double length;
    private double width;

    // Setter for length
    public void setLength(double length) {
        this.length = length;
    }

    // Setter for width
    public void setWidth(double width) {
        this.width = width;
    }

    // Method to calculate and print the area of the rectangle
    public void calculateArea() {
        System.out.println("The area of the rectangle is: " + (length * width) + " cm");
    }

    // Method to calculate and print the perimeter of the rectangle
    public void calculatePerimeter() {
        System.out.println("The perimeter of the rectangle is: " + (2 * (length + width)) + " cm.");
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(); // Create a Rectangle object
        Scanner sc = new Scanner(System.in);

        // Ask user for the dimensions of the rectangle
        System.out.println("Enter the length of the rectangle: ");
        rectangle.setLength(sc.nextInt());

        System.out.println("Enter the width of the rectangle: ");
        rectangle.setWidth(sc.nextInt());

        // Calculate and display area and perimeter
        rectangle.calculateArea();
        rectangle.calculatePerimeter();

        sc.close(); // Close the scanner
    }
}
