package com.relationship;

public class Bike_Ola extends Ola {
	
	Bike_Ola(double distance) {
		super(distance);
	}

   
	@Override
    public void orderRide() {
        super.orderRide();
        System.out.println("Bike selected. Fare: ₹" + (distance * 5));
    }
}
