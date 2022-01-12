package vaibhav.Practice;

import java.util.Scanner;

public class ScannerDemo {

	void sum(int num1, int num2) {
		System.out.println("Sum of two numbers " + num1 + " and " + num2 + " is : " + (num1 + num2));
	}

	public static void main(String[] args) {
		System.out.println("Please enter two numbers : ");
		Scanner scanner = new Scanner(System.in);
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
		scanner.close();1

		System.out.println("First number : " + num1);
		System.out.println("Second number : " + num2);

		ScannerDemo scannerDemo = new ScannerDemo();
		scannerDemo.sum(num1, num2);
		
	}

};