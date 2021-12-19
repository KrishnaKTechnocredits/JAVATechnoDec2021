package karan;

public class Assignment_2 {
	
	/*Assignment - 2 : 14th Dec'2021
	Write a calculator program, all methods should take 2 parameters.

	for example : void add(int num1, int num2)*/

		int ans=0;
			
		void addition(int num1,int num2){
			ans = num1 + num2;
			System.out.println("Addition of Numbers:" + ans);
		}
		
		void subtraction(int num1,int num2){
			ans = num1 - num2;
			System.out.println("subtraction of Numbers:" + ans);
		}
		
		void multiply(int num1,int num2){
			ans = num1 * num2;
			System.out.println("Multiplication of Numbers:" + ans);
		}
		
		void division(int num1,int num2){
			ans = num1 / num2;
			System.out.println("Division of numbers:" + ans);
		}
		
		public static void main(String[] args){
			Assignment_2 calculator = new Assignment_2();
			calculator.addition(200,600);
			calculator.subtraction(600,200);
			calculator.multiply(200,600);
			calculator.division(600,200);
		}
}
