package pradeep;

import java.util.Scanner;

public class A22_FibonacciSeries {
	void printFirstN(int n) {
		int num1 = 0;
		int num2 = 1;
		System.out.print(num1+" ");
		System.out.print(num2+" ");
		for (int index = 1; index <= n - 2; index++) {
			System.out.print(num1 + num2 +" ");
			int temp = num1;
			num1 = num2;
			num2 = temp + num2;
		}
	}

	void printFibonacciFrom5(int n) {
		int num1 = 0;
		int num2 = 1;
		for (int index = 1; index <= n - 2; index++) {
			if (num1 + num2 >= 5) {
				System.out.print(num1 + num2+" ");
			}
			int temp = num1;
			num1 = num2;
			num2 = temp + num2;
		}
	}

	void printFibonacciInRange(int n) {
		int num1 = 0;
		int num2 = 1;
		for (int index = 1; index <= n - 2; index++) {
			if ((num1 + num2) >= 5 && (num1 + num2) <= 34) {
				System.out.print(num1 + num2+" ");
			}
			int temp = num1;
			num1 = num2;
			num2 = temp + num2;
		}
	}

	int getFibonacciSeriesTotalNum(int n) {
		int num1 = 0;
		int num2 = 1;
		int count = 0;
		for (int index = 1; index <= n - 2; index++) {
			if ((num1 + num2) <= 50) {
				count++;
			}
			int temp = num1;
			num1 = num2;
			num2 = temp + num2;
		}
		return count;
	}

	public static void main(String[] args) {
		A22_FibonacciSeries a22_FibonacciSeries = new A22_FibonacciSeries();
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter n: ");
		int n = sc.nextInt();
		System.out.println("Print first" + n + " no of fibonacci series");
		a22_FibonacciSeries.printFirstN(n);

		System.out.println("\nPrint first " + n + " no of fibonacci series but start no from 5");
		a22_FibonacciSeries.printFibonacciFrom5(n);

		System.out.println("\nPrint first " + n + " no of fibonacci series but start no from 5 and End no is 34");
		a22_FibonacciSeries.printFibonacciInRange(n);

		System.out.println("\nfind how many no required from fibonacci series to generate sum >=50");
		int count = a22_FibonacciSeries.getFibonacciSeriesTotalNum(n);
		System.out.println("no required from fibonacci series to generate sum >=50 is: " + count);
	}
}
