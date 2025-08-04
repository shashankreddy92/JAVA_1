package com.relationship;

public class Mobile extends Device_Hierarchical_Inheritance {

	int cameraMP;
	Mobile(String brand,double price, int cameraMP){
		super(brand,price);
		this.cameraMP =cameraMP;
	}
	
	public void printMobileDetails() {
		printDeviceDetails();
		System.out.println("Camera: "+ cameraMP);
	}
	
}
