package anvit;

import java.util.HashSet;
import java.util.Set;

public class A34_Unique_Employee {

	int empId;
	String empName;

	A34_Unique_Employee(int employeeID, String employeeName) {
		this.empId = employeeID;
		this.empName = employeeName;
	}

	@Override
	public int hashCode() {
		return empId;
	}

	@Override
	public boolean equals(Object obj) {
		A34_Unique_Employee emp = (A34_Unique_Employee) obj;
		return (this.empId == emp.empId && this.empName.equals(emp.empName));
	}

	@Override
	public String toString() {
		return empId + " -> " + empName;
	}

	public static void main(String[] args) {
		A34_Unique_Employee a34_EmployeeCheck_1 = new A34_Unique_Employee(001, "Anvit");
		A34_Unique_Employee a34_EmployeeCheck_2 = new A34_Unique_Employee(002, "Krishna");
		A34_Unique_Employee a34_EmployeeCheck_3 = new A34_Unique_Employee(003, "Maulik");
		A34_Unique_Employee a34_EmployeeCheck_4 = new A34_Unique_Employee(001, "Harsh");
		A34_Unique_Employee a34_EmployeeCheck_5 = new A34_Unique_Employee(003, "Maulik");
		Set<A34_Unique_Employee> hashSet = new HashSet<A34_Unique_Employee>();
		hashSet.add(a34_EmployeeCheck_1);
		hashSet.add(a34_EmployeeCheck_2);
		hashSet.add(a34_EmployeeCheck_3);
		hashSet.add(a34_EmployeeCheck_4);
		hashSet.add(a34_EmployeeCheck_5);
		System.out.println();
		System.out.println("Unique employee are : ");
		System.out.println(hashSet.size());
		System.out.println();
		System.out.println("Details are : ");
		System.out.println(hashSet);

	}
}
