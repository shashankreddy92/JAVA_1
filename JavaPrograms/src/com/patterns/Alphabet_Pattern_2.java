package com.patterns;

public class Alphabet_Pattern_2 {

	public static void main(String[] args) {

		int num =5;
		char ch = 'A';
		for(int i =1;i<=num;i++) {
			for(int j =1;j<=num;j++)
			{
				System.out.print(ch + " ");
			}
			System.out.println();
			ch++;
		}
		
	}

}
