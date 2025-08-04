package com.arrays;

public class TwoDim_CopyArray {

	public static void main(String[] args) {

		int [][] arr = {{1,2,3},{4,5,6},{7,8,9}};
		int [][] res  = new int[arr.length][arr[0].length];
		
		for (int i = 0; i < arr.length; i++) {
			
			for(int j = 0; j<arr[i].length;j++) {
			res[i][j] = arr[i][j];
			System.out.print(res[i][j]+ " ");
			}
			System.out.println();
		}
		
		
	}

}
