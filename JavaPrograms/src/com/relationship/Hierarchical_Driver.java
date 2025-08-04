package com.relationship;

public class Hierarchical_Driver {

	public static void main(String[] args) {

		Laptop l1 = new Laptop("HP", 240.0,512);
		l1.printLaptopDetails();
		
		Mobile m1 = new Mobile("iPhone", 500.0, 128);
		m1.printMobileDetails();
		
	}

	

}
