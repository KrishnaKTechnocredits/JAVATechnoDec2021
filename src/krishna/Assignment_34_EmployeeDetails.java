package krishna;

import java.util.HashSet;

import java.util.Set;

public class Assignment_34_EmployeeDetails {
	int empId;
	String empName;

	@Override
	public int hashCode() {
		return empId;
	}

	@Override
	public String toString() {
		return empId + " --> " + empName;
	}

	Assignment_34_EmployeeDetails(int employeeID, String employeeName) {
		this.empId = employeeID;
		this.empName = employeeName;
	}

	public boolean equals(Object obj) {
		Assignment_34_EmployeeDetails emp = (Assignment_34_EmployeeDetails) obj;
		return (this.empId == emp.empId && this.empName.equals(emp.empName));
	}

	public static void main(String[] args) {
		Assignment_34_EmployeeDetails ass1 = new Assignment_34_EmployeeDetails(101, "Krishna");
		Assignment_34_EmployeeDetails ass2 = new Assignment_34_EmployeeDetails(102, "Viswas");
		Assignment_34_EmployeeDetails ass3 = new Assignment_34_EmployeeDetails(103, "Samir");
		Assignment_34_EmployeeDetails ass4 = new Assignment_34_EmployeeDetails(101, "Arjun");
		Assignment_34_EmployeeDetails ass5 = new Assignment_34_EmployeeDetails(102, "Viswas");
		
		Set<Assignment_34_EmployeeDetails> hashSet = new HashSet<Assignment_34_EmployeeDetails>();
		hashSet.add(ass1);
		hashSet.add(ass2);
		hashSet.add(ass3);
		hashSet.add(ass4);
		hashSet.add(ass5);
		
		System.out.print("Total unique employee present in organization are :- ");
		System.out.println(hashSet.size());
		System.out.println("----------------------------------------------------------------------------------------");
		System.out.print("Details of present employees are :- ");
		System.out.println(hashSet);
		System.out.println("----------------------------------------------------------------------------------------");
	}
}
