package nehaPandey;

public class A22_Fibonacci_Series_P4 {
	void getNumberForFibonacciSeriesToGenerateSum(int n) {
		int num1 = 0;
		int num2 = 1;
		int count = 0;
		int sum = 0;

		while (num2 <= n) {
			num1 = num2 - num1;
			num2 = num1 + num2;
			sum = sum + num2;
			count++;

		}
		System.out.println("Total no required from fibonacci series to generate sum >=50 are : " + count);

	}

	public static void main(String[] args) {
		A22_Fibonacci_Series_P4 p4 = new A22_Fibonacci_Series_P4();
		p4.getNumberForFibonacciSeriesToGenerateSum(50);

	}
}
