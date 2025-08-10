package com.exception_handling;

public class Sample {
	int a =10;
	public static void main(String[] args) {
		System.out.println("Start");
		Sample s1 = null;
		try {
			System.out.println(s1.a);
		} 
		catch (NullPointerException e)
		{
			e.getMessage();
		}
		System.out.println("End");
	}

}
