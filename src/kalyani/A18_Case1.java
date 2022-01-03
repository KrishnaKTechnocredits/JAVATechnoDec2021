package kalyani;

public class A18_Case1 {
	
	public static void main(String args[]) {
	A18_A a1 = new A18_A();

	System.out.println(a1.a);
	System.out.println(a1.b);
	//	System.out.println(a1.c); CE as z is not the data member of class A18
	
	a1.method1();
	a1.method2();
	//a1.method3(); CE as method3 is not the member function of class A18

	}
}


