package shivangi.Assignment34;

public class Employee {
	
	int empId;
	String empName;
	
	Employee(int empId, String empName){		//constructor to initialize instance variable
		this.empId = empId;
		this.empName = empName;
	}
	
	@Override
	public String toString() {
		return empId + " --> " + empName;
	}
	
	@Override
	public int hashCode() {
		//System.out.println("I am in hashCode");
		return empId;
	}
	
	@Override
	public boolean equals(Object obj) {
		System.out.println("I am in equals");
		Employee emp = (Employee)obj;
		return (this.empId == emp.empId && this.empName.equals(emp.empName));
	}

}
