package com.arrays;

import java.util.Scanner;

public class MultiDimArray {

	public static void main(String[] args) {

		int [][] arr = new int [3][3];
		
		System.out.println("Default values");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.print(arr[i][j]+" ");	
			}
			System.out.println();
		}
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter values:");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		System.out.println("Initialized values");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}
