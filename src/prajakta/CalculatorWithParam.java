package prajakta;

class CalculatorWithParam{

    void add(int num1, int num2){
		int ans = num1 + num2;
		System.out.println("Addition of two number is " +ans);
	}

	void sub(int num1, int num2){
		int ans = num1 - num2;
		System.out.println("Substraction of two number is " +ans);
	}

	void mul(int num1, int num2){
		int ans = num1 * num2;
		System.out.println("Multiplication of two number is " +ans);
	}

	void div(int num1, int num2){
		int ans = num1 / num2;
		System.out.println("Division of two number is " +ans);
	}

	public static void main(String[] a){
		CalculatorWithParam calculatorWithParam = new CalculatorWithParam();
		calculatorWithParam.add(20,20);
		calculatorWithParam.sub(20,3);
		calculatorWithParam.mul(12,5);
		calculatorWithParam.div(4,5);
	}
}	