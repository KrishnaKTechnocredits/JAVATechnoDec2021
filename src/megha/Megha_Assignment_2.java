package megha;

class CalculatorWithParam{
		
	void add(int number1, int number2){
		int ans = number1 + number2;
		System.out.println("Addition is " + ans);
	}
	
	void subtract(int number1, int number2){
		int ans = number1 - number2;
		System.out.println("Subtraction is " + ans);
	}
	
	void multiply(int number1, int number2){
		int ans = number1 * number2;
		System.out.println("Multiplication is " + ans);
	}
	
	void divide(int number1, int number2){
		int ans = number1 / number2;
		System.out.println("Division is " + ans);
	}
	
	public static void main(String[] args){
		CalculatorWithParam calculatorWithParameter = new CalculatorWithParam();
		calculatorWithParameter.add(10,20);
		calculatorWithParameter.subtract(20,10);
		calculatorWithParameter.multiply(40,50);
		calculatorWithParameter.divide(100,2);
	}
}