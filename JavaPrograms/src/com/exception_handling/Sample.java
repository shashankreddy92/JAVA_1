package com.exception_handling;

public class Sample {
	int a =10;
	public static void main(String[] args) {
		System.out.println("Start");
		Sample s1 = null;
		try {
			System.out.println(s1.a);//if we access NS members by initializing null value into 
			//object reference variable we get NPE.
		} 
		catch (NullPointerException e)
		{
			e.printStackTrace();
		}
		System.out.println("End");
	}

}
