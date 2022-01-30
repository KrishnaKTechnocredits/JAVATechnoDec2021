package omkar;

public class A22_FibonacciSeries {

	void displayFirstNNumbersInFiboSeries(int n) {
		int num1 = 0;
		int num2 = 1;
		System.out.println("The Fibonacci Series for " + n + " elements are : ");
		System.out.print(num1 + " ");
		System.out.print(num2 + " ");

		for (int index = 1; index <= n - 2; index++) {
			num2 = num2 + num1;
			System.out.print(num2 + " ");
			num1 = num2 - num1;
		}
	}
	void displayFirstNNumbersInFiboSeriesStartingWithFive(int n) {
		int num1 = 0;
		int num2 = 1;
		int count = 0;

		System.out.println("The Fibonacci Series for " + n + " elements are : ");

		while (count != n) {
			num2 = num2 + num1;
			if (num2 >= 5) {
				System.out.print(num2 + " ");
				count++;
			}
			num1 = num2 - num1;
		}
	}
	void displayNumbersInFiboSeriesWithinFiveAndThirtyFour() {
		int num1 = 0;
		int num2 = 1;

		System.out.println("The Fibonacci Series from 5 To 34 are : ");

		while (num2 != 34) {
			num2 = num2 + num1;
			if (num2 >= 5)
				System.out.print(num2 + " ");
			num1 = num2 - num1;
		}
	}
	void displayCountToGetSumOFFiftyInFiboSeries() {
		int num1 = 0;
		int num2 = 1;
		int count = 2;
		int sum = 2;

		while (sum <= 50) {
			num2 = num2 + num1;
			num1 = num2 - num1;
			sum = sum + num2;
			count++;
		}

		System.out.println("The Total numbers required from Fibonacci Series to get a sum of 50 : " + count);
	}
	

	public static void main(String[] args) {
		A22_FibonacciSeries a22 = new A22_FibonacciSeries();
		a22.displayFirstNNumbersInFiboSeries(8);
		a22.displayFirstNNumbersInFiboSeriesStartingWithFive(8);
		a22.displayNumbersInFiboSeriesWithinFiveAndThirtyFour();
		a22.displayCountToGetSumOFFiftyInFiboSeries();
	}
}
