package nehaPandey.InheritanceClasses;

public class Case5 extends Test5 {
	int a = 20;
	int x = 35;
	int y = 50;

	void add() {
		int z = a + x;
		System.out.println("Ans is " + z);
	}

	void add2() {
		int z = x + y;
		System.out.println("Answer is " + z);
	}

	void division() {
		int z = y / a;
		System.out.println("Division is " + z);
	}

	public static void main(String[] args) {
		Test5 test = new Test5();
		Case5 case5 = new Case5();
		test = case5;

		test.add();
		test.substract();
		System.out.println(test.a);
		System.out.println(test.b);

		// This "test=case5" will show dynamic polymorphism;
		// So, diffrent method and diffrent variables of Class Case5 i.e; child class
		// will not compile,
		// it will show compilation error;

		// test.add2(); CE
		// test.division(); CE
		// System.out.println(test.x); CE
		// System.out.println(test.y); CE

	}

}
