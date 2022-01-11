package nehaPandey.InheritanceClasses;

public class Case2 extends Test2 {
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
		Case2 case2 = new Case2();
		case2.add();
		case2.add2();
		case2.division();
		case2.substract();
		System.out.println(case2.a);
		System.out.println(case2.x);
		System.out.println(case2.y);

	}
}
