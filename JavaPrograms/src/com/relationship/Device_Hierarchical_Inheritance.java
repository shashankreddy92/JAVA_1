package com.relationship;

public class Device_Hierarchical_Inheritance {
	
	String brand;
	double price;
	
	Device_Hierarchical_Inheritance(String name, double price){
		this.brand = name;
		this.price = price;
	}
	public void printDeviceDetails() {
		System.out.println("Brand : "+ brand);
		System.out.println("Price: "+ price);
	}

}
