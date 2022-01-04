package jagdish;

public class A18_InheritanceCase3 {

	public static void main(String[] args) {

		Class1_Employee case3 = new Class2_Manager();
		System.out.println(case3.EmployeeId);
		System.out.println(case3.Name); // Dynamic Polymorphism - Variable(Property) hold the value at runtime
		// System.out.println(case3.ManagerId);
		case3.m1(); // //Dynamic polymorphism - in this case behaviour change during rum time
		case3.m2();
	}
}
