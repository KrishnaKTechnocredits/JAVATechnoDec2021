package pradeep.A34;

import java.util.HashSet;

public class Client {

	HashSet<Employee> getAllEmployeeInfo() {

		Employee e1 = new Employee(1, "pradeep");
		Employee e2 = new Employee(2, "yogesh");
		Employee e3 = new Employee(3, "rahul");
		Employee e4 = new Employee(1, "pradeep");
		Employee e5 = new Employee(1, "rajesh");
		Employee e6 = new Employee(1, "pradeep");
		Employee e7 = new Employee(2, "yogesh");
		Employee e8 = new Employee(5, "rahul");
		Employee e9 = new Employee(6, "pradeep");
		Employee e10 = new Employee(1, "rajesh");

		HashSet<Employee> setOfEmployee = new HashSet<>();
		setOfEmployee.add(e1);
		setOfEmployee.add(e2);
		setOfEmployee.add(e3);
		setOfEmployee.add(e4);
		setOfEmployee.add(e5);
		setOfEmployee.add(e6);
		setOfEmployee.add(e7);
		setOfEmployee.add(e8);
		setOfEmployee.add(e9);
		setOfEmployee.add(e10);

		return setOfEmployee;
	}

	public static void main(String[] args) {
		Client client = new Client();
		HashSet<Employee> setOfEmployee = client.getAllEmployeeInfo();
		System.out.println("Total Employee: " + setOfEmployee.size());
		for (Employee employee : setOfEmployee)
			System.out.println(employee.empid + "--" + employee.empName);
	}

}
