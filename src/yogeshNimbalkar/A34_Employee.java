package yogeshNimbalkar;

public class A34_Employee {

	int empid;
	String empname;
	
	public A34_Employee(int empid, String empname) {
		this.empid = empid;
		this.empname = empname;
	}

	@Override
	public String toString() {
		return empid + " - " + empname;
	}
	
	@Override
	public int hashCode() {
		return empid;
	}
	
	@Override
	public boolean equals(Object obj) {
		A34_Employee employee = (A34_Employee) obj;
		return (this.empid == employee.empid && this.empname.equals(employee.empname));
	}
}
