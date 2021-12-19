package sagarAcharya;

class Example1{
	
	int num1=100;
	int num2=200;
	
	void setdata(){
		num1=10;
		num2=num1-num2;
	}
	
	void displayData(){
		System.out.println(num1);
		System.out.println(num2);
	}
	public static void main(String[] args){
		Example1 example= new Example1();
		example.displayData();
		example.setdata();
		example.setdata();
		example.displayData();
	}
}