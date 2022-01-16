package sandip.Assignment_18;

public class Case_3 {
	public static void main(String[] args) {
		Class_A a1 = new Class_B();
		System.out.println(a1.i1); //class A
		System.out.println(a1.i2); //class A
		/*System.out.println(a1.i3);*/ //Compilation Error
		a1.m1(); //method of class B
		a1.m2(); //method of class A
		/*a1.m3();*/ //Compilation Error
	}
}
