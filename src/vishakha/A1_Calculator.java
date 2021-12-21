package vishakha;

class A1_Calculator{

	void addition(int number1, int number2){
		int answer = number1 + number2;
		System.out.println("addition of " + number1 + " and " + number2 + " is: "+ answer);
	}
	
	void substraction(int number1, int number2){
		int answer = number1 - number2;
		System.out.println("substraction of " + number1 + " and " + number2 + " is: "+ answer);
	}
	
	void multiplication(int number1, int number2){
		int answer = number1 * number2;
		System.out.println("Multiplication of " + number1 + " and " + number2 + " is: "+ answer);
	}
	
	void division(int number1, int number2){
		int answer = number1 / number2;
		System.out.println("Division of " + number1 + " and " + number2 + " is: "+ answer);
	}
	
	public static void main(String[] args){
		A1_Calculator calculator = new A1_Calculator();
		calculator.addition(10,20);
		calculator.substraction(30,20);
		calculator.multiplication(40,50);
		calculator.division(100,10);
	}
}