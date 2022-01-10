/*Assignment 22 : 9th Jan 2022

Fibonacci Series:*
0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55,...

3. WAP for Fibonacci series starting from 5 and end with 89
output : 5, 8, 13, 21, 34, 55, 89,

*/

package vaibhav.Assignment_22;

public class FibonacciSeriesP3 {

	void fibonacciSeries(int startNum, int endNum) {

		int num1 = 0;
		int num2 = 1;
		int count = 0;

		System.out.println("Fibonacci series starting from " + startNum + " and end with " + endNum + " is as below :");
		while (num2 <= endNum) {
			if (num2 >= startNum && num2 <= endNum)
				System.out.print(num2 + " , ");
			num2 = num1 + num2; // 1
			num1 = num2 - num1; // 
		}
	}

	public static void main(String[] args) {
		FibonacciSeriesP3 fibonacciSeriesP3 = new FibonacciSeriesP3();
		fibonacciSeriesP3.fibonacciSeries(5, 89);
	}

}
