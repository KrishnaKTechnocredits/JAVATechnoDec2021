package technocredits.accessmodifersdemo;

public class Test1 {
	private int x = 10;
	int y = 20;
	
	void m1() {
		System.out.println("I am in test1 m1");
		m2(); // CE
		System.out.println(x);
	}
	
	private void m2() {
		System.out.println("I am in test1 m2");
	}
}
