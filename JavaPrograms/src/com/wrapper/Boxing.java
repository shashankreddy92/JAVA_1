package com.wrapper;

public class Boxing {
	public static void main(String[] args) {
		int a = 40;
		Integer b = Integer.valueOf(a);//Boxing
		int c = b.intValue();//Un-boxing
		System.out.println(b);
		System.out.println(c);
		
		
	}

}
