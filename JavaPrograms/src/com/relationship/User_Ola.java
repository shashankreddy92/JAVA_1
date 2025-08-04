package com.relationship;

import java.util.Scanner;

public class User_Ola {	

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Ola!");
        System.out.println("Choose your ride type:");
        System.out.println("1. Car");
        System.out.println("2. Auto");
        System.out.println("3. Bike");

        int choice = scanner.nextInt();
        
        System.out.print("Enter distance (in km): ");
        double distance = scanner.nextDouble();

        Ola selectedRide = null;
        
        switch (choice) {
        case 1:
            selectedRide = new Car_Ola(distance);
            break;
        case 2:
            selectedRide = new Auto_Ola(distance);
            break;
        case 3:
            selectedRide = new Bike_Ola(distance);
            break;
        default:
            System.out.println("Invalid choice. Please select 1, 2, or 3.");
            System.exit(0);
    }

    printRideDetails(selectedRide);
    scanner.close();
	}
	public static void printRideDetails(Ola ride) {
        if (ride instanceof Car_Ola) {
            System.out.println(">> Car ride:");
        } else if (ride instanceof Auto_Ola) {
            System.out.println(">> Auto ride:");
        } else if (ride instanceof Bike_Ola) {
            System.out.println(">> Bike ride:");
        }

        ride.orderRide();
        System.out.println("-----------------------");
	}
}

