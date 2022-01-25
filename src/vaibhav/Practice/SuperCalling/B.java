package vaibhav.Practice.SuperCalling;

public class B extends A {
	void m1() {
		super.m2();
	}

	void m2() {
		System.out.println("Hello");
		super.m3();
	}

	public static void main(String[] args) {
		B b1 = new B();
		b1.m1();
		b1.m2();
	}

}
