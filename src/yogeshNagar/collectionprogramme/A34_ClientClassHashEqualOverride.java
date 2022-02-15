package yogeshNagar.collectionprogramme;

import java.util.HashSet;
import java.util.Set;

public class A34_ClientClassHashEqualOverride {
	
	Set<A34_Employee> employeeDetails() {
		A34_Employee emp1 = new A34_Employee(1,"Yogesh");
		A34_Employee emp2 = new A34_Employee(2,"Maulik");
		A34_Employee emp3 = new A34_Employee(3,"Harsh");
		A34_Employee emp4 = new A34_Employee(1,"Yogesh");
		A34_Employee emp5 = new A34_Employee(1,"Krishna");
		
		Set<A34_Employee> listOfEmployee = new HashSet<A34_Employee>();
		listOfEmployee.add(emp1);
		listOfEmployee.add(emp2);
		listOfEmployee.add(emp3);
		listOfEmployee.add(emp4);
		listOfEmployee.add(emp5);
		
		return listOfEmployee;
	}
	public static void main(String[] args) {
		A34_ClientClassHashEqualOverride empDetails = new A34_ClientClassHashEqualOverride();
		System.out.println("Total number of employee are "+empDetails.employeeDetails().size());
		System.out.println("Employee Detail is "+empDetails.employeeDetails());
	}
}