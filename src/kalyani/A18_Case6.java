package kalyani;

public class A18_Case6 {

	public static void main(String[] args) {

		A18_A a1 = new A18_B();
		A18_B b1 = new A18_B();

		b1 = (A18_B)a1;

		System.out.println(b1.a);
		System.out.println(b1.b);
		System.out.println(b1.c);

		b1.method1();
		b1.method2();
		b1.method3();
	}
}
