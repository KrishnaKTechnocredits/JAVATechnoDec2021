package pradeep;

class A3_CalculatorWithParam{
	void add(int num1, int num2){
		int ans = num1 + num2;
		System.out.println("Addition is " + ans);
	}
	
	void sub(int num1, int num2){
		int ans = num1 - num2;
		System.out.println("Substraction is " + ans);
	}
	
	void mul(int num1, int num2){
		int ans = num1 * num2;
		System.out.println("Multiplication is " + ans);
	}
	
	void div(int num1, int num2){
		int ans = num1 / num2;
		System.out.println("Division is " + ans);
	}
	
	public static void main(String[] args){
		A3_CalculatorWithParam calculatorWithParam = new A3_CalculatorWithParam();
		calculatorWithParam.add(20,10);
		calculatorWithParam.sub(20,10);
		calculatorWithParam.mul(20,10);
		calculatorWithParam.div(20,10);
	}
}