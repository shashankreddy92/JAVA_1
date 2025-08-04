package com.NumberPrograms;

import java.util.Scanner;

public class SumOfLargeAndSmallPrimeInRange {

    public static boolean isPrime(int num) {
        if (num <= 1)
            return false;
        for (int i = 2; i <= num/2; i++) {
            if (num % i == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String choice;

        do {
            System.out.print("Enter start of range: ");
            int start = sc.nextInt();
            System.out.print("Enter end of range: ");
            int end = sc.nextInt();

            int smallestPrime = -1;
            int largestPrime = -1;

            for (int i = start; i <= end; i++) {
                if (isPrime(i)) {
                    if (smallestPrime == -1) {
                        smallestPrime = i;
                    }
                    largestPrime = i;
                }
            }

            if (smallestPrime == -1) {
                System.out.println("No prime number found in range");
            } else {
                int sum = smallestPrime + largestPrime;
                System.out.println("Smallest prime: " + smallestPrime);
                System.out.println("Largest prime: " + largestPrime);
                System.out.println("SUM: " + sum);
            }

            System.out.print("Do you want to continue? (yes/no): ");
            sc.nextLine(); // consume newline
            choice = sc.nextLine().toLowerCase();  // convert to lowercase

        } while (choice.equals("yes") || choice.equals("y"));

        System.out.println("Exited.");
        sc.close();
    }
}
