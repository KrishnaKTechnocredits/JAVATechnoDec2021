package technocredits.exceptiondemo;

public class Example3 {
	
	static void m1(Example3 example3) {
		System.out.println("In m1");
		example3.m2();
		System.out.println("End - m1");
	}
	
	void m2() {
		System.out.println("In m2");
		System.out.println("Calling");
		System.out.println("End - m2");
	}
	
	public static void main(String[] args) {
		System.out.println("Hi");
		Example3.m1(null);
		System.out.println("End");
	}
}
