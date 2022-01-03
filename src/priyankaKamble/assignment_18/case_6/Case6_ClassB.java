package priyankaKamble.assignment_18.case_6;
/* Case 6 ->  Type Cast - similar to Case 2  */

//No need to import Class A as both the classes are in same package

public class Case6_ClassB extends Case6_ClassA {

	int y = 50;
	int z = 70;

	void m1() {
		System.out.println("Case 6 - Class B- in m1 Method ");
	}

	void m3() {
		System.out.println("Case 6 - Class B- in m3 Method ");
	}

	public static void main(String[] args) {
		System.out.println("*****  Case 6 ->  Type Cast - similar to Case 2   ******\n");
		Case6_ClassA case6A = new Case6_ClassB();
		Case6_ClassB case6B = new Case6_ClassB();
		case6B = (Case6_ClassB) case6A;
		System.out.println("case6B = case6A; -> Parent Class A can't Fit into Child  Class B ");
		System.out.println("case6B = (Case6_ClassB) case6A; <- Hence we need to Type Cast ");

		System.out.println("\nCalling x -> x =  " + case6B.x);
		System.out.println("Calling y -> y =  " + case6B.y + " -> Here Y is called from child Class B");
		System.out.println("\nCalling z -> z =  " + case6B.z);
		case6B.m1();
		case6B.m2();// System.out.println("M2 is only available in class A");
		case6B.m3();
	}
}
