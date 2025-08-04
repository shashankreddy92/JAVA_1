package com.recursion;

public class Program1 {

	public static void main(String[] args) {
		int i =1;
		int num =3;
		print(i,num);
		
	}
	public static void print(int i,int num) {
		if(i>num)return;
		System.out.println(i);
		print(++i,num);
		print(++i,num);
		System.out.println(i);
	}
}
