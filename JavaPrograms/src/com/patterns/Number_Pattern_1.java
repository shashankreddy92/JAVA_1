package com.patterns;

public class Number_Pattern_1 {

	public static void main(String[] args) {

		int num = 5;
		for(int i =1;i<=num;i++) {
			//int n =1;
			//n+=i-1;
			for(int j =1;j<=num;j++) {
				if(i+j<=num+1)
					System.out.print(i+j-1 + " ");
				else
					System.out.print(" ");
				
			}
			System.out.println();
		}
		
	}

}
