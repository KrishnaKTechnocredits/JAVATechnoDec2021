package technocredits.exceptiondemo.throwsdemo;

public class Person1 {

	void payBill() throws ArithmeticException {
		try {
			System.out.println(1);
			Person2 person2 = new Person2();
			person2.payBill(1100);
			System.out.println(2);
		} catch (ArithmeticException ae) {
			System.out.println("in catch");
		}catch(Exception e) {
			System.out.println("Hi");
		}
	}

	public static void main(String[] args) throws ArithmeticException {
		System.out.println("start");
		Person1 person1 = new Person1();
		person1.payBill();
		System.out.println("end");
	}
}
