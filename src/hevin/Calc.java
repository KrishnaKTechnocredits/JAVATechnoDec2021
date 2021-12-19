package hevin;

class Calc{
	
	void addition(int num1, int num2){
		System.out.println("An Addition is " + (num1 + num2));
	}
	
	void subtraction(int num1, int num2){
		System.out.println("Subtraction is " + (num1 - num2));
	}
	
	void division(int num1, int num2){
		System.out.println("Division is " + (num1 / num2));
	}
	
	void multiplication(int num1, int num2){
		System.out.println("Multiplication is " + (num1 + num2));
	}
	
	public static void main(String[] a){
		Calc calc = new Calc();
		calc.addition(10,20);
		calc.subtraction(10,20);
		calc.division(10,20);
		calc.multiplication(10,20);
	}
}