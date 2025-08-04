package com.qspiders;

import java.util.Scanner;

public class SumOfLargestAndSmallestPrime {
	
	public static boolean isPrime(int num)
	{
		if(num<=1)
			return false;
		for (int i = 2; i < num/2; i++) {
			if(num%i==0)
				return false;
			
		}
		return true;
	}
	
	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
		 System.out.print("Enter start of range: ");
		 int start = scan.nextInt();
		 System.out.print("Enter end of range: ");
		 int end=scan.nextInt();
		 int smallestPrime = -1;
		 int largestPrime = -1;
		 for (int i = start; i <= end; i++) {
			 
			 if(isPrime(i))
			 {
				 if(smallestPrime == -1)
				 {
					 smallestPrime = i ;}
					 largestPrime = i;
				 
			 }
		 }
			 if(smallestPrime==-1) {
				 System.out.println("No prime in range");
			 }
			 else 
			 {
				 int sum = smallestPrime+largestPrime;
				 System.out.println("Smallest prime: "+smallestPrime);
				 System.out.println("Largest prime: "+largestPrime);
				 System.out.println("Sum of largest and smallest prime in range is : "+sum);
			 }
			
		}

	}


