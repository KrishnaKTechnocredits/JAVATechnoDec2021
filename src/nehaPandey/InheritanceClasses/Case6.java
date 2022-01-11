package nehaPandey.InheritanceClasses;

public class Case6 extends Test6 {
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
		Test6 test6 = new Case6();
		Case6 case6 = new Case6();

		// This Is Invalid case;
		// Parent class 'Test6' can not be assign in child class 'Case6';

		// case6 = test6; CE

		// type casting
		case6 = (Case6) test6;
		case6.add();
		case6.add2();
		case6.division();
		case6.substract();
		System.out.println(case6.a);
		System.out.println(case6.x);
		System.out.println(case6.b);

	}
}
