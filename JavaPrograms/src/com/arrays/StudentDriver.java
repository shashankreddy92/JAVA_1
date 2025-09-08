package com.arrays;

public class StudentDriver {
	public static void main(String[] args) {
		Student[] s = new Student[4];
		
		s[0] = new Student("sai",101,35);
		s[1] = new Student("emma",102,30);
		s[2] = new Student("mahi",103,40);
		s[3] = new Student("anne",104,50);

		Student max = s[0];
		for(int i =0;i<s.length;i++) {
			if(s[i].marks>max.marks)
			{
				max = s[i];
			}
		}
		System.out.println(max);
		
	}
}
