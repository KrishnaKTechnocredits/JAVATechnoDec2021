package technocredits.exceptiondemo;

public class Example1 {

	void display(int num) {
		System.out.println(1);
		System.out.println(2);
		int x = 10/num;
		System.out.println(x);
		System.out.println(3);
	}
	
	public static void main(String[] args) {
		System.out.println("Hi");
		new Example1().display(0);
		System.out.println("End");
	}
}
