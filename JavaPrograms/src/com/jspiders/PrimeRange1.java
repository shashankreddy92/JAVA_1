package com.jspiders;

import java.util.Scanner;

public class PrimeRange1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input range
        System.out.print("Enter starting number: ");
        int start = scanner.nextInt();
        System.out.print("Enter ending number: ");
        int end = scanner.nextInt();

        System.out.println("Prime numbers between " + start + " and " + end + " are:");

        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }

        scanner.close();
    }

    // Method to check if a number is prime
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }

        for (int i = 2; i <= num /2; i++) {
            if (num % i == 0) {
                return false; // Not a prime
            }
        }

        return true; // Prime
    }
}

