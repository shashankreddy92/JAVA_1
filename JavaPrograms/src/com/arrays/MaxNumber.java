package com.arrays;

public class MaxNumber {
	public static void main(String[] args) {
		int [] a = new int[4];
		a[0] = 10;
		a[1] = 7;
		a[2] = 18;
		a[3] = 45;
		int max = a[0];
		for (int i = 0; i < a.length; i++) {
			if(a[i]>max)
				max = a[i];
			}
		System.out.println("Maximum number is: "+max);
	}

}
