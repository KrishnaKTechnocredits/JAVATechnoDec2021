package anvit;

public class A22_Fibonacci_Series {
	
	void regularFibonacci(int n) {
		int num1=0;
		int num2=1;
		System.out.print(num1 + " ");
		for(int i=1;i<=n-2;i++) {
			num1 = num2 - num1;
			num2 = num1 + num2;
			System.out.print(num1+ " ");
		}
	}
	
	void startFibonacci(int start,int end) {
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
	
	void startFibonacciEndNum(int start,int end) {
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
	
	void sumOfNumInFibonaaci(int num) {
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
		A22_Fibonacci_Series a22_Fibonacci_Series = new A22_Fibonacci_Series();
		System.out.print("First n no of fibonacci series ( 8 numbers ) are : ");
		a22_Fibonacci_Series.regularFibonacci(8);
		System.out.println();
		
		System.out.print("First n no of fibonacci series but start no from 5 are: ");
		a22_Fibonacci_Series.startFibonacci(5,3);
		System.out.println();
		
		System.out.print("First n no of fibonacci series but start no from 5 and End no is 34 are: ");
		a22_Fibonacci_Series.startFibonacciEndNum(5,34);
		System.out.println();
		
		System.out.print("Number required from fibonacci series to generate sum <=50: ");
		a22_Fibonacci_Series.sumOfNumInFibonaaci(50);
	}
}
