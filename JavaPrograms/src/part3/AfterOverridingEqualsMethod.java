package part3;

public class AfterOverridingEqualsMethod {
	int empid;
	AfterOverridingEqualsMethod(int empid){
		this.empid = empid;
	}
		@Override
		public boolean equals(Object o) {
			AfterOverridingEqualsMethod e = (AfterOverridingEqualsMethod) o;
			return this.empid == e.empid;
			
		}
	
}

