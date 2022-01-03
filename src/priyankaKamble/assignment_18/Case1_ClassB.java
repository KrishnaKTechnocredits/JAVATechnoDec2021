package priyankaKamble.assignment_18;

//No need to import Class A as both the classes are in same package

public class Case1_ClassB extends Case1_ClassA {

	int y = 50;
	int z = 70;

	void m1() {
		System.out.println("Case 1 - Class B- in m1 Method ");
	}

	void m3() {
		System.out.println("Case 1 - Class B- in m3 Method ");
	}

	public static void main(String[] args) {
		Case1_ClassA case1A = new Case1_ClassA(); // Class A ka Obj created

		System.out.println("Calling x from Class A - Output is  x = " + case1A.x);
		System.out.println("Calling y from Class A - Output is Y = " + case1A.Y);
		// case1A.z;
		System.out.println("\nCE while calling z -> Z is not visisble to Class A");
		case1A.m1();
		case1A.m2();
		// case1A.m3();
		System.out.println("CE - Method m3() is not visible to Class A");

	}
}
