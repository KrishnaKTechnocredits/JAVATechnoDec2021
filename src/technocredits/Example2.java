package technocredits;

class Example2{
	String name = "Techno";
	int num1 = 10;
	int num2 = 20;
	
	void processData(){
		num1 = num1+num2;
	}
	
	void displayData(){
		System.out.println(num1 + num2 + "is my ans" + (num1 + num2));
	}
	
	public static void main(String[] args){
		Example2 example2 = new Example2();
		example2.processData();
		example2.displayData();
	}
}
