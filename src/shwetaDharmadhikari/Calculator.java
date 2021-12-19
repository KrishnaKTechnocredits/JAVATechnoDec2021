package shwetaDharmadhikari;
class Calculator{
	
	void addition(int num1, int num2){
		int sum = num1+num2;
		System.out.println("\nSum of two number is: "+sum);
	}
	
	void subtraction(int num1, int num2){
		int subtraction = num1-num2;
		System.out.println("Subtraction of two number is: "+subtraction);
	}
	
	void multiplication(int num1, int num2){
		int multiplication = num1*num2;
		System.out.println("Multiplication of two number is: "+multiplication);
	}
	
	void division(int num1, int num2){
		int division = num1/num2;
		System.out.println("Division of two number is: "+division);
	}
	
	public static void main(String args[])
	{
		Calculator calculator = new Calculator();
		calculator.addition(70,10);
		calculator.subtraction(50,10);
		calculator.multiplication(20,20);
		calculator.division(27,3);
	}
}
