/*Assignment - 22 : 9th Jan'2022

Print fibonacci series for different variations as bellow

1 . Print first n no of fibonacci series ( 8 numbers )
output : 0 1 1 2 3 5 8 13 
2 . Print first n no of fibonacci series but start no from 5
output : 5 8 13
3 . Print first n no of fibonacci series but start no from 5 and End no is 34
output : 5 8 13 21 34
4 . find how many no. required from fibonacci series to generate sum >=50 . 
output number count : 8
 */
package shwetaDharmadhikari.fibonacci_Series;

public class Assign_22_PrintFibonacciSeries {

	void displayFibonacciSeries(int number) {
		int num1 = 0;
		int num2 = 1;

		if (number >= 2) {
			System.out.print(num1 + " ");
			System.out.print(num2 + " ");
		} else if (number >= 1) {
			System.out.println("numbers are: " + num2);
		}
		for (int index = 1; index < number - 2; index++) {
			num2 = num1 + num2;
			System.out.print(num2 + " ");
			num1 = num2 - num1;
		}
	}

	void printFibonacciSeries(int number) {
		int num1 = 0;
		int num2 = 1;
		int temp = 0;
		for (int index = 1; index <= number; index++) {
			/*
			 * num2 = num1 + num2; num1 = num2 - num1;
			 */
			// Another way with temp variable
			temp = num1;
			num1 = num2;
			num2 = temp + num2;

			if (num2 >= 5) {
				System.out.print(num2 + " ");
			}
		}
	}

	void printFibonacciSeries() {
		int num1 = 0;
		int num2 = 1;
		for (int index = 1; num2 < 34; index++) {
			num2 = num1 + num2;
			num1 = num2 - num1;

			if (num2 >= 5) {
				System.out.print(num2 + " ");
			}
		}
	}

	void printSumOfFibonacciSeries() {
		int num1 = 0;
		int num2 = 1;
		int sum = 2;
		int count = 2;
		while (sum <= 50) {
			num2 = num1 + num2;
			num1 = num2 - num1;
			sum += num2;
			count++;
		}
		System.out.println("Count is :" + count);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assign_22_PrintFibonacciSeries assign_22_PrintFibonacciSeries = new Assign_22_PrintFibonacciSeries();
		System.out.println("Fibonacci Series :");
		assign_22_PrintFibonacciSeries.displayFibonacciSeries(8);
		System.out.println(" ");
		System.out.println("Fibonacci Series starting from 5:");
		assign_22_PrintFibonacciSeries.printFibonacciSeries(6);
		System.out.println(" ");
		System.out.println("Print Fibonacci Series starting from 5 to 34:");
		assign_22_PrintFibonacciSeries.printFibonacciSeries();
		System.out.println(" ");
		assign_22_PrintFibonacciSeries.printSumOfFibonacciSeries();
	}
}
