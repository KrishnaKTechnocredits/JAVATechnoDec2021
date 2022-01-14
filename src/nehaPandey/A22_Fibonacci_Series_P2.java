package nehaPandey;

public class A22_Fibonacci_Series_P2 {
	void printFirstNNoOfFibonacciSeriesButStartNoFrom5(int n) {
		int num1 = 0;
		int num2 = 1;
		System.out.println("The fibonacci series from number 5 are: ");

		for (int i = 1; i <= n - 2; i++) {
			num2 = num1 + num2;
			num1 = num2 - num1;

			if (num2 >= 5) {
				System.out.println(num2);
			}

		}
	}

	public static void main(String[] args) {
		A22_Fibonacci_Series_P2 program2 = new A22_Fibonacci_Series_P2();
		program2.printFirstNNoOfFibonacciSeriesButStartNoFrom5(8);

	}

}
