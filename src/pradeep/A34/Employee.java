package pradeep.A34;

public class Employee {
	int empid;
	String empName;

	public Employee(int empid, String empName) {
		super();
		this.empid = empid;
		this.empName = empName;
	}

	@Override
	public int hashCode() {
		return empid;
	}

	@Override
	public boolean equals(Object obj) {
		Employee employee = (Employee) obj;
		return this.empName == employee.empName;
	}
}
