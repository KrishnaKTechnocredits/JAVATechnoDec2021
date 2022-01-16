package technocredits.constructordemo;

public class C extends B{
	C(){
		System.out.println("5");
	}
	
	
	public static void main(String[] args) {
		C c1 = new C();
		c1.m1();
	}
	
}
