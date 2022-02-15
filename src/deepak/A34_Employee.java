package deepak;

public class A34_Employee {

	int employeeID;
	String empName;

	public A34_Employee(int employeeID, String empName) {
		super();
		this.employeeID = employeeID;
		this.empName = empName;
	}

	public String toString() {
		return employeeID + "--" + empName;
	}

	public int hashCode() {
		return employeeID;
	}

	public boolean equals(Object obj) {
		A34_Employee employee = (A34_Employee) obj;
		return this.employeeID == employee.employeeID && this.empName == employee.empName;
	}

}
