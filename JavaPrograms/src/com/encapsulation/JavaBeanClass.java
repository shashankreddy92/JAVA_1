package com.encapsulation;

public class JavaBeanClass {
	//Class should be public access specifier
	//Constructor is optional inside Java Bean Class
	//Class should contain public Getters and Setters methods
	
	private String name;//All the prop. should be private access specifier
	private int empid;
	private double salary;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int getEmpId() {
		return empid;
	}
	public void setEmpId(int empid)
	{
		this.empid = empid;
	}
	
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		if(salary > 0.0)
		this.salary = salary;
		else
			System.out.println("Invalid data");
	}
}
