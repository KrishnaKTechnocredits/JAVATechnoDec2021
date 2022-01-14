package nehaPandey;

public class A22_Fibonacci_Series_P1 {
	void printFirstNNoOfFibonacciSeries(int n) {

		int num1 = 0;
		int num2 = 1;

		System.out.println("The fibonacci series for " + n + " elements are: ");
		System.out.println(num1 + " ");
		System.out.println(num2 + " ");

		for (int i = 1; i <= n - 2; i++) {
			num2 = num1 + num2;
			System.out.println(num2 + " ");
			num1 = num2 - num1;

		}
	}

	public static void main(String[] args) {

		A22_Fibonacci_Series_P1 a22 = new A22_Fibonacci_Series_P1();
		a22.printFirstNNoOfFibonacciSeries(8);
	}

}
