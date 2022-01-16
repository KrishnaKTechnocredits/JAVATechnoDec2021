/*Print first n no of fibonacci series but start no from 5
output : 5 8 13*/

package vrushali;

public class A22_FibonacciSeries2 {

	void printFibonacciSeries_5(int num) {
		int num1 = 0;
		int num2 = 1;

		for(int index = 1; num2 < 13; index++) {
			num2 = num1 + num2;
			num1 = num2 - num1;
			if(num2 >= 5)
				System.out.print(" " + num2);
		}
	}

	public static void main(String[] args) {
		A22_FibonacciSeries2 fibonacciSeries2 = new A22_FibonacciSeries2();
		fibonacciSeries2.printFibonacciSeries_5(2);
	}
}
