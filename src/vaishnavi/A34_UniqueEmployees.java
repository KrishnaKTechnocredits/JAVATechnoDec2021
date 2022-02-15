package vaishnavi;

public class A34_UniqueEmployees {

	int empId;
	String empName;

	public A34_UniqueEmployees(int empId, String empName) {
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
		A34_UniqueEmployees a34_UniqueEmployees= (A34_UniqueEmployees) obj;
		return this.empId==a34_UniqueEmployees.empId && this.empName.equals(a34_UniqueEmployees.empName);
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return empId;
	
	}

}
