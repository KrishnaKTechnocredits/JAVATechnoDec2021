package deepak;

public class A18_InheritanceCase3 {

	public static void main(String[] args) {
		A18_InheritanceManager manager = new A18_InheritanceEmployee(); // Dynamic Polymorphism
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
