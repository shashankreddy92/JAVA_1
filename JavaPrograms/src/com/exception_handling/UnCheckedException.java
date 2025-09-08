package com.exception_handling;

public class UnCheckedException {//exception propagated implicitly
	
	public static void view() throws ArithmeticException //throws ArithmeticException//this happens implicitly
								//no need to write throws AE
	{
		sample();
	}
	public static void sample() throws ArithmeticException // throws ArithmeticException
	{
		System.out.println(10/0);
	}
	
	public static void main(String[] args) {
		view();
	}

}
