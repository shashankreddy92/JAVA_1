package com.patterns;

public class Alphabet_Pattern_5 {

	public static void main(String[] args) {
		
		int num = 5 ;
		for(int i =1;i<=num;i++) {
			char ch = 'A';
			ch+=i-1;
			for(int j=1;j<=num;j++) {
				if(i+j<=num+1)
				System.out.print(ch++ + " ");
				else 
					System.out.print(" ");		
			}
			System.out.println();
		}
		
	}

}
