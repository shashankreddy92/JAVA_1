package com.relationship;

public class CarDriver {

	public static void main(String[] args) {

		Car c1 = new Car("BMW","Black","Petrol");
		System.out.println(c1);
		System.out.println(c1.brand);
		System.out.println(c1.color);
		System.out.println(c1.e);
		System.out.println(c1.e.fuelType);
		
	}

}
