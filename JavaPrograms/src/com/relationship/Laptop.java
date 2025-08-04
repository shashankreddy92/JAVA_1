package com.relationship;

public class Laptop extends Device_Hierarchical_Inheritance {

	int ssid;
	
	Laptop(String brand, double price, int ssid) {
		super(brand, price);
		this.ssid = ssid;
	}
	
	public void printLaptopDetails() {
		printDeviceDetails();
		System.out.println("SSID: "+ ssid);
	}

}
