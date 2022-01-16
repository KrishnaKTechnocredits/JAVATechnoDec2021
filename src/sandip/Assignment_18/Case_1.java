package sandip.Assignment_18;

public class Case_1 {
	public static void main(String[] args) {
		Class_A a1 = new Class_A();
		System.out.println(a1.i1);
		System.out.println(a1.i2);
		/* System.out.println(a1.i3); */ // Compilation Error
		a1.m1();
		a1.m2();
		/* a1.m3(); */ // Compilation Error
	}
}
