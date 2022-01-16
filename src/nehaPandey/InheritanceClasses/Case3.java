package nehaPandey.InheritanceClasses;

public class Case3 extends Test3 {
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
		Test3 test = new Case3();

		test.add();
		test.substract();
		System.out.println(test.a);
		System.out.println(test.b);

		// There is Dynamic Polymorphism;
		// Reference variable 'test' will take guarantee from class 'Test3' at compile
		// time and behaviour i.e; Method of exactly similar as in parent class "Test3"
		// will be changed from compile time to run time.
		// So similar method of child class "Case3" will be executed at run time
		// Properties i.e; 'Variables' can not be changed
		// from compile time to run time

		// test.add2(); //CE
		// test.division(); //CE
		// System.out.println(test.x); // CE
		// System.out.println(test.y); //CE

	}

}
