/* Assignment - 2 : 14th Dec'2021
Write a calculator program, all methods should take 2 parameters.

for example : void add(int num1, int num2){}
 */

package amruta.Assignment1to6;
class Calculator {
	int num1 = 10;
	int num2 = 5;
	
	void add(){
		int sum = num1 + num2;
		System.out.println("Sum of 2 numbers : "+sum);
	}
	
	void sub(){
		int sum = num1 - num2;
		System.out.println("Substraction of 2 numbers : "+sum);
	}
	
	void mul(){
		int sum = num1 * num2;
		System.out.println("Multiplication of 2 numbers : "+sum);
	}
	
	void div(){
		int sum = num1 / num2;
		System.out.println("Division of 2 numbers : "+sum);
	}
	
	public static void main(String[] args){
		Calculator calculator = new Calculator();
		calculator.add();
		calculator.sub();
		calculator.mul();
		calculator.div();
	}
}