package nishika;

public class Case_2 {

	// child class main parents class ke variable and methos travers hokar aye haie.
	// but if agar like child ke pass variable/method already define haie or usme jo
	// value haie vo vahi rahegi chnge nahi hogi...
	// jo nahi haie vo .. usko lega..

	public static void main(String[] args) {
		B b1 = new B();

		System.out.println(b1.x);
		System.out.println(b1.y);
		System.out.println(b1.z);

		b1.m1();
		b1.m2();
		b1.m3();
	}
}
