package technocredits.accessmodifersdemo;

public class Example1 {

	private static int x = 10;
	
	void processData() {
		x++;
	}
	
	static public void main(String[] args) {
		Example1 example11 = new Example1();
		example11.processData();
		System.out.println(example11.x);
		
		Example1 example12 = new Example1();
		example12.processData();
		System.out.println(example12.x);
		
		Example1 example13 = new Example1();
		example13.processData();
		System.out.println(example13.x);
	}
}
