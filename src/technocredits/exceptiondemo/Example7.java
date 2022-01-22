package technocredits.exceptiondemo;

public class Example7 {

	void m1() {
		try {
			/*
			 * Login of DB Connect and perform operations
			 */
			//close DB connection
			System.out.println("Hello");
		}catch(ArithmeticException ae) {
			//close DB connection
		}catch(NullPointerException ne) {
			//close DB connection
		}finally {
			System.out.println("Hi");
		}
		System.out.println("end");
	}
}
