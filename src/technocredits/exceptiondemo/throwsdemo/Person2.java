package technocredits.exceptiondemo.throwsdemo;

public class Person2 {

	void payBill(int amt) throws ArithmeticException{
			System.out.println(amt);
			int ans = amt/(amt-1100);
			System.out.println("Bill number is " + ans);
	}
}
