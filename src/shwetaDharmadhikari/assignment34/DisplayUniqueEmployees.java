/*Assignment - 34 : 8th Feb'2022

Write a method to return list of unique Employees.
Employee class should have 2 attribute : empid, empname
unique = same empid, empname.

Hint : Override hashcode and equals method.
Please refer Session-50 recording in case of any doubts.
 */
package shwetaDharmadhikari.assignment34;

import java.util.HashSet;
import java.util.Set;

public class DisplayUniqueEmployees {
	int empid;
	String empname;

	public DisplayUniqueEmployees(int empid, String empname) {
		this.empid = empid;
		this.empname = empname;
	}

	public int hashCode() {
		return empid;
	}

	public boolean equals(Object obj) {
		DisplayUniqueEmployees employee = (DisplayUniqueEmployees) obj;
		return (this.empid == employee.empid && this.empname.equals(employee.empname));
	}

	public String toString() {
		return empid + " - " + empname;
	}

	public static void main(String[] args) {
		DisplayUniqueEmployees employee1 = new DisplayUniqueEmployees(100, "Shweta");
		DisplayUniqueEmployees employee2 = new DisplayUniqueEmployees(101, "Shalaka");
		DisplayUniqueEmployees employee3 = new DisplayUniqueEmployees(101, "Shashank");
		DisplayUniqueEmployees employee4 = new DisplayUniqueEmployees(102, "Sham");
		DisplayUniqueEmployees employee5 = new DisplayUniqueEmployees(100, "Shalaka");
		Set<DisplayUniqueEmployees> hs = new HashSet<DisplayUniqueEmployees>();
		hs.add(employee1);
		hs.add(employee2);
		hs.add(employee3);
		hs.add(employee4);
		hs.add(employee5);
		System.out.println("Unique Employees are: " + hs.size());
		System.out.println();
		System.out.println("Details Of Employees: " + hs);
	}
}
