package vrushali;

class A4_CalculatorWithParam{

	void add(int num1, int num2){
		int ans = num1 + num2;
		System.out.println("Addition: " + ans);
	}
	
	void sub(int num1, int num2){
		int ans = num1 - num2;
		System.out.println("Substraction: " + ans);
	}
	
	void multiplication(int num1, int num2){
		int ans = num1 * num2;
		System.out.println("Multiplication: " + ans);
	}
	
	void division(int num1, int num2){
		int ans = num1 / num2;
		System.out.println("Division: " + ans);
	}
	
	public static void main(String[] args){
		A4_CalculatorWithParam calculatorWithParam = new A4_CalculatorWithParam();
		calculatorWithParam.add(60,20);
		calculatorWithParam.sub(30,20);
		calculatorWithParam.multiplication(10,20);
		calculatorWithParam.division(100,20);
	}
}