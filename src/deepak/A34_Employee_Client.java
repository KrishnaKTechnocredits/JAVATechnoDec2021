package deepak;

import java.util.ArrayList;
import java.util.HashSet;

public class A34_Employee_Client {

	HashSet<A34_Employee> getEmployeeInfo() {
		A34_Employee employee1 = new A34_Employee(1, "Maulik");
		A34_Employee employee2 = new A34_Employee(2, "Krishna");
		A34_Employee employee3 = new A34_Employee(3, "Harsh");
		A34_Employee employee4 = new A34_Employee(4, "Amol");
		A34_Employee employee5 = new A34_Employee(2, "Krishna");
		A34_Employee employee6 = new A34_Employee(4, "Amol");
		HashSet<A34_Employee> empList = new HashSet<>();

		empList.add(employee1);
		empList.add(employee2);
		empList.add(employee3);
		empList.add(employee4);
		empList.add(employee5);
		empList.add(employee6);

		return empList;
	}

	public static void main(String[] args) {
		A34_Employee_Client client = new A34_Employee_Client();
		HashSet<A34_Employee> emplList = client.getEmployeeInfo();
		System.out.println("Size of the HashSet is: " + emplList.size());

		for (A34_Employee e : emplList) {
			System.out.println(e);
		}
	}
}
