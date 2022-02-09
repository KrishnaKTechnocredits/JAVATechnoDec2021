package megha;

import java.util.HashSet;
import java.util.Set;

public class Megha_Assignment34 {

	int empId;
	String empName;

	public Megha_Assignment34(int empId, String empName) {
		this.empId = empId;
		this.empName = empName;
	}

	@Override
	public int hashCode() {
		return empId;
	}

	@Override
	public boolean equals(Object obj) {
		Megha_Assignment34 emp = (Megha_Assignment34) obj;
		return (this.empId == emp.empId && this.empName.equals(emp.empName));
	}

	@Override
	public String toString() {
		return empId + " -> " + empName;
	}

	public static void main(String[] args) {
		Megha_Assignment34 emp1 = new Megha_Assignment34(1, "Ramesh");
		Megha_Assignment34 emp2 = new Megha_Assignment34(2, "Suresh");
		Megha_Assignment34 emp3 = new Megha_Assignment34(1, "Paresh");
		Megha_Assignment34 emp4 = new Megha_Assignment34(3, "Mahesh");
		Megha_Assignment34 emp5 = new Megha_Assignment34(2, "Suresh");

		Set<Megha_Assignment34> hset = new HashSet<Megha_Assignment34>();
		hset.add(emp1);
		hset.add(emp2);
		hset.add(emp3);
		hset.add(emp4);
		hset.add(emp5);
		
		System.out.println("Total Employees : " + hset.size());
		System.out.println("The Unique Employee Details are: ");
		System.out.println(hset);
	}
}
