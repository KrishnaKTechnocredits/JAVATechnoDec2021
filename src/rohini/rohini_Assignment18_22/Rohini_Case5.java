package rohini.rohini_Assignment18_22;

public class Rohini_Case5 {
	public static void main(String[] args) {

		
		A a1 = new A();
		B b1 = new B();
		a1 = b1;

		System.out.println("Case 5 --> A a1 = new A()");
		System.out.println("           B b1 = new B()");
		System.out.println("             a1 = b1");
		System.out.println("    i.e.   A a1 = new B()  <-- Case 3");
		System.out.println("");
		System.out.println("    Case 3 --> Dynamic Polymorphism");
		System.out.println("    ===============================");
		System.out.println("");
		System.out.println("    a) a1.x  = " + a1.x);
		System.out.println("    b) a1.y  = " + a1.y);
		// System.out.println(" c) a1.z = " + a1.z);
		System.out.println("  * c) a1.z  = CE       --> " + "z cannot be resolved or is not a field ");
		System.out.print("    d) a1.m1 = ");
		a1.m1();
		System.out.print("    e) a1.m2 = ");
		a1.m2();
		// a1.m3();
		System.out.println("  * f) a1.m3 = CE       --> " + "The method m3() is undefined for the type A");
		
	}
}
