/*Assignment - 2: 14th Dec'2021
Write a calculator program, all methods should take 2 parameters.*/
package deepak;

class A2_CalculatorParam{
	
	void add(int num1, int num2){
		int output = num1+num2;
		System.out.println("Addition of numbers is: "+output);
	}
	
	void substraction(int num1, int num2){
		int output = num1-num2;
		System.out.println("Substraction of numbers is: "+output);
	}
	
	void multiplication(int num1, int num2){
		int output = num1*num2;
		System.out.println("Multiplication of numbers is: "+output);
	}
	
	void division(int num1, int num2){
		int output = num1/num2;
		System.out.println("Division of numbers is: "+output);
	}
	
	public static void main(String[] a){
		A2_CalculatorParam calculatorParam = new A2_CalculatorParam();
		calculatorParam.add(20,10);
		calculatorParam.substraction(70,30);
		calculatorParam.multiplication(35,7);
		calculatorParam.division(44,11);
	}
}
