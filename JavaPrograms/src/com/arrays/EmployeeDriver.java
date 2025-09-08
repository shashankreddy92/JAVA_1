package com.arrays;

public class EmployeeDriver {
	public static void main(String[] args) {
		Employee e1 = new Employee("Emma",101,25000.0);
		Employee e2 = new Employee("Sai",102,20000.0);
		Employee e3 = new Employee("Mahesh",103,25000.0);
		Employee e4 = new Employee("Arjun",104,29000.0);
		Employee e5 = new Employee("Anne",105,28000.0);
		
		Employee[] e = {e1,e2,e3,e4,e5};
		
		for(int i =0;i<e.length;i++) {
			if(e[i].salary>=20000 && e[i].salary<=30000) {
				System.out.println((e[i].name));
			}
		}
	}
}
