package com.exception_handling;

import java.util.Scanner;

public class Person_CustomException {

	public static void main(String[] args) {
		System.out.println("Start");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter age");
		int age = sc.nextInt();
		if(age>=18) {
			System.out.println("Eligible for voting");
		}
		else {
			try {
				throw new CustomException("Not eligible for voting");
			} 
			catch (CustomException e) {
				e.printStackTrace();
			}
		}
		System.out.println("end");
	}
	
}

