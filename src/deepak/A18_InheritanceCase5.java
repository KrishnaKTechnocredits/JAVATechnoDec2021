package deepak;

public class A18_InheritanceCase5 {

	public static void main(String[] args) {
		A18_InheritanceManager manager = new A18_InheritanceManager();
		A18_InheritanceEmployee employee = new A18_InheritanceEmployee();
		manager = employee; // Dynamic Polymorphism, this is similar to Case3

		System.out.println(manager.managerID);
		System.out.println(manager.name); // Here property is never overloaded, only method changes after dynamic
											// polymorphism.
		// System.out.println(manager.employeeID); // Manager class is not able to take
		// guarantee of this variable.

		manager.m1(); // Here method behavior changed on run time.
		manager.m2();
		// manager.m3(); // Manager class is not able to take guarantee of this method.

	}

}
