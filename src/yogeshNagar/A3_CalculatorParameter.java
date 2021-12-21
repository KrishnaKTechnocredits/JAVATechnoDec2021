package yogeshNagar;

class A3_CalculatorParameter{
	
	void add(int num1, int num2){
		int ans = num1 + num2;
		System.out.println("Addition of two number is " + ans);
	}
	
	void subtraction(int num1, int num2){
		int ans = num1 - num2;
		System.out.println("Subtraction of two number is " + ans);
	}
	
	void multiplication(int num1, int num2){
		int ans = num1 * num2;
		System.out.println("Multiplication of two number is " + ans);
	}
	
	void division(int num1, int num2){
		int ans = num1 / num2;
		System.out.println("Division of two number is " + ans);
	}
	
	public static void main(String[] args){
		A3_CalculatorParameter calculatorParameter = new A3_CalculatorParameter();
		calculatorParameter.add(10,20);
		calculatorParameter.subtraction(30,20);
		calculatorParameter.multiplication(30,2);
		calculatorParameter.division(40,2);		
	}
}