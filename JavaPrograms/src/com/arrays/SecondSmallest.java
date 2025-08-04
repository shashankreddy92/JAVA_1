package com.arrays;

public class SecondSmallest {
	
	public static void main(String[] args) {
		
		int [] arr = {1,4,3,2,5,1,6,2};
		int smallest = arr[0];
		int secondSmallest = arr[0];
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]<smallest)
			{
				secondSmallest = smallest;
				smallest = arr[i];
			}
			else if(arr[i] < secondSmallest || smallest == secondSmallest)
			{
				if(smallest != arr[i])
				{
					secondSmallest = arr[i];
				}
			}
		}
		
		System.out.println("Smallest: "+smallest);
		System.out.println("Second smallest: "+ secondSmallest);
	}

}
