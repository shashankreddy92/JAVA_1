package com.relationship;

public class Bag {
	
	String brand;
	double price;
	Book b; //has-a relationship
	
	Bag(String brand,double price){
		//LOI
		this.brand = brand;
		this.price = price;
	}
	
	public void addBook(String name,String author) {
		b = new Book(name,author);//(Aggregation)
	}
	

}
