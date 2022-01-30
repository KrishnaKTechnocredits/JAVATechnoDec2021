package technocredits.blocksdemo;

public class A {

	{
		System.out.println("Hi");
	}
	
	A(){
		System.out.println("1");
	}
	
	A(int x){
		super();
		System.out.println("2");
	}
	
	A(int x, int y){
		this(x);
		System.out.println("3");
	}
	
	
	public static void main(String[] args) {
		A a1 = new A(10,20);
	}
}
