/*Assignment 22 : 9th Jan 2022

Fibonacci Series:*
0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55,...

4. WAP for Fibonacci series for first 'n' numbers starting form 5.

*/

package vaibhav.Assignment_22;

public class FibonacciSeriesP4 {

	void fibonacciSeriesForFirstNNumbers(int numCount, int startingNum) {
		int count = 0;
		int num1 = 0;
		int num2 = 1;
		System.out.println("Fibonacci series for the first  " + numCount + " numbers starting from " + startingNum
				+ " are as below :");

		while (count < numCount) {
			if (num2 >= startingNum) {
				System.out.print(num2 + " , ");
				count++;
			}
			num2 = num1 + num2;
			num1 = num2 - num1;
		}
	}

	public static void main(String[] args) {
		FibonacciSeriesP4 fibonacciSeriesP4 = new FibonacciSeriesP4();
		fibonacciSeriesP4.fibonacciSeriesForFirstNNumbers(10, 5);
	}
}
