package com.learningJava.exercises.poo;

import java.util.ArrayList;

public class Students {
    String name;
    int score;

    // Constructor to initialize name and score
    public Students(String name, int score) {
        this.name = name;
        this.score = score;
    }

    // Method to print whether each student passed or failed
    public static void approvedOrNot(ArrayList<Students> students) {
        for (Students student : students) {
            System.out.println("The student " + student.name +
                    (student.score >= 60 ? " is approved." : " is reproved."));
        }
    }

    public static void main(String[] args) {
        ArrayList<Students> students = new ArrayList<>();

        // Adding sample students with their scores
        students.add(new Students("Julian", 90));
        students.add(new Students("Sofia", 25));
        students.add(new Students("Rodrigo", 45));
        students.add(new Students("Paula", 15));

        // Call method to evaluate and print results
        approvedOrNot(students);
    }
}
