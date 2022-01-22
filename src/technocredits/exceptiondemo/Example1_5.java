package technocredits.exceptiondemo;

public class Example1_5 {

	void display(int num) {
		System.out.println(1);
		System.out.println(2);
		try {
			int x = 10/num;
			System.out.println(x);
			int y = x++;
			y = y + 10;
			int z = y/y-x;
			System.out.println("Hi");
		}catch(ArithmeticException ae) {
			System.out.println("Exception : Please verify value of num");
			//System.out.println("I catch it");
		}
		System.out.println(3); // Excel write code
		System.out.println("good");
	}
	
	public static void main(String[] args) {
		System.out.println("Hi");
		new Example1_5().display(0);
		System.out.println("End");
	}
}
