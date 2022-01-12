package vaibhav.Practice.PriorityForImportStatement.P1;

public class B {
	public static int count = 0;
	void m1() {
		count++;
		System.out.println("P1.B" + "--> " + count + " times ");
		System.out.println("Will be considered only in below cases :");
		System.out.println("1. Qalified path ");
		System.out.println("3. If no any import statement then class with same package");
	}

}
