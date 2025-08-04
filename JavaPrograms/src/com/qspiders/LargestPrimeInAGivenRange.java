package com.qspiders;

import java.util.Scanner;

public class LargestPrimeInAGivenRange {
	
	public static boolean isPrime(int num)
	{
		if(num<=1)
			return false;
		for(int i =2;i<=num/2;i++)
		{
			if(num%i==0)
				return false;
		}
		return true;
	}
	
	public static int findLargestPrime(int start,int end)
	{
		for(int i = end;i>=start;i--)
		{
			if(isPrime(i)) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
			
		Scanner sc = new Scanner(System.in);
		
		//input the range
		System.out.print("Enter start of range:");
		int start=sc.nextInt();
		
		System.out.print("Enter end of range:");
		int end=sc.nextInt();
		
		int largestPrime=findLargestPrime(start, end);
		
		if(largestPrime != -1)
			System.out.println("The largest prime number in the range is "+ largestPrime);
		else
			System.out.println("No prime number in the given range");
		
	}

}
