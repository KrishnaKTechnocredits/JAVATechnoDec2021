/*Assignment - 34 : 8th Feb'2022

Write a method to return list of unique Employees.
Employee class should have 2 attribute : empid, empname
unique = same empid, empname.

Hint : Override hashcode and equals method.
*/

package pallavi;

import java.util.HashSet;

public class A34_HashCodeOverride {

	int empId;
	String empName;

	A34_HashCodeOverride(int empId, String empName) {
		this.empId = empId;
		this.empName = empName;
	}

	@Override
	public String toString() {
		return empId + "-->" + empName;

	}

	@Override
	public boolean equals(Object obj) {
		A34_HashCodeOverride emp = (A34_HashCodeOverride) obj;
		if (emp.empId == this.empId && empName.equals(this.empName))
			return true;
		else
			return false;

	}

	@Override
	public int hashCode() {
		return empId;
	}

	public static void main(String[] args) {
		A34_HashCodeOverride emp1 = new A34_HashCodeOverride(1, "Pallavi");
		A34_HashCodeOverride emp2 = new A34_HashCodeOverride(2, "Parag");
		A34_HashCodeOverride emp3 = new A34_HashCodeOverride(3, "Prajakta");
		A34_HashCodeOverride emp4 = new A34_HashCodeOverride(4, "Arjun");
		A34_HashCodeOverride emp5 = new A34_HashCodeOverride(1, "Amit");
		A34_HashCodeOverride emp6 = new A34_HashCodeOverride(4, "Pallavi");

		HashSet<A34_HashCodeOverride> employeeDetails = new HashSet<A34_HashCodeOverride>();
		employeeDetails.add(emp1);
		employeeDetails.add(emp2);
		employeeDetails.add(emp3);
		employeeDetails.add(emp4);
		employeeDetails.add(emp5);
		employeeDetails.add(emp6);

		System.out.println("TOtal Employees:-" + employeeDetails.size());
		System.out.println("List of Employees:-");
		System.out.println(employeeDetails);
	}

}
