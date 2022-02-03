package gauravk.Assignment02;

import java.util.Scanner;

/*
 * Assignment - 2 : 14th Dec'2021
Write a calculator program, all methods should take 2 parameters.

for example : void add(int num1, int num2){}

 */
public class Calculator {
	
	int add(int a, int b) {
		return a+b;
	}
	
	int substract(int a, int b) {
		if(a>b)
			return a-b;
		return b-a;
	}
	
	int multiply(int a, int b) {
		return a*b;
	}
	
	double divide(int a, int b) {
		try{
			return a/b;
		}catch(ArithmeticException ae) {
			System.out.println("Division by zero not possible.");
		}
		return a/b;
	}
	
	
	public static void main(String[] args) {
		Calculator cal = new Calculator();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two integers.");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		System.out.println("Addition is: "+cal.add(num1,num2));
		System.out.println("Substraction is: "+cal.substract(num1, num2));
		System.out.println("Multiplication is: "+cal.multiply(num1, num2));
		System.out.println("Division is: "+cal.divide(num1, num2));
		
	}
}
