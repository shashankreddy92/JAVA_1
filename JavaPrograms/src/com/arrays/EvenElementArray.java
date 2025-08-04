package com.arrays;

public class EvenElementArray {

	public static void main(String[] args) {

		int [] arr = {1,2,3,4,5,6};
		int [] res = new int[arr.length];
		int j = 0 ;
		for (int i = 0; i < arr.length; i++) {
			
			if(arr[i] % 2 ==0) {
				res[j++] = arr[i];
			}
		}
		for(int i = 0 ; i<res.length;i++) {
			System.out.println(res[i]);
		}
		
	}

}
