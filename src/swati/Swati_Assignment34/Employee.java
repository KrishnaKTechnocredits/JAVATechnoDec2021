package swati.Swati_Assignment34;

import java.util.ArrayList;

public class Employee {

	int empId;
	String empName;
	
	public Employee(int empId, String empName) {
		this.empId = empId;
		this.empName = empName;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return +empId +" and " +empName ;
	}

	@Override
	public boolean equals(Object obj) {
		Employee e= (Employee) obj;
		return this.empId==e.empId && this.empName.equals(e.empName);
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return empId;
	}
	
	
	
	
}
