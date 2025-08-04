package com.patterns;

public class Alphabet_Pattern_1 {

	public static void main(String[] args) {
		
		char ch = 'A';
		int num = 5 ;
		for(int i =1;i <=num;i++) {
			for(int j=1;j<=num;j++) {
				System.out.print(ch++ + " ");
			}
			System.out.println();	
		}
		
	}

}
