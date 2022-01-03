package deepak;

public class A18_InheritanceCase2 {

	public static void main(String[] args) {
		A18_InheritanceEmployee employee = new A18_InheritanceEmployee();
		System.out.println(employee.managerID);
		System.out.println(employee.name);
		System.out.println(employee.employeeID);

		employee.m1();
		employee.m2();
		employee.m3();

	}

}
