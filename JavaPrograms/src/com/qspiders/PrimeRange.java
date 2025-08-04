package com.qspiders;

import java.util.Scanner;

public class PrimeRange {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter lower range:");
		int lower_range = scanner.nextInt();
		System.out.println("Enter upper range:");
		int upper_range = scanner.nextInt();
		
		for(int j=lower_range;j<=upper_range;j++)
		{
			int count = 0;
			for(int i = 1 ;i <= j; i++)
			{
				if(j % i == 0);
				count ++;
			}
			if(count == 2) {
				System.out.println(j);
			}
		}
	}

}
