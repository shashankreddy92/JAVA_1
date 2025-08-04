package com.arrays;

public class PalindromeArray {

    // Method to check if a number is palindrome
    public static boolean isPalindrome(int num) {
        int original = num;
        int reversed = 0;

        while (num > 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num = num / 10;
        }

        return original == reversed;
    }

    public static void main(String[] args) {
        int[] numbers = {121, 234, 454, 34543, 789, 12321, 88, 10};

        System.out.println("Palindrome numbers in the array:");
        for (int num : numbers) {
            if (isPalindrome(num)) {
                System.out.print(num + " ");
            }
        }
    }
}
