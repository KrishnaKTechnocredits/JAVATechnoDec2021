package nishika;

public class Case_5 {

	public static void main(String[] args) {

		A a1 = new A();
		B b1 = new B();

		a1 = b1;
		// A a1= new B();

		System.out.println(a1.x);// 20
		System.out.println(a1.y);// 30..variable are same.. variable cm to run change nahi hota..
		// System.out.println(a1.z);

		a1.m1();//
		a1.m2();// compile time to runtime behaviour are changed..so..m2 method class b ke m2
				// method main jo haie vo print karega..
		// a1.m3();
	}
}
