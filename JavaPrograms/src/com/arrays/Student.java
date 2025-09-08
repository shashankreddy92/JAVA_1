package com.arrays;

public class Student {
	
	String name;
	int sid;
	int marks;

	Student(String name,int sid,int marks){
		this.name=name;
		this.sid=sid;
		this.marks=marks;
	}
	
	@Override
	public String toString() {
		return "NAME: "+name+"\nStudentID: "+sid+"\nMarks: "+marks+"\n";
	}
}
