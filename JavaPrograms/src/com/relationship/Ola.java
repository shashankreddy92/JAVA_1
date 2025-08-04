package com.relationship;

public class Ola {
	double distance;
	
	Ola(double distance) {
        this.distance = distance;
    }

    public void orderRide() {
        System.out.println("Ride booked for " + distance + " km.");
    }

}
