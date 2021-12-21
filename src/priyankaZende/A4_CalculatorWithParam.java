/* Assignment - 2 : Write a calculator program, all methods should take 2 parameters.*/
package priyankaZende;
class A4_CalculatorWithParam {
	
	void addition(int num1, int num2){
		int ans = num1 + num2;
		System.out.println("Addition of " + num1 +" and " + num2 + " is: " + ans);
	}

	void substraction(int num1, int num2){
		int ans = num1 - num2;
		System.out.println("Substraction of " + num1 +" and " + num2 + " is: " + ans);
	}

	void multiplication(int num1, int num2) {
		int ans = num1 * num2;
		System.out.println("Multiplication of " + num1 +" and " + num2 + " is: " + ans);
	}

	void division(int num1, int num2) {
		int ans = num1 / num2;
		System.out.println("Division of " + num1 +" and " + num2 + " is: " + ans);
	}

	public static void main(String[] args) {
		A4_CalculatorWithParam calculatorWithParam = new A4_CalculatorWithParam();
		calculatorWithParam.addition(10, 2);
		calculatorWithParam.substraction(10, 2);
		calculatorWithParam.multiplication(10, 2);
		calculatorWithParam.division(10, 2);
	}
}	