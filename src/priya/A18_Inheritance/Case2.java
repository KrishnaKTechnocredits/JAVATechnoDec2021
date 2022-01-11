package priya.A18_Inheritance;

public class Case2 {
	
	public static void main(String[] a) {
		Employee e1 = new Employee ();
		System.out.println(e1.x);  // 10 Employee class is child class hence will take x from Manager class
		System.out.println(e1.y);  // 50
		System.out.println(e1.z);  //70
		e1.m1();      //  A m1 similarly m1 also transfer from Manager to Employee
		e1.m2();      // B m2
		e1.m3();	//B m3
	}	
}
