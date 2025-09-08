package com.exception_handling;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class CheckedException {
	public static void view() throws FileNotFoundException
	{
		sample();
	}
	public static void sample() throws FileNotFoundException {
		FileReader fr = new FileReader("C://Java//Test.txt");
	}
	public static void main(String[] args) throws FileNotFoundException {
		System.out.println("Start");
		
		try{
			view();
		}
		catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		System.out.println("end");
	}
}
