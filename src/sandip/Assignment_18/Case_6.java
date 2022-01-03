package sandip.Assignment_18;

public class Case_6 {
	public static void main(String[] args) {
		Class_A a1 = new Class_A();
		Class_B b1 = new Class_B();
		/* b1=a1; */ // Type mismatch Compilation Error
		b1 = (Class_B) a1; // run time error
		System.out.println(b1.i1);
		System.out.println(b1.i2);
		System.out.println(b1.i3);
		b1.m1();
		b1.m2(); // method traversed from class A
		b1.m3();
	}
}
