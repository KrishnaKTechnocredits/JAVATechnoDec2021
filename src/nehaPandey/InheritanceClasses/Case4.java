package nehaPandey.InheritanceClasses;

public class Case4 extends Test4{
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

		// Invalid Case
		// We can not assign parent class "Test4" into child class "Case4"

		// Case4 case4 = new Test4(); //CE

	}

}
