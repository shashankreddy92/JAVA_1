package part3;

import java.util.Objects;

public class Product {
	
	String name;
	int pid;
	double price;
	double ratings;
	
	Product(String name,int pid,double price,double ratings){
		this.name = name;
		this.pid = pid;
		this.price = price;
		this.ratings = ratings;
}
	@Override
	public String toString() {
		return "Name: "+name+"\nPID: "+pid+"\nPrice: "+price+"\nRatings: "+ratings;
	}
	
	@Override
	public boolean equals(Object o) {
		Product p = (Product)o;
		return this.pid==p.pid;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(name,pid,price,ratings);
	}
	
}