package com.encapsulation;

public class Person_FM {
	
	String name;
	int age;
	char gender;
	
	public Person_FM(String name, int age, char gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	public void printPersonDetails() {
		System.out.println("Name: " +name);
		System.out.println("Age: " +age);
		System.out.println("Gender: " +gender);
		System.out.println();
	}
	
	

}
