package technocredits.exceptiondemo;

public class Example6 {

	static void m1(Example6 example6, int num) {
		System.out.println("In m1");
		try {
			int ans = 10/num;
			System.out.println(ans);
			example6.m2();
			System.out.println("End - m1");
		}catch(ArithmeticException e) {
			System.out.println("Hi");
		}catch(NullPointerException ne) {
			System.out.println("Technocredits");
		}catch(Exception e) {
			System.out.println("All handled");
		}
		
		/*try {
			example3.m2();
			System.out.println("End - m1");
		}catch(NullPointerException ne) {
			System.out.println("Nullpointer exception");
		}*/
		System.out.println("good");
	}
	
	void m2() {
		System.out.println("In m2");
		System.out.println("Calling");
		System.out.println("End - m2");
	}
	
	
	public static void main(String[] args) {
		m1(null,0);
	}
}
