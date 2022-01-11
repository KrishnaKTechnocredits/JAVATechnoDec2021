package priya.A18_Inheritance;

public class Case5 {
	public static void main(String[] a) {
		Manager m1 = new Manager();
		Employee e1 = new Employee();
		m1 = e1;     ///HERE WE ARE CHANGING POINTER OFEMPLOYEE MANAGER CLASS i.e. now m1 will point to employee class which make it similar to case3 
		System.out.println(m1.x);
		System.out.println(m1.y);
	//	System.out.println(m1.z);   CE as z is undefined for Manager class
		m1.m1();
		m1.m2();
	//	m1.m3();    //CE as m3 is undefined for Manager class
	}
}
