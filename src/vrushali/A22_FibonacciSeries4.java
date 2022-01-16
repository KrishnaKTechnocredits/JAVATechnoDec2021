/*find how many no required from fibonacci series to generate sum >=50 . 
output number count : 8
 */

package vrushali;

public class A22_FibonacciSeries4 {

	void printFibonacciSeriesinGivenRange() {
		int num1 = 0;
		int num2 = 1;
		int sum = 0;
		int count = 1;

		for(int index = 0; sum <= 50 ; index++) {
			num2 = num1 + num2;
			num1 = num2 - num1;
			sum = sum + num2;
			count++;
		}
		System.out.println("Count: " + count);
	}

	public static void main(String[] args) {		
		A22_FibonacciSeries4 fibonacciSeries4 = new A22_FibonacciSeries4();
		fibonacciSeries4.printFibonacciSeriesinGivenRange();
	}
}
