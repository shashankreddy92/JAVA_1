package part3;

public class ProductDriver {
	
	public static void main(String[] args) {
		Product p1 = new Product("iPhone", 101, 100.0, 4.5);
		Product p2 = new Product("Samsung", 102, 50.0, 3.5);
		System.out.println(p1.equals(p2));
		System.out.println(p1.hashCode());
		System.out.println(p2.hashCode());
		System.out.println(p1);
		System.out.println("-----------------");
		System.out.println(p2);
	}

}
