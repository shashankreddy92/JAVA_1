package com.qspiders;

public class BookDriver {

	public static void main(String[] args) {

		Book b1 = new Book();
		Book b2 = new Book();
		//Initializing properties of object by Object Reference Variable
		b1.name = "KGF-3";
		b1.price = 200.0;
		b1.author = "P.Neel";
		b2.name = "RRR";
		b2.price = 150.0;
		b2.author = "SSR";
		b1.printBookDetails();
		b2.printBookDetails();
		
	}

}
