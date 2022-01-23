package technocredits.constructordemo;

public class Child extends Parent {

	Child(){
		super(10);
		System.out.println("Child default constructor");
	}
	
	protected void m1() {
		System.out.println("Child m1");
	}
	
	public static void main(String[] args) {
		Child child = new Child();
		child.m1();
	}
}
