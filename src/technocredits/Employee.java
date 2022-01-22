package technocredits;

public class Employee {

	String firstName, lastName;
	int empid;
	static int objCount;
	
	Employee(String firstName, String lastName, int empid){
		this.firstName = firstName;
		this.lastName = lastName;
		this.empid = empid;
		objCount++;
	}

	public String toString() {
		return firstName + "-" + lastName + "-" + empid;
	}
	
}
