package hevin;

public class A22_Fibonacci {

	void fibonacciSeries(int n) {
		int num1=0;
		int num2=1;
		System.out.print(num1 + " ");
		for(int i=1;i<=n-2;i++) {
			num1 = num2 - num1;
			num2 = num1 + num2;
			System.out.print(num1+ " ");
		}
	}

	void fibonacciFromFive(int start,int end) {
		int num1=0;
		int num2=1;
		int temp = 0;
		while(temp<=end-1) {
			num1 = num2-num1;
			num2 = num1 + num2;
			if(num2>=start) {
				System.out.print(num2 + " ");
				temp++;
			}
		}
	}

	void givenRangeFibonacci(int start,int end) {
		int num1=0;
		int num2=1;
		while(num2<end) {
			num1 = num2-num1;
			num2 = num1 + num2;
			if(num2>=start) {
				System.out.print(num2 + " ");
			}
		}
	}

	void getSumInFibonacci(int num) {
		int num1=0;
		int num2=1;
		int count=0;
		int sum = 0;
		while(num2<=num) {
			num1 = num2-num1;
			num2 = num1 + num2;
			sum = sum + num2;
			count++;
		}
		System.out.println(count);
	}

	public static void main(String[] args) {
		A22_Fibonacci A22_Fibonacci = new A22_Fibonacci();
		System.out.print("Given no of fibonacci series are : ");
		A22_Fibonacci.fibonacciSeries(8);
		System.out.println("");

		System.out.print("Fibonacci series start no from 5 are : ");
		A22_Fibonacci.fibonacciFromFive(5,3);
		System.out.println("");
		
		System.out.print("Fibonacci series from number 5 to 34 are: ");
		A22_Fibonacci.givenRangeFibonacci(5,34);
		System.out.println("");
		
		System.out.print("Total Fibonacci numbers required to generate sum <=50 : ");
		A22_Fibonacci.getSumInFibonacci(50);
	}
}