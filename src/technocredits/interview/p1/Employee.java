package technocredits.interview.p1;

public class Employee {

	int empid;
	String firstName;
	String lastName;
	String uname;
	
	public Employee(int empid, String firstName, String lastName, String uname) {
		this.empid = empid;
		this.firstName = firstName;
		this.lastName = lastName;
		this.uname = uname;
	}
	
	public String toString() {
		return empid + "--" + firstName;
	}
}
