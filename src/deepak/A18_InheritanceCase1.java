package deepak;

public class A18_InheritanceCase1 {

	public static void main(String[] args) {
		A18_InheritanceManager manager = new A18_InheritanceManager();
		System.out.println(manager.managerID);
		System.out.println(manager.name);
		// System.out.println(manager.employeeID); //CE because Manager class does not
		// takes guarantee of employee members.

		manager.m1();
		manager.m2();
		// manager.m3(); //CE because Manager class takes not takes guarantee of
		// employee methods.

	}

}
