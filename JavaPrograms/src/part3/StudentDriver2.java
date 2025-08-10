package part3;

public class StudentDriver2 {
	public static void main(String[] args) {
		Student2 s1 = new Student2("sai",101);
		Student2 s2 = new Student2("Ramesh",101);
		
		System.out.println(s1.equals(s2));
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s1);
		System.out.println(s2);
	}

}
