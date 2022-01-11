package nishika;

public class Case_3 {
	
	// Dynamic polymorphism...
		public static void main(String[] args) {
		A a1 = new B();

		System.out.println(a1.x);
		System.out.println(a1.y);// compile time to runtime properties(Variable) are not changed
		// System.out.println(a1.z);..(CE)..

		a1.m1();
		a1.m2();// complile time to runtime methods behaviour are changed..that means m2 method
				// main jo hoga usko vo override(update) karega..
		// a1.m3();//..(CE)..because compiler always see left & side..
		// or class A main usko m3 method nahi dikhi isi liye ce..
	}
}
