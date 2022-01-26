package vaibhav.Assignment_18;

public class Case2 {
	
	public static void main(String[] args) {

		// ********************************************//
		// ******___________ Case 2 _____________******//
		// ******_________ B b1 = new B() _______******//
		// ********************************************//
		
		B b1 = new B();

		System.out.println("Case 2 --> B b1 = new B()");
		System.out.println("");
		System.out.println("    a) b1.x  = " + b1.x);
		System.out.println("    b) b1.y  = " + b1.y);
		System.out.println("    c) b1.z  = " + b1.z);
		System.out.print("    d) b1.m1 = ");
		b1.m1();
		System.out.print("    e) b1.m2 = ");
		b1.m2();
		System.out.print("    d) b1.m3 = ");
		b1.m3();
		System.out.println("=============================================================================");
	}
}
