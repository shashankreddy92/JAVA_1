package com.relationship;

public class Laptop extends Device_Hierarchical_Inheritance {

	int ssd;
	
	Laptop(String brand, double price, int ssd) {
		super(brand, price);
		this.ssd = ssd;
	}
	
	public void printLaptopDetails() {
		printDeviceDetails();
		System.out.println("SSD: "+ ssd);
	}

}
