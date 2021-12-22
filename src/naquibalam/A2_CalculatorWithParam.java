package naquibalam;

class A2_CalculatorWithParam{
	
	void add(int num1, int num2) {
		int ans = num1 + num2;
		System.out.println(num1 + " + " + num2 + " = " + ans);
	}
	
	void sub(int num1, int num2) {
		int ans = num1 - num2;
		System.out.println(num1 + " - " + num2 + " = " + ans);
	}
	
	void multiply(int num1, int num2) {
		int ans = num1 * num2;
		System.out.println(num1 + " * " + num2 + " = " + ans);
	}
	
	void divide(int num1, int num2) {
		int ans = num1 / num2;
		System.out.println(num1 + " / " + num2 + " = " + ans);
	}
	
	public static void main (String[] args){
		A2_CalculatorWithParam calculatorWithParam = new A2_CalculatorWithParam();
		calculatorWithParam.add(10,20);
		calculatorWithParam.sub(50,10);
		calculatorWithParam.multiply(40,20);
		calculatorWithParam.divide(20,4);
	}
}