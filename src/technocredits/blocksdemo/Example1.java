package technocredits.blocksdemo;

public class Example1 {
	static final int x;
	
	static{
		System.out.println(1);
		x = 10;
	}
	
	{
		System.out.println(2);
	}
	
	Example1(){
		System.out.println(3);
	}
	
	public static void main(String[] args) {
		Example1 example1_1 = new Example1();
		Example1 example1_2 = new Example1();
	}
}
