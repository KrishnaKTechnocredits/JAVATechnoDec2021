package priyankaKamble.assignment_18.case_3;
/* Case 3 Dynamic Polymorphism   */

//No need to import Class A as both the classes are in same package

public class Case3_ClassB extends Case3_ClassA {

	int y = 50;
	int z = 70;

	void m1() {
		System.out.println("Case 3 - Class B- in m1 Method ");
	}

	void m3() {
		System.out.println("Case 3 - Class B- in m3 Method ");
	}

	public static void main(String[] args) {
		System.out.println("*****  Case 3 Dynamic Polymorphism   ******");
		// Case3_ClassB case2B = new Case3_ClassB();
		Case3_ClassA case3A = new Case3_ClassB();
		System.out.println("Calling X -> x = " + case3A.x);
		System.out.println("Calling Y -> y = " + case3A.y + "  -> Behaviour of Varials won't Change ");
		System.out.println("CE -> Class A dont give Garuntee of variable Z");// System.out.println("Calling Z -> z =
																				// "+case3A.z);
		case3A.m1();
		case3A.m2();
		System.out.println("CE -> Class A dont give Garuntee of m3()");
	}
}
