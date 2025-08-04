package com.arrays;

public class OneDim_CopyArray {

	public static void main(String[] args) {

		int [] arr = {1,2,3,4,5};
		int [] res = new int[arr.length];
		for(int i = 0; i < arr.length; i++) {
			res[i] = arr[i];
		}
		System.out.print("Result array: ");
		for(int i = 0 ; i<arr.length;i++) {
			System.out.print(res[i]+ " ");
		}
		
	}

}
