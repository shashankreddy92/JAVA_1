package com.encapsulation;

public class PhonePe_User {

	public static void main(String[] args) {

		PhonePe p = new PhonePe();
		double d = p.getBalance();
		
		if(d!=-1)
		{
			System.out.println("Available balance: "+d+" Rs");
		}
		else
		{
			System.out.println("Invalid upi pin");
		}
		
	}

}
