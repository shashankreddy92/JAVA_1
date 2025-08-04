package com.relationship;

public class Car_Ola extends Ola {

	Car_Ola(double distance) {
		super(distance);
		}
	
	@Override
    public void orderRide() {
        super.orderRide();
        System.out.println("Car selected. Fare: ₹" + (distance * 15));
    }
	
	

}
