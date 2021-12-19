package technocredits;

class A3_E{
	
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
		A3_E example3 = new A3_E();
		example3.processData();
		example3.display();
		System.out.println(example3.num);
	}
}