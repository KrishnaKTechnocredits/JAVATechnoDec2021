package priya.A18_Inheritance;

public class Case3 {
	
	public static void main(String[] a) {
		Manager m1 = new Employee();  /////this is called Dynamic Polymorphism
		System.out.println(m1.x);
		System.out.println(m1.y);	///it will print B m2 as properties does not changes in dynamic polymorphism
	//	System.out.println(m1.z);      //z is not a member of Manager class
		m1.m1();
		m1.m2();     /////it will print 12 as behaviour changes in dynamic polymorphism
	//	m1.m3();   //CE as method m3 is undefined for Manager class i.e. it is not a member of Manager


	}
}
