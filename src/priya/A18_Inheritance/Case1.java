package priya.A18_Inheritance;

public class Case1 {

	public static void main() {
		Manager m1 = new Manager();
		System.out.println(m1.x);
		System.out.println(m1.y);
		//System.out.println(e1.z);      CE as z is not a member of class Manager directly or indirectly
		m1.m1();
		m1.m2();
		//e1.m3();		      CE as m3 method is not member of class Manager
	}

	}

