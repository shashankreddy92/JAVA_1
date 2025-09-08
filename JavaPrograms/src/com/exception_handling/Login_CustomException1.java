package com.exception_handling;

import java.util.Scanner;

public class Login_CustomException1 {

	public static void main(String[] args) {
		int password = 1234;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter password");
		int pass = sc.nextInt();
		if(pass==password) {
			System.out.println("Login successful");
		}
		else {
			try {
				throw new Custom_Exception1("Invalid password");
			} 
			catch (Custom_Exception1 e) {
				e.printStackTrace();
			}
		}
		System.out.println("End");
	}
	
}
