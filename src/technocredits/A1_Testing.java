package technocredits;

class A1_abx{
	
	int num1=100;
	int num2=200;
	
	void setData(){
		num1=10;
		num2 = num2 - num1;
	}
	
	void displayData(){
		System.out.println(num1);
		System.out.println(num2);
	}
	
	public static void main(String[] args){
		A1_abx example1 = new A1_abx();
		example1.setData();
		example1.setData();
		example1.displayData();
	}
}