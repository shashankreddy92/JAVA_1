package com.exception_handling;

public class Test {
	public static void main(String[] args) {
		System.out.println("Start");
		int [] arr = {18,7,10};
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		try {
		System.out.println(arr[3]);
		}
		catch(RuntimeException e) {
			e.printStackTrace();
	}
		System.out.println("End");

}
}
