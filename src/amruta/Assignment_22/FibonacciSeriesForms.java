/*Assignment 22 : 9th Jan 2022

Print fibonacci series for different variations as bellow

1 . Print first n no of fibonacci series ( 8 numbers )
output : 0 1 1 2 3 5 8 13 
2 . Print first n no of fibonacci series but start no from 5
output : 5 8 13
3 . Print first n no of fibonacci series but start no from 5 and End no is 34
output : 5 8 13 21 34
4 . find how many no. required from fibonacci series to generate sum >=50 . 
output number count : 8

*/

package amruta.Assignment_22;

public class FibonacciSeriesForms {
	
	void fibonacciOfEightNum() {
		int num1 = 0;
		int num2 = 1;
		System.out.println("Fibonacci series started from number 5 to 8 : ");
		System.out.print(num1 + " ");
		System.out.print(num2 + " ");
		int n = 8;
		for(int index=1; index<=n-2; index++) {
			num2 = num1+num2;
			System.out.print(num2 + " ");
			num1 = num2-num1;
		}
	}
	
	void fibonacciNumStartfrom5() {
		int num1 = 0;
		int num2 = 1;
		int n = 8;
		System.out.println("Fibonacci series started from number 5 : ");
		for(int index=1; index<=n-2; index++) {
			num2 = num1+num2;
			num1 = num2-num1;
			if(num2>=5) {
				System.out.print(num2 + " ");
			}
		}
	}
	
	void fibonacciNumfrom5to34() {
		int num1 = 0;
		int num2 = 1;
		System.out.println("Fibonacci series from number 5 to 34: ");
		while(num2<34) {
			num2 = num1+num2;
			num1 = num2-num1;
			if(num2>=5) {
				System.out.print(num2 + " ");
			}
		}
	}
	
	void fibonacciSumGreaterOr50(int num) {
		int num1 = 0;
		int num2 = 1;
		int count = 2;
		int sum = 2;
		System.out.println("find count of Fibonacci series till sum reached greater than or equal to 50: ");
		while(sum <= num) {
			num2 = num1+num2;
			num1 = num2-num1;
			sum = sum + num2;
			count++;
		}
		System.out.println(count);
	}
	
	public static void main(String[] args) {
		FibonacciSeriesForms fibonacciseriesforms = new FibonacciSeriesForms();
		fibonacciseriesforms.fibonacciOfEightNum();
		System.out.println();
		fibonacciseriesforms.fibonacciNumStartfrom5();
		System.out.println();
		fibonacciseriesforms.fibonacciNumfrom5to34();
		System.out.println();
		fibonacciseriesforms.fibonacciSumGreaterOr50(50);
	}
}
