package com.NumberPrograms;

public class Rhombus_Star_Pattern {

	public static void main(String[] args) {

		int num = 3;
		for(int i =1;i<2*num;i++) {
			for(int j =1;j<2*num;j++) {
				if(i+j>num && j-i<num && i-j<num && i+j<3*num) {
					System.out.print("* ");
				}
				else
					System.out.print("  ");
			}
			System.out.println();
		}
		
		
	}

}
