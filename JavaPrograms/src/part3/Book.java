package part3;

public class Book {
	String name;
	int bid;
	double price;
	
	 Book(String name,int bid,double price) {
		 this.name = name;
		 this.bid = bid;
		 this.price = price;
	}
	 @Override
	 public String toString() {
		 return "Name: "+name+"\nBID: "+bid+"\nPrice: "+price+"\n";
	 }
}
