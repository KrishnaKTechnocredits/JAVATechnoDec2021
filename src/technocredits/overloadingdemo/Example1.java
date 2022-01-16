package technocredits.overloadingdemo;

public class Example1 {

	void m1(String name) {
		System.out.println(1);
	}
	
	void m1(int x) {
		System.out.println(2);
	}
	
	public static void main(String[] args) {
		Example1 example1 = new Example1();
		example1.m1(10);
	}
}
