package nehaPandey;

class CalculatorProgram {

	void add(int num1, int num2) {
		int ans = num1 + num2;
		System.out.println(ans);
	}

	void sub(int num1, int num2) {
		int ans = num1 - num2;
		System.out.println(ans);
	}

	void multiplication(int num1, int num2) {
		int ans = num1 * num2;
		System.out.println(ans);
	}

	void division(int num1, int num2) {
		int ans = num1 / num2;
		System.out.println(ans);
	}

	public static void main(String[] args) {
		CalculatorProgram calculatorProgram = new CalculatorProgram();
		calculatorProgram.add(10, 20);
		calculatorProgram.sub(10, 20);
		calculatorProgram.multiplication(10, 20);
		calculatorProgram.division(10, 20);
	}

}