package com.relationship;

public class Car {
	String brand;
	String color;
	Engine e;//has-a relationship
	
	Car(String brand,String color,String fuelType){
		this.color = color;
		this.brand = brand;
		e = new Engine(fuelType);//early instantiation
	}

}
