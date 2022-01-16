package kalyani;

public class A18_Case5 {

	public static void main(String[] args) {

		A18_A a1 = new A18_A();
		A18_B b1 = new A18_B();

		a1 = b1;

		System.out.println(a1.a );
		System.out.println(a1.b);
	//	System.out.println(a1.c); compile time error as c is not a member of class A18_A

		a1.method1();
		a1.method2();
	//	a1.method3(); CE as method3() is not a member of class A
	}
}
