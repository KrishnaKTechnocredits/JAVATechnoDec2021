package jagdish;

public class A18_InheritanceCase1 {

	public static void main(String[] args) {

		// Case1 -

		Class2_Manager manager = new Class2_Manager();
		System.out.println(manager.ManagerId);
		System.out.println(manager.Name);

		manager.m1();
		// manager.m2(); // CE- Manager class do not take guarantee of employee method
		manager.m3();

	}
}
