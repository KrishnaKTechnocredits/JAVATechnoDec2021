/*Print first n no of fibonacci series but start no from 5 and End no is 34
output : 5 8 13 21 34
 */

package vrushali;

public class A22_FibonacciSeries3 {

	void printFibonacciSeriesinGivenRange(int startNum, int endNum) {
		int num1 = 0;
		int num2 = 1;

		for(int index = 1; num2 < endNum ; index++) {
			num2 = num1 + num2;
			num1 = num2 - num1;
			if(num2 >=5)
				System.out.print(" " +num2);
		}
	}

	public static void main(String[] args) {
		A22_FibonacciSeries3 fibonacciSeries3 = new A22_FibonacciSeries3();
		fibonacciSeries3.printFibonacciSeriesinGivenRange(5, 34);
	}
}
