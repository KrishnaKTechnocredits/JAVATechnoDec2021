package sagarShrikhande.collections1;

import java.util.HashSet;
import java.util.Set;

public class A34_Employee {
	int empid;
	String empname;

	public A34_Employee(int empid, String empname) {
		this.empid = empid;
		this.empname = empname;
	}

	@Override
	public int hashCode() {
		return empid;
	}

	public boolean equals(Object obj) {
		A34_Employee emp = (A34_Employee) obj;
		return (this.empid == emp.empid && this.empname.equals(emp.empname));
	}
	
	@Override
	public String toString() {
		return empid + "->" + empname;
	}

	public static void main(String[] args) {
		A34_Employee employee1 = new A34_Employee(1001, "Sagar");
		A34_Employee employee2 = new A34_Employee(1002, "Rakhi");
		A34_Employee employee3 = new A34_Employee(1003, "Kaustuki");
		A34_Employee employee4 = new A34_Employee(1001, "Rakhi");
		A34_Employee employee5 = new A34_Employee(1003, "Kaustuki");

		Set<A34_Employee> hs = new HashSet<A34_Employee>();
		hs.add(employee1);
		hs.add(employee2);
		hs.add(employee3);
		hs.add(employee4);
		hs.add(employee5);

		System.out.println("Total Num of Unique Employees are: " + hs.size());
		System.out.println("Employee details are: " + hs);
	}
}
/*
 * Assignment - 34 : 8th Feb'2022 Write a method to return list of unique
 * A34_Employees. A34_Employee class should have 2 attribute : empid, empname
 * unique = same empid, empname. Hint : Override hashcode and equals method.
 * Please refer Session-50 recording in case of any doubts.
 */