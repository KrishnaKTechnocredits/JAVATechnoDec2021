package rohini;

import java.util.ArrayList;
import java.util.HashSet;

/*Assignment - 34 : 8th Feb'2022

Write a method to return list of unique Employees.
Employee class should have 2 attribute : empid, empname
unique = same empid, empname.

Hint : Override hashcode and equals method.
Please refer Session-50 recording in case of any doubts.
 */

public class Rohini_Assignment34 {

	int empid;String empname;

	Rohini_Assignment34(int empid,String empname){
		this.empid=empid;
		this.empname=empname;
	}


	public String toString() {
		return empid+" -- "+empname;

	}

	@Override
	public boolean equals(Object obj) {
		Rohini_Assignment34 emp=(Rohini_Assignment34)obj;

		return this.empid==emp.empid && this.empname==emp.empname;

	}

	@Override
	public int hashCode() {
		return empid;
	}


	public static void main(String[] args) {

		HashSet<Rohini_Assignment34> employee = new HashSet<Rohini_Assignment34>();

		Rohini_Assignment34 emp = new Rohini_Assignment34(1,"Rohini");
		Rohini_Assignment34 emp1 = new Rohini_Assignment34(2,"Mohini");
		Rohini_Assignment34 emp2 = new Rohini_Assignment34(1,"Rohini");
		Rohini_Assignment34 emp3 = new Rohini_Assignment34(4,"Mayank");
		employee.add(emp);
		employee.add(emp2);
		employee.add(emp3);
		employee.add(emp1);

		System.out.println("Input Data: 1-->ROhini,2-->Mohini,1-->Rohini,4-->Mayank \n");

		System.out.println("Name of Unique Employees are: ");
		for(Rohini_Assignment34 e:employee) {
			System.out.println(e);
		}


		System.out.println("Total Unique Employee: "+employee.size());
	}

}
