package jagdish;

public class A18_InheritanceCase6 {

	public static void main(String[] args) {
		Class2_Manager manager1 = new Class2_Manager(); // child
		Class1_Employee employee1 = new Class1_Employee(); // PArent
		manager1 = (Class2_Manager) employee1; // type-cast
		System.out.println(manager1.EmployeeId);
		System.out.println(manager1.ManagerId);
		manager1.m1();
		manager1.m2();
		manager1.m3();
	}

}
