/*Assignment 22 : 9th Jan 2022

Fibonacci Series:*
0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55,...

5. WAP for Fibonacci series when sum of all the numbers are less than 100
output: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34

*/

package vaibhav.Assignment_22;

public class FibonacciSeriesP5 {

	void fibonacciSeriesWithTargetedSum(int targetedSum) {
		int num1 = 0;
		int num2 = 1;
		int sum = 0;
		System.out.println(
				"Fibonacci series when sum of all the numbers is less than " + targetedSum + ", are as below : ");
		while (sum <= 100) {
			System.out.print(num1 + " , ");
			num2 = num1 + num2;
			num1 = num2 - num1;
			sum = num1 + num2;
		}
	}

	public static void main(String[] args) {
		FibonacciSeriesP5 fibonacciSeriesP5 = new FibonacciSeriesP5();
		fibonacciSeriesP5.fibonacciSeriesWithTargetedSum(100);
	}
}
