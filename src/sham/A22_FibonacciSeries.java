package sham;

import java.util.Scanner;

public class A22_FibonacciSeries {
	int num1=0, num2;

	void printFibonacciNumbers(int n) {
		num1 = 0;
		num2 = 1;
		System.out.println("Printing Fibo Series...");
		System.out.println("First Number is: " + num1);
		System.out.println("Second Number is: " + num2);
		for (int i = 1; i <= n; i++) {
			num2 = num1 + num2;
			num1 = num2 - num1;
			System.out.print(num2 + " ");
		}
		System.out.println("");
	}

	void printFibonacciFromResquestedNumbers(int numRange, int requiredInput) {
		num1 = 0;
		num2 = 1;
		System.out.println("Second method to print Fibo from Requested Number " + requiredInput);
		for (int i = 1; i <= numRange; i++) {
			num2 = num1 + num2;
			num1 = num2 - num1;

			if (num2 >= requiredInput) {
				System.out.print(num2 + " ");
			}

		}
		System.out.println("");
	}

	void printFromResquestedNumbersToEndNum(int numRange, int fromInputRange, int endRange) {
		num1 = 0;
		num2 = 1;
		System.out.print("Third method to print Fibo from Requested Number " + fromInputRange
				+ " to Requested End Number " + endRange);
		System.out.println();
		for (int i = 1; i <= numRange; i++) {
			num2 = num1 + num2;
			num1 = num2 - num1;
			// System.out.println("");
			if (num2 >= fromInputRange && num2 <= endRange) {
				System.out.print(num2 + " ");
			}

		}
		System.out.println();
	}

	void printFibonacciSumCount(int numRange, int requiredInput) {
		num1 = 0;
		num2 = 1;
		int sum = 0, count = 0;
		System.out.println("Fourth method to print fibonacci series to generate sum and check how many numbers are Rquired:  ");

		for (int i = 1; i <= numRange; i++) {
			num2 = num1 + num2;
			num1 = num2 - num1;

			if (num2 >= requiredInput) {
				//System.out.print(num2 + " ");
				sum = sum + num2;
				if (sum <= 50) {
					count++;
				}
			}

		}
		System.out.println("Total " + (count + 2) + " Numbers are Required for generate the sum");
	}

	public static void main(String[] args) {

		A22_FibonacciSeries fibo = new A22_FibonacciSeries();
		fibo.printFibonacciNumbers(10);
		fibo.printFibonacciFromResquestedNumbers(6, 5);
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter How many Numbers you Want: ");
		int numRange = sc.nextInt();

		System.out.println("Enter the Number from where to Start: ");
		int fromInputRange = sc.nextInt();

		System.out.println("Enter the Number from where to End: ");
		int endRange = sc.nextInt();
		fibo.printFromResquestedNumbersToEndNum(numRange, fromInputRange, endRange);

		fibo.printFibonacciSumCount(10, 1);
		sc.close();

	}

}
