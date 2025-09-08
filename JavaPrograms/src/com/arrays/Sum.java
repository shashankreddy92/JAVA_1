package com.arrays;

import java.util.Iterator;

public class Sum {
	public static void main(String[] args) {
		int [] a = new int[4];
		a[0]=10;
		a[1]=7;
		a[2]=18;
		a[3]=45;
		int sum = 0 ;
		
		for (int i = 0; i < a.length; i++) {
			sum = sum+a[i];
		}
		System.out.println(sum);
	}

}
