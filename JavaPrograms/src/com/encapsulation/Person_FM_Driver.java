package com.encapsulation;

public class Person_FM_Driver {
	
	//Factory method
	public static Person_FM createObject(String name, int age, char gender) {
		return new Person_FM(name, age, gender);
	}

	public static void main(String[] args) {
		Person_FM p1 = createObject("Emma", 21, 'F');
		p1.printPersonDetails();
		
		Person_FM p2 = createObject("Shashank", 31, 'M');
		p2.printPersonDetails();
		
		
	}

}
