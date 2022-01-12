package pranoti;

public class A22_FibonacciSeriesOps {

	void printFirstN(int n) {
		System.out.println("Fibonacci series for first " + n + " numbers :");
		int num1 = 0, num2 = 1;
		System.out.print(num1 + " ");
		System.out.print(num2 + " ");
		for (int index = 1; index <= n - 2; index++) {
			num2 = num1 + num2;
			System.out.print(num2 + " ");
			num1 = num2 - num1;
		}
		System.out.println(" ");
	}

	void printFromsStartNumber(int startNum) {
		System.out.println("Fibonacci series starting from " + startNum + "  :");
		int num1 = 0, num2 = 1;
		while (num2 < 21) {
			num2 = num1 + num2;
			num1 = num2 - num1;
			if (num2 >= startNum)
				System.out.print(num2 + " ");
		}
		System.out.println(" ");
	}

	void printFromsStarttoEnd(int startNum, int endNum) {
		System.out.println("Fibonacci series from " + startNum + " to " + endNum + " :");
		int num1 = 0, num2 = 1;
		while (num2 < endNum) {
			num2 = num1 + num2;
			num1 = num2 - num1;
			if (num2 >= startNum && num2 <= endNum)
				System.out.print(num2 + " ");
		}
		System.out.println("");
	}

	void printSumCount(int totalSum) {
		System.out.println(
				"Total numbers required from fibonacci series to generate sum greater than " + totalSum + " :");
		int num1 = 0, num2 = 1, count = 2, sum = 0;
		while (sum <= totalSum) {
			num2 = num1 + num2;
			num1 = num2 - num1;
			sum = sum + num2;
			count++;
		}
		System.out.println(count);
	}

	public static void main(String[] args) {
		A22_FibonacciSeriesOps a22 = new A22_FibonacciSeriesOps();
		a22.printFirstN(8);
		a22.printFromsStartNumber(5);
		a22.printFromsStarttoEnd(5, 34);
		a22.printSumCount(50);
	}
}
