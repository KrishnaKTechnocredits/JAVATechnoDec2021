package yogeshNimbalkar;

import java.util.HashSet;

public class A34_EmpClient {

	HashSet<A34_Employee> getAllEmployeeInfo(){
		HashSet<A34_Employee> listOfEmployees = new HashSet<>();
		listOfEmployees.add(new A34_Employee(1,"Yogesh"));
		listOfEmployees.add(new A34_Employee(2,"Rajesh"));
		listOfEmployees.add(new A34_Employee(3,"Sagar"));
		listOfEmployees.add(new A34_Employee(2,"Rajesh"));
		listOfEmployees.add(new A34_Employee(3,"Sagar"));
		listOfEmployees.add(new A34_Employee(3,"Sachin"));
		return listOfEmployees;
	}
	
	public static void main(String[] args) {
		A34_EmpClient empClient = new A34_EmpClient();
		HashSet<A34_Employee> listOfEmployees =  empClient.getAllEmployeeInfo();
		System.out.println("Unique Employee Info : ");
		for(A34_Employee emp : listOfEmployees) {
			System.out.println(emp);
		}
	}
}
