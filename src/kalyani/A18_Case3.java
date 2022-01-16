package kalyani;

public class A18_Case3 {
	
	
	public static void main(String[] args) {

		A18_A a1 = new A18_B();

			System.out.println(a1.a);
			System.out.println(a1.b);
			//System.out.println(test1.z); CE as z is not the member of class A

			a1.method1();
			a1.method2();
			// a1.method3(); CE method3() is not the member of class A			
	}
}


