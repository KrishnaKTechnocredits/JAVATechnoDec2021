package omkar;

class A4_CalculatorWithParam{

	void add(int num1, int num2){
		int ans= num1 + num2;
		System.out.println("addition is " +ans);
	}
	
	void sub(int num1 , int num2){
		int ans= num1 - num2;
		System.out.println("substraction is " +ans);
	}
	
	void multi(int num1, int num2){
		int ans= num1 * num2;
		System.out.println("multipication is " +ans);
	}
	
	void div(int num1, int num2){
		int ans= num1/num2;
		System.out.println("divsion is " +ans);
	}
	
	public static void main(String[] args){
		A4_CalculatorWithParam calculatorWithParam = new A4_CalculatorWithParam();
		calculatorWithParam.add(10,20);
		calculatorWithParam.sub(30,40);
		calculatorWithParam.multi(50,60);
		calculatorWithParam.div(70,5);
	}	
		
}