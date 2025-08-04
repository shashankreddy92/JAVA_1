package com.arrays;

public class SecondLargest {

	public static void main(String[] args) {

		int [] arr = {1,4,3,2,5,1,6,2};
		int largest = arr[0];
		int secondLargest = arr[0];
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] > largest)
			{
				secondLargest = largest;
				largest = arr[i];
			}
			else if(arr[i] > secondLargest || largest == secondLargest)
			{
				if(largest != arr[i])
					secondLargest = arr[i];
			}
		}
		
		System.out.println("Largest: "+largest);
		System.out.println("Second largest: "+ secondLargest);
		
	}

}
