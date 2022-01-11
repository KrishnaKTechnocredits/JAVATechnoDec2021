package naquibalam;

import java.util.Scanner;

public class A22_Fibonacci_Series {
	
	void getFibonacciSeries(int count) {
		int num1 = 0;
		int num2 = 1;
		int onCount = 1;
		if (count >= onCount) {
			System.out.print(num1 + "  ");
			onCount++;
		}
		if (count >= onCount) {
			System.out.print(num2 + "  ");
			onCount++;
		}
		for (int i = onCount; i <= count; i++) {
			System.out.print(num1 + num2 + "  ");
			num2 = num1 + num2;
			num1 = num2 - num1;
		}
	}
	
	void getFibonacciSeries_Start(int startValue, int count) {
		int num1 = 0;
		int num2 = 1;
		int onCount = 1;
		if ((num1 >= startValue)) {
			System.out.print(num1 + "  ");
			onCount++;
		} 
		if ((num2 >= startValue) && (onCount <= count)) {
			System.out.print(num2 + "  ");
			onCount++;
		}
		while(onCount <= count){
			num2 = num1 + num2;
			if (num2 >= startValue) {
				System.out.print(num2 + "  ");
				onCount++;
			}
			num1 = num2 - num1;
		}
	}
	
	void getFibonacciSeries_StartEnd(int startValue, int endValue, int count) {
		int num1 = 0;
		int num2 = 1;
		int onCount = 1;
		if ((num1 >= startValue)) {
			System.out.print(num1 + "  ");
			onCount++;
		} 
		if ((num2 >= startValue) && (onCount <= count)) {
			System.out.print(num2 + "  ");
			onCount++;
		}
		while(onCount <= count){
			num2 = num1 + num2;
			if ((num2 >= startValue) && (num2 <= endValue)) {
				System.out.print(num2 + "  ");
				onCount++;
			}
			num1 = num2 - num1;
		}
	}
	
	void getFibonacciSeries_Sum(int sumCheck) {
		int sum = 0;
		int num1 = 0;
		int num2 = 1;
		int onCount = 0;
		if ((sum <= sumCheck)) {
			sum = sum + num1;
			onCount++;
		} 
		if (sum <= sumCheck){
			sum = sum + num2;
			onCount++;
		}
		while(sum <= sumCheck){
			num2 = num1 + num2;
			num1 = num2 - num1;
			sum += num2;
			onCount++;
		}
		System.out.print(onCount);
	}

	public static void main(String[] args) {
		A22_Fibonacci_Series a22_Fibonacci_Series = new A22_Fibonacci_Series();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Generate specific number of values in Fibonacci series");
		System.out.println("Please enter the number of values you want in Fibonacci series : ");
		int number = scanner.nextInt();
		System.out.println("-----------------------------------Output-----------------------------------------");
		a22_Fibonacci_Series.getFibonacciSeries(number);
		System.out.println("\n----------------------------------------------------------------------------------\n\n");
		System.out.println("Generate specific number of values from specific start value");
		System.out.println("Please enter the start values from which you want Fibonacci series : ");
		int startNum = scanner.nextInt();
		System.out.println("Please enter the number of values you want in Fibonacci series : ");
		int count = scanner.nextInt();
		System.out.println("-----------------------------------Output-----------------------------------------");
		a22_Fibonacci_Series.getFibonacciSeries_Start(startNum,count);
		System.out.println("\n----------------------------------------------------------------------------------\n\n");
		System.out.println("Generate specific number of values from specific start value to specific end value in Fibonacci series");
		System.out.println("Please enter the start values from which you want Fibonacci series : ");
		int startNum1 = scanner.nextInt();
		System.out.println("Please enter the end values from which you want Fibonacci series : ");
		int endNum1 = scanner.nextInt();
		System.out.println("Please enter the number of values you want in Fibonacci series : ");
		int count1 = scanner.nextInt();
		System.out.println("-----------------------------------Output-----------------------------------------");
		a22_Fibonacci_Series.getFibonacciSeries_StartEnd(startNum1,endNum1,count1);
		System.out.println("\n----------------------------------------------------------------------------------\n\n");
		System.out.println("Generate total number of value required to get sum in Fibonacci series");
		System.out.println("Please enter the sum you want to check as 'greater than equal to' by adding values of Fibonacci series : ");
		int sum = scanner.nextInt();
		System.out.println("-----------------------------------Output-----------------------------------------");
		a22_Fibonacci_Series.getFibonacciSeries_Sum(sum);
		System.out.println("\n----------------------------------------------------------------------------------\n\n");
	}
}
