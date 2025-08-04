package com.encapsulation;

import java.util.Scanner;

public class PhonePe {
	
	private double balance = 2000.0;
	int pin =1234;
	
	public double getBalance() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter pin");
		int upin = sc.nextInt();
		
		if(upin==pin) {
			return balance;
		}
		return -1;
	}

}
