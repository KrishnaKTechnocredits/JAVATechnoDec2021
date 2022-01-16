/* Assignment - 2 : 14th Dec'2021
Write a calculator program, all methods should take 2 parameters.

for example : void add(int num1, int num2){}

 */

package vaibhav.Assignment_2;

public class Calculator {
	
	void addition(int num1, int num2){
		int sum = num1 + num2;
		System.out.println("Addition of two numbers " + num1 + " and " + num2 + " is : " + sum);
	}
	
	void subtraction (int num1, int num2){
		int subtraction = num1 - num2;
		System.out.println("Subtraction of two numbers " + num1 + " and " + num2 + " is : " + subtraction);
	}
	
	void multiplication(int num1, int num2){
		int multiplication = num1 * num2;
		System.out.println("Multiplication of two numbers " + num1 + " and " + num2 + " is : " + multiplication);
	}
	
	void division(int num1, int num2){
		double division = (double)num1 / num2;
		System.out.println("Division of two numbers " + num1 + " and " + num2 + " is : " + division);
	}

	public static void main (String [] args){
		Calculator calculator = new Calculator();
		calculator.addition(10,20);
		calculator.subtraction(10,20);
		calculator.multiplication(10,20);
		calculator.division(10,3);		
	}	
}