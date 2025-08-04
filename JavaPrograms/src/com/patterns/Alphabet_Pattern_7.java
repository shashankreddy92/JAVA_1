package com.patterns;

public class Alphabet_Pattern_7 {

	public static void main(String[] args) {
		

		    
		        int rows = 3; // Number of rows for upper half (including middle)

		        // Upper half (including middle row)
		        for (int i = 1; i <= rows; i++) {
		            // Print leading spaces
		            for (int s = 1; s <= rows - i; s++) {
		                System.out.print("  ");
		            }

		            // Print characters
		            char ch = 'A';
		            for (int j = 1; j <= 2 * i - 1; j++) {
		                System.out.print(ch++ + " ");
		            }

		            System.out.println();
		        }

		        // Lower half
		        for (int i = rows - 1; i >= 1; i--) {
		            // Print leading spaces
		            for (int s = 1; s <= rows - i; s++) {
		                System.out.print("  ");
		            }

		            // Print characters
		            char ch = 'A';
		            for (int j = 1; j <= 2 * i - 1; j++) {
		                System.out.print(ch++ + " ");
		            }

		            System.out.println();
		        }
		    }
		

	}


