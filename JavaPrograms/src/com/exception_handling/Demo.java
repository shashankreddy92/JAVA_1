package com.exception_handling;
import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		System.out.println("Start");
		try {
			System.out.println(10/0);//internally throw new ArithmeticException()
		} catch (ArithmeticException e) {//e which is obj ref var stores the address of Exception
			e.printStackTrace();
		}
		
		System.out.println("End");
	}
	
	
}
