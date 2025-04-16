package com.learningJava.exercises.arrays;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.Scanner;

public class SortAlphabetically {

    // Method to sort an array of student names alphabetically
    public static String[] SortStudentsByName(String[] students) {
        Arrays.sort(students);
        return students;
    }

    public static void main(String[] args) {
        int numberOfStudents;
        ArrayList<String> students = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        // Ask the user how many student names to enter
        System.out.println("Enter the number of students that you want to sort:");
        numberOfStudents = scanner.nextInt();
        scanner.nextLine(); // Consume the leftover newline character

        // Prompt the user to enter each student's name
        System.out.println("Enter the names of the students one by one:");
        for (int i = 1; i <= numberOfStudents; i++) {
            System.out.println("Student " + i + " name:");
            students.add(scanner.nextLine());
        }

        scanner.close(); // Close the scanner

        // Convert ArrayList to array, sort it, and print the result
        String[] studentsArray = SortStudentsByName(students.toArray(new String[0]));
        System.out.println("List of students sorted alphabetically: " + Arrays.toString(studentsArray));
    }
}
