package priyankaKamble.assignment_18.case_2;
/* Case 2 Inheritance*/

//No need to import Class A as both the classes are in same package

public class Case2_ClassB extends Case2_ClassA {

	int y = 50;
	int z = 70;

	void m1() {
		System.out.println("Case 2 - Class B- in m1 Method ");
	}

	void m3() {
		System.out.println("Case 2 - Class B- in m3 Method ");
	}

	public static void main(String[] args) {
		Case2_ClassB case2B = new Case2_ClassB();
		System.out.println("***** Case 2 ******");
		System.out.println("\n/ * Class A is - Parent  & Class B  is - child ");
		System.out.println("Class B inherits Properties of Class A */");
		System.out.println("\nCalling x -> x =  " + case2B.x);
		System.out.println("Calling y -> y =  " + case2B.y + " -> Here Y is called from child Class B");
		System.out.println("\nCalling z -> z =  " + case2B.z);
		case2B.m1();
		case2B.m2();// System.out.println("M2 is only available in class A");
		case2B.m3();
	}
}
