package priyankaKamble.assignment_18.case_4;
/* Case 4 -> Invalid Case   */

//No need to import Class A as both the classes are in same package

public class Case4_ClassB extends Case4_ClassA {

	int y = 50;
	int z = 70;

	void m1() {
		System.out.println("Case 4 - Class B- in m1 Method ");
	}

	void m3() {
		System.out.println("Case 4 - Class B- in m3 Method ");
	}

	public static void main(String[] args) {
		System.out.println("*****  Case 4 -> Invalid Case   ******");
		System.out.println("\nCase3_ClassB case2B = new Case4_ClassA();  => Is Not Possible ");
		System.out.println("Parent calss A can not inherite properties of Child Class B");
	}
}
