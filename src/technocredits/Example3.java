package technocredits;

class Example3{
	
	int num = 10;

	void processData(){
		int num = 20;
		System.out.println(num);
	}
	
	void display(){
		int num = 30;
		System.out.println(num);
	}
	
	public static void main(String[] a){
		Example3 example3 = new Example3();
		example3.processData();
		example3.display();
		System.out.println(example3.num);
	}
}