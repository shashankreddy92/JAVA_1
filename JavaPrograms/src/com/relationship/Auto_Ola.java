package com.relationship;

public class Auto_Ola extends Ola {

	Auto_Ola(double distance) {
		super(distance);
	}
	
	@Override
    public void orderRide() {
        super.orderRide();
        System.out.println("Auto selected. Fare: ₹" + (distance * 10));
    }
}
