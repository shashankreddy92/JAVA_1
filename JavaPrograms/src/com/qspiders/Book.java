package com.qspiders;

public class Book {
	String name;
	double price;
	String author;
	
	Book(){
		
	}
	
	public void printBookDetails() {
		System.out.println("Name: "+name);
		System.out.println("Price: "+price);
		System.out.println("Author: "+author);
	}

}
