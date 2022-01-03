package nishika;

public class Case_1 {
	
	public static void main(String[] args) {
		A a1 = new A();

		System.out.println(a1.x);
		System.out.println(a1.y);
		// System.out.println(a1.z);..(CE) z is not a member of class A that's why it's a ce.

		a1.m1();
		a1.m2();
		// a1.m3(); (..CE) same m3 method is not a member of class A. 
	}
}
