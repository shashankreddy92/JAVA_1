package part3;

public class EmployeeDriver {

	public static void main(String[] args) {

		Employee e1 = new Employee(101);
		Employee e2 = new Employee(102);
		
		System.out.println(e1==e2);//equals operator compares object address
		System.out.println(e1.equals(e2));//equals() method by default compares object address
		//to compare states of object one should override equals() method
	}

}
