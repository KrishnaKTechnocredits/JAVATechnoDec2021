package yogeshNimbalkar;
// Assignment - 2 : 14 Dec 2021
class A2_CalculatorWithParam{
	
	void add(int num1, int num2){
		System.out.println("Addition = " + (num1 + num2));
	}
	
	void sub(int num1, int num2){
		System.out.println("Subtraction = " + (num1 - num2));
	}
	
	void mul(int num1, int num2){
		System.out.println("Multiplication = " + (num1 * num2));
	}
	
	void div(int num1, int num2){
		System.out.println("Division = " + (num1 / num2)); 
	}
	
	public static void main(String[] args){
		A2_CalculatorWithParam calculatorwithparam = new A2_CalculatorWithParam();
		calculatorwithparam.add(125,250);
		calculatorwithparam.sub(456,123);
		calculatorwithparam.mul(25,30);
		calculatorwithparam.div(625,25);
	}
}