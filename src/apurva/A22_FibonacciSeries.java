package apurva;

public class A22_FibonacciSeries {
	/*
	 * 1 . Print first n no of fibonacci series ( 8 numbers ) output : 0 1 1 2 3 5 8
	 * 13
	 */

	void displayFibonacciSeries(int n) {
		int num1 = 0;
		int num2 = 1;
		System.out.println("The elements in given fibonacci series are: ");
		System.out.println("      " +num1 + "\n" + "      " +num2);
		for (int i = 1; i <= n - 2; i++) {
			num2 = num1 + num2;
			System.out.println("      " + num2);
			num1 = num2 - num1;
		}
	}

	/*
	 * Print first n no of fibonacci series but start no from 5 output : 5 8 13
	 */
	void displayElementsWithGivenStartRange(int n) {
		int num1 = 0;
		int num2 = 1;
		int startRange = 5;
		int count = 0;
		while (count < n) {
			num2 = num1 + num2;
			num1 = num2 - num1;
			if (num2 >= startRange) {
				System.out.println("      " + num2);
				count++;
			}
		}
	}

	/* Print first n no of fibonacci series but start no from 5 and End no is 34
	output : 5 8 13 21 34*/
	void displayFibonacciStartRangeEndRange(int startRange, int endRange) {
		int num1 = 0;
		int num2 = 1;
		int count = 0;
		System.out.println("Fibonacci series with elements starting from 5 till 34 element");
		System.out.println("      " + startRange);
		for (int i = 1; num2 < endRange; i++) {
			num2 = num1 + num2;
			num1 = num2 - num1;
			if (num2 > startRange) {
				System.out.println("      " + num2);
			}
		}
	}

	/* find how many no. required from fibonacci series to generate sum >=50 .
	 output number count : 9 {0,1,1,2,3,5,8,13,34}*/
	void displayElementswithGivenSum() {
		int num1 = 0;
		int num2 = 1;
		int sum = 2;
		int count = 2;
		while (sum <= 50) {
			num2 = num1 + num2;
			num1 = num2 - num1;
			sum = sum + num2;
			count++;
		}
		System.out.println("total count of elements whose sum is less than 50  is- " + count);
	}

	public static void main(String[] args) {
		new A22_FibonacciSeries().displayFibonacciSeries(8);
		System.out.println("  ");
		System.out.println("first n no of fibonacci series starting from 5");
		new A22_FibonacciSeries().displayElementsWithGivenStartRange(3);
		System.out.println("  ");
		new A22_FibonacciSeries().displayFibonacciStartRangeEndRange(5, 34);
		System.out.println("  ");
		new A22_FibonacciSeries().displayElementswithGivenSum();
	}

}