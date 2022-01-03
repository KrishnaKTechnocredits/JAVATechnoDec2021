package nishika;

public class Case_6 {
	public static void main(String[] args) {

		A a1 = new B();
		B b1 = new B();

		b1 = (B) a1;// type mismatch ce time error dega... isi liye hame external typecasting ki
					// jarurat haie..
		B b = new B();// same as case_2;

		System.out.println(b.x);// B extens A haie isi liye child ke pass jo nahie haie vo parent class se vo
								// access kar sakta haie...
		System.out.println(b.y);
		System.out.println(b.z);

		b.m1();// parent se m1 method access huie haie
		b.m2();
		b.m3();
	}
}
