/*Print fibonacci series for different variations as bellow

	1 . Print first n no of fibonacci series ( 8 numbers )
	output : 0 1 1 2 3 5 8 13 
	2 . Print first n no of fibonacci series but start no from 5
	output : 5 8 13
	3 . Print first n no of fibonacci series but start no from 5 and End no is 34
	output : 5 8 13 21 34
	4 . find how many no. required from fibonacci series to generate sum >=50 . 
	output number count : 8*/

package poojaJoshi;

public class Assignment22_fibonacciSeries {

	void firstFibo() {
		int num1 = 0;
		int num2 = 1;
		int count = 8;
		System.out.print(num1 + " " + num2);
		for (int index = 2; index < count; ++index) {
			int num3 = num1 + num2;
			System.out.print(" " + num3 + " ");
			num1 = num2;
			num2 = num3;

		}

	}

	void secondFibo() {
		int num1 = 5;
		int num2 = 8;
		int count = 3;
		System.out.println("");
		System.out.print(num1 + " " + num2);
		for (int index = 2; index < count; ++index) {
			int num3 = num1 + num2;
			System.out.print(" " + num3);
			num1 = num2;
			num2 = num3;
		}
	}

	void thirdFibo() {
		int num1 = 5;
		int num2 = 8;
		int count = 5;
		System.out.println("");
		System.out.print(num1 + " " + num2);
		for (int index = 2; index < count; ++index) {
			int num3 = num1 + num2;
			System.out.print(" " + num3);
			num1 = num2;
			num2 = num3;
		}
	}

	void numRequiredForSum() {
		int num1 = 0;
		int num2 = 1;
		int sum = 0;
		int count = 1;

		while(sum<=50) {
			num2 = num1 + num2;
			num1 = num2 - num1;
			sum = sum + num2;
			count++;

		}
		System.out.println("");
		System.out.println("Count is : " + count);
	}

	public static void main(String[] args) {
		Assignment22_fibonacciSeries fibonacci = new Assignment22_fibonacciSeries();
		fibonacci.firstFibo();
		fibonacci.secondFibo();
		fibonacci.thirdFibo();
		fibonacci.numRequiredForSum();
	}
}
