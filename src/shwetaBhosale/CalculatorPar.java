/* Assignment - 2 : 14th Dec'2021
Write a calculator program, all methods should take 2 parameters.
for example : void add(int num1, int num2){} */
package shwetaBhosale;

class CalculatorPar{
	
	void add(int num1, int num2){
		int ans= num1 + num2;
		System.out.println("Addition is: " +ans);
	}
	
	void sub(int num1,int num2){
		int ans = num1 - num2;
		System.out.println("Substraction is: " +ans);
	}
	
	void div(int num1,int num2){
		int ans = num1 / num2;
		System.out.println("Division is: " +ans); 
	}
	
	void multi(int num1,int num2){
		int ans = num1 * num2;
		System.out.println("Multiplication is: " +ans); 
	}
	
	public static void main(String[] a){
		CalculatorPar calculatorPar = new CalculatorPar();
		calculatorPar.add(10,10);
		calculatorPar.sub(10,5);
		calculatorPar.div(15,5);
		calculatorPar.multi(2,6);
	}
}