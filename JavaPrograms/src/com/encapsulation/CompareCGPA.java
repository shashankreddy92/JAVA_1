package com.encapsulation;

class Student {
    String name;
    double cgpa;

    // Constructor to initialize student data
    Student(String name, double cgpa) {
        this.name = name;
        this.cgpa = cgpa;
    }
}

public class CompareCGPA {

    // Method to compare two student objects
    public static Student getTopper(Student s1, Student s2) {
        if (s1.cgpa > s2.cgpa) {
            return s1;
        } else {
            return s2;
        }
    }

    public static void main(String[] args) {
        // Create two Student objects
        Student student1 = new Student("Alice", 9.5);
        Student student2 = new Student("Bob", 9.2);

        // Call method and get topper
        Student topper = getTopper(student1, student2);

        // Display the result
        System.out.println("Topper is: " + topper.name + " with CGPA: " + topper.cgpa);
    }
}
