package part3;

import java.util.Objects;

public class Student2 {
	String name;
	int sid;
	Student2(String name,int sid){
		this.name= name;
		this.sid = sid;
	}
	
	@Override
	public boolean equals(Object o) {
		Student2 s = (Student2)o;
		return this.sid == s.sid && this.name==s.name;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(name,sid);
	}

}
