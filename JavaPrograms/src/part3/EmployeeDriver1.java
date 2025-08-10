package part3;

public class EmployeeDriver1 {
	
	public static void main(String[] args) {
		AfterOverridingEqualsMethod e1 = new AfterOverridingEqualsMethod(101);
		AfterOverridingEqualsMethod e2 = new AfterOverridingEqualsMethod(101);
		AfterOverridingEqualsMethod e3 = new AfterOverridingEqualsMethod(102);
		
		System.out.println(e1==e2);
		System.out.println(e1.equals(e2));//after overridng equals() method
		System.out.println(e1.equals(e3));
	}

}
