package anvit;

class A3_calculator{
	
	int number1 = 10;
	int number2 = 2;
	
	void addition(){
		int add = number1+number2;
		System.out.println(add);
	}
	
	void substraction(){
		int substract = number1-number2;
		System.out.println(substract);
	}
	
	void multiplication(){
		int multiply = number1*number2;
		System.out.println(multiply);
	}
	
	void division(){
		int divide = number1/number2;
		System.out.println(divide);
	}
	
	public static void main (String[] args0){
		A3_calculator calculator = new A3_calculator();
		calculator.addition();
		calculator.substraction();
		calculator.multiplication();
		calculator.division();
	}
}