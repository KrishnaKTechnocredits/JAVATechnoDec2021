package saurav;

import java.util.HashSet;
import java.util.Set;

public class A34_EmployeeInfo {
	
	int empId;
	String empName;
	
	public int hashCode() {
		return empId;
	}
	
	//@override
	public String toString() {
		return empId+" = "+empName;
	}
	
	A34_EmployeeInfo(int empId, String empName){
		this.empId = empId;
		this.empName = empName;
	}
	
	public boolean equals(Object obj) {
		A34_EmployeeInfo info = (A34_EmployeeInfo) obj;
		return (this.empId == info.empId && this.empName.equals(info.empName)) ;
	}
	
	public static void main(String[] args) {
		A34_EmployeeInfo assignment1 = new A34_EmployeeInfo(01, "saurav");
		A34_EmployeeInfo assignment2 = new A34_EmployeeInfo(02, "vaibhav");
		A34_EmployeeInfo assignment3 = new A34_EmployeeInfo(03, "gaurav");
		A34_EmployeeInfo assignment4 = new A34_EmployeeInfo(02, "amey");
		A34_EmployeeInfo assignment5 = new A34_EmployeeInfo(03, "vaibhav");
		A34_EmployeeInfo assignment6 = new A34_EmployeeInfo(03, "gaurav");
		Set<A34_EmployeeInfo> set = new HashSet<>();
		set.add(assignment1);
		set.add(assignment2);
		set.add(assignment3);
		set.add(assignment4);
		set.add(assignment5);
		set.add(assignment6);
		System.out.print("Total Employees = ");
		System.out.println(set.size());
		System.out.println();
		System.out.print("Emp Details : ");
		System.out.println(set);
	}
}
