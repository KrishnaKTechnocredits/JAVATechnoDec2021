package nehaPandey;

//Write a method to return list of unique Employees.
//Employee class should have 2 attribute : empid, empname
//unique = same empid, empname.
//Hint : Override hashcode and equals method.

import java.util.HashSet;

public class A34_Employee_Details {

	int empId;
	String empName;

	public A34_Employee_Details(int empId, String empName) {

		this.empId = empId;
		this.empName = empName;
	}

	@Override
	public int hashCode() {
		return empId;
	}

	@Override
	public String toString() {
		return empId + " -> " + empName;
	}

	@Override
	public boolean equals(Object obj) {
		A34_Employee_Details employee = (A34_Employee_Details) obj;
		return (this.empId == employee.empId && this.empName.equals(employee.empName));

	}

	public static void main(String[] args) {
		A34_Employee_Details emp1 = new A34_Employee_Details(1, "Yogesh");
		A34_Employee_Details emp2 = new A34_Employee_Details(2, "Megha");
		A34_Employee_Details emp3 = new A34_Employee_Details(3, "Neha");
		A34_Employee_Details emp4 = new A34_Employee_Details(4, "Anvit");
		A34_Employee_Details emp5 = new A34_Employee_Details(1, "Yogesh");
		A34_Employee_Details emp6 = new A34_Employee_Details(5, "Neha");

		HashSet<A34_Employee_Details> setOfEmployee = new HashSet<A34_Employee_Details>();
		setOfEmployee.add(emp1);
		setOfEmployee.add(emp2);
		setOfEmployee.add(emp3);
		setOfEmployee.add(emp4);
		setOfEmployee.add(emp5);
		setOfEmployee.add(emp6);

		System.out.println("Total Employees : " + setOfEmployee.size());
		System.out.println("List of Unique Employee are : " + setOfEmployee);

	}

}
