package garima;

class CalculatorWithParam {

	void addition(int a, int b) {
		int addition = a + b;
		System.out.println("addition of  given 2 numbers is: " + addition);
	}

	void substraction(int a, int b) {
		int substraction = a - b;
		System.out.println("substraction of  given 2 numbers is: " + substraction);
	}

	void multiplication(int a, int b) {
		int multiplication = a * b;
		System.out.println("multiplication of  given 2 numbers is: " + multiplication);
	}

	void division(int a, int b) {
		int division = a / b;
		System.out.println("division of given 2 numbers is: " + division);
	}

	public static void main(String[] args) {
		CalculatorWithParam calculatorWithParam = new CalculatorWithParam();
		calculatorWithParam.addition(10, 15);
		calculatorWithParam.substraction(60, 20);
		calculatorWithParam.multiplication(5, 8);
		calculatorWithParam.division(100, 20);
	}
}
