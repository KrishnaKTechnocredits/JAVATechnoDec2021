/*Print fibonacci series for different variations as bellow
1 . Print first n no of fibonacci series ( 8 numbers )
output : 0 1 1 2 3 5 8 13 */

package vrushali;

public class A22_FibonacciSeries1 {

	void printFibonacciSeries(int num) {
		int num1 = 0;
		int num2 = 1;
		System.out.print(num1 + " " + num2);

		for(int index = 1; index <= num-2; index++ ) {
			num2= num1 + num2;
			num1 = num2 - num1;
			System.out.print(" " + num2);
		}
	}

	public static void main(String[] args) {
		A22_FibonacciSeries1 fibonacciSeries1 = new A22_FibonacciSeries1();
		fibonacciSeries1.printFibonacciSeries(8);
	}
}
