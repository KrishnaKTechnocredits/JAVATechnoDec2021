package technocredits;

public class Test2 extends Test1{
	int x = 20;
	
	void m1() {
		System.out.println("Hello");
	}
	
	public static void main(String[] args) {
		Test1 test2 = new Test2();
		test2.m1();
		System.out.println(test2.x);
	}
}
