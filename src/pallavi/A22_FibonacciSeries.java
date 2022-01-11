/*Assignment - 22 : 9th Jan'2022

Print fibonacci series for different variations as bellow

1 . Print first n no of fibonacci series ( 8 numbers )
output : 0 1 1 2 3 5 8 13 
2 . Print first n no of fibonacci series but start no from 5
output : 5 8 13
3 . Print first n no of fibonacci series but start no from 5 and End no is 34
output : 5 8 13 21 34
4 . find how many no required from fibonacci series to generate sum >=50 . 
output number count : 8
*/

package pallavi;

public class A22_FibonacciSeries {

	void printNFiboNum(int count) {
		int num1 = 0;
		int num2 = 1;
		System.out.println("First " + count + " numbers of Fobonacci series:");
		System.out.print(num1 + " ");
		System.out.print(num2 + " ");

		for (int i = 1; i <= count; i++) {
			num2 = num2 + num1;
			num1 = num2 - num1;
			System.out.print(num2 + " ");
		}
	}

	void printNFiboNumwithStart(int startNum, int count) {
		int num1 = 0;
		int num2 = 1;
		int cnt = 1;
		System.out.println("First " + count + " numbers of Fobonacci series starting from " + startNum + " :");

		while (cnt <= count) {
			num2 = num2 + num1;
			num1 = num2 - num1;
			if (num2 >= 5) {
				System.out.print(num2 + " ");
				cnt++;
			}
		}
	}

	void pritFiboWithStartEnd(int startNum, int endNum) {
		int num1 = 0;
		int num2 = 1;
		System.out.println("Fibonacci numbers starting from " + startNum + " to " + endNum+":");

		while (num2 < endNum) {
			num2 = num1 + num2;
			num1 = num2 - num1;
			if (num2 >= startNum)
				System.out.print(num2 + " ");
		}
	}

	void printCountOfFiboNum(int givenSum) {
		int num1 = 0;
		int num2 = 1;
		int cnt = 2;
		int sum = 1;
		System.out.println("Count of Fibonacci numbers for Sum=" + givenSum + ":");

		while (sum <= givenSum) {
			num2 = num1 + num2;
			num1 = num2 - num1;
			sum = sum + num2;
			cnt++;
		}
		System.out.println(cnt);
	}

	public static void main(String[] args) {
		A22_FibonacciSeries a22_FibonacciSeries = new A22_FibonacciSeries();
		a22_FibonacciSeries.printNFiboNum(8);
		System.out.println("");
		a22_FibonacciSeries.printNFiboNumwithStart(5, 8);
		System.out.println("");
		a22_FibonacciSeries.pritFiboWithStartEnd(5, 34);
		System.out.println("");
		a22_FibonacciSeries.printCountOfFiboNum(50);
	}

}
