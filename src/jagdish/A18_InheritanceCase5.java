package jagdish;

public class A18_InheritanceCase5 {

	public static void main(String[] args) {
		Class2_Manager manager1 = new Class2_Manager();
		Class1_Employee employee1 = new Class1_Employee();
		// manager1 = employee1;
		System.out.println(manager1.EmployeeId);
		System.out.println(manager1.ManagerId);
		manager1.m1(); // Dynamic Polymorphism- behaviour changed run time,display method of employee
						// class is called .
		manager1.m2();
		manager1.m3();

	}

}
