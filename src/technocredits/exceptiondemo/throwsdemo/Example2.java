package technocredits.exceptiondemo.throwsdemo;

public class Example2 {

	void m1() throws RuntimeException,NullPointerException {
		int x = 10/0;
	}
	
	public static void main(String[] args) {
		System.out.println("start");
		try {
			new Example2().m1();
		}catch(ArithmeticException ae) {
			System.out.println("Hi");
		}
		
	}
}
