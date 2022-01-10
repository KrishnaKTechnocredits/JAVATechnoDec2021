/*Assignment 22 : 9th Jan 2022

Fibonacci Series:*
0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55,...

1. WAP to print 1st 10 numbers of Fibonacci series using one temp variable.
output : 0, 1, 1, 2, 3, 5, 8, 13, 21, 34

2. WAP to print 1st 10 numbers of Fibonacci series without using temp variable.
output : 0, 1, 1, 2, 3, 5, 8, 13, 21, 34,

3. WAP for Fibonacci series starting from 5 and end with 85
output : 5, 8, 13, 21, 34, 55.

4. WAP for Fibonacci series for first 'n' numbers starting form 5.

5. WAP for Fibonacci series when sum of all the numbers are less than 100
output: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34

*/

package vaibhav.Assignment_22;

public class FibonacciSeriesP1 {

	void fibonacciSeriesWithTemp(int num) {
		int num1 = 0;
		int num2 = 1;
		int count = 0;
		System.out.println("Fibonacci Series for first " + num + " numbers is as below :");

		/*
		 * for (int index = 0; count <= num-1; index++) { int temp;
		 * System.out.print(num1 + " , "); temp = num1; num1 = num2; num2 = num1 + temp;
		 * count++; }
		 */

		while (count < num) {
			int temp;
			System.out.print(num1 + " , ");
			temp = num1; // 2
			num1 = num2; // 3
			num2 = num1 + temp; // 5
			count++;
		}
	}

	public static void main(String[] args) {
		FibonacciSeriesP1 fibonacciSeriesP1 = new FibonacciSeriesP1();
		fibonacciSeriesP1.fibonacciSeriesWithTemp(10);
	}
}
