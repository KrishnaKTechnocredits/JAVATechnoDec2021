package sandip.Assignment_18;

public class Case_5 {
	public static void main(String[] args) {
		Class_A a1 = new Class_B();
		System.out.println(a1.i1);
		System.out.println(a1.i2);
		/* System.out.println(a1.i3); */
		a1.m1();
		a1.m2();
		/* a1.m3(); */ // Compilation Error
		// Above case similar to Case 3//
	}
}
