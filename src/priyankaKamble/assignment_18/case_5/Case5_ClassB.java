package priyankaKamble.assignment_18.case_5;
/* Case 5 ->  Dynamic Polymorphism -Same as Case 3   */

//No need to import Class A as both the classes are in same package

public class Case5_ClassB extends Case5_ClassA {

	int y = 50;
	int z = 70;

	void m1() {
		System.out.println("Case 5 - Class B- in m1 Method ");
	}

	void m3() {
		System.out.println("Case 5 - Class B- in m3 Method ");
	}

	public static void main(String[] args) {
		System.out.println("*****  Case 5 ->  Dynamic Polymorphism - Same as Case 3   ******");
		Case5_ClassA case5A = new Case5_ClassA();
		Case5_ClassB case5B = new Case5_ClassB();
		case5A = case5B;
		System.out.println("\ncase5A  = case5B; <- Is Similar to  \nCase5_ClassA case5A = new Case5_ClassB();");
		System.out.println("\nCalling X -> x = " + case5A.x);
		System.out.println("Calling Y -> y = " + case5A.y + "  -> Behaviour of Varials won't Change ");
		// case5A.z;
		System.out.println("CE -> Class A dont give Garuntee of variable Z");// System.out.println("Calling Z -> z =
																				// "+case3A.z);
		case5A.m1();
		case5A.m2();
		// case5A.m3();
		System.out.println("CE -> Class A dont give Garuntee of m3()");

	}
}
