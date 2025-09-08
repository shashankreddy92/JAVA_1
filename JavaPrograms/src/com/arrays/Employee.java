package com.arrays;

public class Employee {
	String name;
	int empid;
	double salary;
	
	Employee(String name,int empid,double salary){
		this.name = name;
		this.empid = empid;
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		return "Name:"+name+"/nEmpid:"+empid+"/nSalary"+salary+"/n";
	}

}
