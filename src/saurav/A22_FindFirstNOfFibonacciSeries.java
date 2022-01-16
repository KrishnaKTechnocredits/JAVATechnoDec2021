package saurav;

public class A22_FindFirstNOfFibonacciSeries {

	void printNoOfFibonacciSeries(int num) {
		int firstNum = 0;
		int secondNum = 1;
		for (int index = 0; index <= num - 1; index++) {
			secondNum = firstNum + secondNum;
			System.out.println(firstNum);
			firstNum = secondNum - firstNum;
		}
	}

	void printNoOfFibonacciSeriesInRange() {
		int firstNum = 5;
		int secondNum = 8;
		System.out.println(firstNum);
		for (int index = 0; secondNum < 21; index++) {
			secondNum = firstNum + secondNum;
			firstNum = secondNum - firstNum;
			if (secondNum >= 5)
				System.out.println(firstNum);
		}
	}

	void printNoOfFibonacciSeriesInRange1() {
		int firstNum = 5;
		int secondNum = 8;
		System.out.println(firstNum);
		for (int index = 0; secondNum <= 34; index++) {
			secondNum = firstNum + secondNum;
			firstNum = secondNum - firstNum;
			System.out.println(firstNum);
		}
	}

	void input() {
		int firstNum = 0;
		int secondNum = 1;
		int count = 1;
		int sum = 0;
		for (int index = 0; sum <= 50; index++) {
			secondNum = firstNum + secondNum;
			firstNum = secondNum - firstNum;
			// System.out.println(secondNum );
			sum += secondNum;
			count++;
		}
		System.out.println();
		System.out.println(count);
	}

	public static void main(String[] a) {
		A22_FindFirstNOfFibonacciSeries fibonacci = new A22_FindFirstNOfFibonacciSeries();
		System.out.print("count of num to sum 50 ");
		fibonacci.input();
		System.out.println();
		System.out.println("num upto 8 in fibonacci series = ");
		fibonacci.printNoOfFibonacciSeries(8);
		System.out.println();
		System.out.println("finobacci num start from 5 = ");
		fibonacci.printNoOfFibonacciSeriesInRange();
		System.out.println();
		System.out.println("finobacci num in given  range = ");
		fibonacci.printNoOfFibonacciSeriesInRange1();
	}
}
