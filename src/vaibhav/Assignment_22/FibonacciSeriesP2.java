/*Assignment 22 : 9th Jan 2022

Fibonacci Series:*
0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55,...

2. WAP to print 1st 10 numbers of Fibonacci series without using temp variable.
output : 0, 1, 1, 2, 3, 5, 8, 13, 21, 34,

*/

package vaibhav.Assignment_22;

public class FibonacciSeriesP2 {

	void fibonacciSeriesWithoutTemp(int num) {
		int num1 = 0;
		int num2 = 1;
		int count = 0;

		System.out.println("Fibonacci Series for first " + num + " numbers is as below :");

		for (int index = num1; count < 10; index++) {
			System.out.print(num1 + " , ");
			num1 = num1 + num2;
			num2 = num1 - num2;
			count++;
		}
	}

	public static void main(String args[]) {
		FibonacciSeriesP2 fibonacciSeriesP2 = new FibonacciSeriesP2();
		fibonacciSeriesP2.fibonacciSeriesWithoutTemp(10);
	}

}
