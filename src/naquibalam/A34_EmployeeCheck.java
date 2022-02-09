package naquibalam;

import java.util.HashSet;
import java.util.Set;

public class A34_EmployeeCheck {
	int employeeID;
	String employeeName;
	
	@Override
	public int hashCode() {
		return employeeID;
	}
	
	@Override
	public String toString() {
		return employeeID + " - " + employeeName;
	}

	A34_EmployeeCheck(int employeeID, String employeeName) {
		this.employeeID = employeeID;
		this.employeeName = employeeName;
	}

	public boolean equals(Object obj) {
		A34_EmployeeCheck emp = (A34_EmployeeCheck) obj;
		return (this.employeeID == emp.employeeID && this.employeeName.equals(emp.employeeName));
	}
	
	public static void main(String[] args) {
		A34_EmployeeCheck a34_EmployeeCheck_1 = new A34_EmployeeCheck(001, "ShahRukh");
		A34_EmployeeCheck a34_EmployeeCheck_2 = new A34_EmployeeCheck(002, "Aamir");
		A34_EmployeeCheck a34_EmployeeCheck_3 = new A34_EmployeeCheck(003, "Salman");
		A34_EmployeeCheck a34_EmployeeCheck_4 = new A34_EmployeeCheck(001, "Aamir");
		A34_EmployeeCheck a34_EmployeeCheck_5 = new A34_EmployeeCheck(003, "Salman");
		Set<A34_EmployeeCheck> hashSet = new HashSet<A34_EmployeeCheck>();
		hashSet.add(a34_EmployeeCheck_1);
		hashSet.add(a34_EmployeeCheck_2);
		hashSet.add(a34_EmployeeCheck_3);
		hashSet.add(a34_EmployeeCheck_4);
		hashSet.add(a34_EmployeeCheck_5);
		System.out.println("-----------------------------------------------------------------------------------------------");
		System.out.println("Total unique employee in organization are : ");
		System.out.println(hashSet.size());
		System.out.println("-----------------------------------------------------------------------------------------------");
		System.out.println("Details of given employees are : ");
		System.out.println(hashSet);
		System.out.println("-----------------------------------------------------------------------------------------------");
	}
}
