//Need to write a method that will return the list of all employee having unique
package shivangi.Assignment34;
/*
Assignment - 34 : 8th Feb'2022

Write a method to return list of unique Employees.
Employee class should have 2 attribute : empid, empname
unique = same empid, empname.

Hint : Override hashcode and equals method.
Please refer Session-50 recording in case of any doubts.
*/

import java.util.HashSet;

public class Client {
	
	HashSet<Employee> getAllEmployeeInfo(){
		Employee employee1 = new Employee(1, "Shivangi");
		Employee employee2 = new Employee(2, "Anjali");
		Employee employee3 = new Employee(3, "Pooja");
		Employee employee4 = new Employee(4, "Amruta");
		Employee employee5 = new Employee(4, "Amruta");
		Employee employee6 = new Employee(3, "Deepak");
		
		HashSet<Employee> listOfEmployee = new HashSet<Employee>();
		listOfEmployee.add(employee1);  
		listOfEmployee.add(employee2);//employee1.hashCode() == employee2.hashCode() //student1.equals(student2)
		listOfEmployee.add(employee3);
		listOfEmployee.add(employee4);
		listOfEmployee.add(employee5); //already existing record will not add
		listOfEmployee.add(employee6);
		
		return listOfEmployee;
	}
	
	public static void main(String[] args) {
		Client client = new Client();
		HashSet<Employee> listOfEmployee = client.getAllEmployeeInfo();
		System.out.println();
		System.out.println("Total unique employees are : " + listOfEmployee.size());
		System.out.println();
		System.out.println("Unique Employees are : ");
		for(Employee e : listOfEmployee) {
			System.out.println(e);      //e.toString() will call automatically of Student class(overridden)
		}
	}
	
}
