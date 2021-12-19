package apurva;

class Calculator{

	void addition(int num1, int num2){
		int sum = num1+num2;
		System.out.println("Addition of two numbers is :" +sum);
	}
	
	void subtraction(int num1, int num2){
		int sub = num1-num2;
		System.out.println("Subtraction of two numbers is :" +sub);
	}
	
	void multiplication(int num1, int num2){
		int multiply = num1*num2;
		System.out.println("Multiplication of two numbers is :" +multiply);
	}
	void division(float num1, float num2){
		float divide = num1/num2;
		System.out.println("Division of two numbers is :" +divide);
	}
	
	public static void main(String[] args){
		Calculator calculator = new Calculator();
		calculator.addition(3,2);
		calculator.subtraction(3,3);
		calculator.multiplication(7,8);
		calculator.division(7,2);
		
	}
}