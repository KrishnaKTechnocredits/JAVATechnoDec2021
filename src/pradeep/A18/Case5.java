package pradeep.A18;

public class Case5 {
	public static void main(String[] args) {
		A a1 = new A();
		B b1 = new B();
		a1 = b1;

		System.out.println(a1.x);
		System.out.println(a1.y);
		// System.out.println(a1.z);

		a1.m1();
		a1.m2();
		// a1.m3(); CE
	}
}
