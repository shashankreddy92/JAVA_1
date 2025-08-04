package com.encapsulation;

import java.beans.JavaBean;

public class JavaBeanClass_Driver {

	public static void main(String[] args) {

		JavaBeanClass e1 = new JavaBeanClass();
		e1.setName("Shashank");
		e1.setEmpId(2005);
		e1.setSalary(12000);
		System.out.println("Name: "+e1.getName());
		System.out.println("EmpId: "+e1.getEmpId());
		System.out.println("Salary: "+e1.getSalary());
		
	}

}
