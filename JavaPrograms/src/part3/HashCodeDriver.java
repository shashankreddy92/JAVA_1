package part3;

public class HashCodeDriver {
	public static void main(String[] args) {
		
		HashCode s1 = new HashCode("Ramesh",101);//every object is having unique integer representation 
		HashCode s2 = new HashCode("Ramesh", 101);
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		
	}
	
	

}
