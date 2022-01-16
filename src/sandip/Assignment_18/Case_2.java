package sandip.Assignment_18;

public class Case_2 {

	public static void main(String[] args) {
		Class_B b1 = new Class_B();
		System.out.println(b1.i1);
		System.out.println(b1.i2);
		System.out.println(b1.i3);
		b1.m1();
		b1.m2(); // method traversed from class A
		b1.m3();
	}
}
