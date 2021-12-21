package sandip;

class A1_Calculator{

	void add(int num1, int num2){
		int total = num1+num2;
		System.out.println(total);
	}
	
	void substract(int num1, int num2){
		int total = (num1-num2);
		System.out.println(total);
	}
	
	void multiply(int num1, int num2){
		int total = (num1*num2);
		System.out.println(total);
	}
	
	void devide(int num1, int num2){
		int total = (num1/num2);
		System.out.println(total);
	}
	
	public static void main(String[]args){
		A1_Calculator calculator_1=new A1_Calculator();
		calculator_1.add(10,20);
		calculator_1.substract(20,10);
		calculator_1.multiply(10,10);
		calculator_1.devide(20,10);
	}
	
}