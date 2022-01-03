package deepak;

public class A18_InheritanceCase6 {

	public static void main(String[] args) {
		A18_InheritanceManager manager = new A18_InheritanceEmployee();
		A18_InheritanceEmployee employee = new A18_InheritanceEmployee();
		employee = (A18_InheritanceEmployee) manager; // This becomes similar to Case 2

		System.out.println(employee.managerID);
		System.out.println(employee.name);
		System.out.println(employee.employeeID);

		employee.m1();
		employee.m2();
		employee.m3();

	}

}
