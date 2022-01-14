package nehaPandey;

public class A22_Fibonacci_Series_P3 {
	void printFirstNNoOfFibonacciSeriesButFromStartNoAndEndNo(int start, int end) {
		int num1 = 0;
		int num2 = 1;
		System.out.println("The fibonacci series from number 5 to 34 are: ");

		while (num2 < end) {
			num2 = num1 + num2;
			num1 = num2 - num1;
			if (num2 >= start) {

				System.out.println(num2);
			}
		}

	}

	public static void main(String[] args) {

		A22_Fibonacci_Series_P3 p3 = new A22_Fibonacci_Series_P3();
		p3.printFirstNNoOfFibonacciSeriesButFromStartNoAndEndNo(5, 34);
	}

}
