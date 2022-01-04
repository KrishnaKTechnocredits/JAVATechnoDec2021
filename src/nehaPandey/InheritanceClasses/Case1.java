package nehaPandey.InheritanceClasses;

public class Case1 extends Test1 {
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
		Test1 test = new Test1();
		test.add();
		test.substract();

		System.out.println(test.a);

		// Here, we are using reference variable of parent class "Test1" and
		// "y" is a instance variable of child class "Case1"

		// System.out.println(test.y); CE

		// As we know, using parent class's reference variable we can not call the child
		// class's methods 
		
		// test.division(); CE ,

	}
}
