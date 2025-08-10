package part3;

public class StudentDriver {
	
	public static void main(String[] args) {
		Student s1 = new Student();
		System.out.println(s1.toString());//by default toString() returns String representation of Object 
		//in the form of FullyQualifiedClassName@HexaDecimalValueOfHashCode
		System.out.println(s1);
		Student s2 = new Student();
		System.out.println(s2);
	}

}
