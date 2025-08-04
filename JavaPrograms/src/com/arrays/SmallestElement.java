package com.arrays;

public class SmallestElement {

	public static void main(String[] args) {

		int [] arr = {4,3,2,5,1,6};
		
		int smallest = arr[0];
		
		for (int i = 0; i < arr.length; i++) {
			
			if(arr[i]<smallest)
				smallest = arr[i];
		}
		System.out.println("Smallest: "+ smallest);
	}

}
