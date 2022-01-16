package vaishnavi;

public class A22_FibonacciSeriesExamples {

	void printNNumberOfFibonacciSeries(int num) {
		int num1 = 0;
		int num2 = 1;
		int temp = 0;
		
		System.out.println(num1);
		System.out.println(num2);
		
		for(int i = 1; i <= num-2; i++) {
			temp = num1;
			num1 = num2;
			num2 = temp + num2;
			System.out.println(num2);
		}
		
	}
	
	void fibonacciSeriesStartFromFive(int num) {
		int num1 = 0;
		int num2 = 1;
		
		for(int i = 1; i <= num-2; i++) {
			num2 = num1 + num2;
			num1 = num2 - num1;
			if (num2 >= 5) 
			System.out.println(num2);
	}
}
	
	void printFibonacciSeriesInRange() {
		int num1 = 0;
		int num2 = 1;
		
		while (num2 < 38) {
			num2 = num1 + num2;
			num1 = num2 - num1;
			if(num2 >= 5 && num2 < 38) {
				System.out.println(num2);
		}
	}
}
	
	void generateSumFromFibonacciSeries() {
		int num1 = 0;
		int num2 = 1;
		int sum = 0;
		int count = 1;
		while (sum <= 50) {
			num2 = num1 + num2;
			num1 = num2 - num1;
			sum = sum + num2;
			count++;
		}
		System.out.println(count);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		A22_FibonacciSeriesExamples a22_FibonacciSeriesExamples = new A22_FibonacciSeriesExamples();
		System.out.println("Program 1");
		System.out.println("First n no of fibonacci series is : ");
		a22_FibonacciSeriesExamples.printNNumberOfFibonacciSeries(8);
		
		System.out.println();
		System.out.println("Program 2");
		System.out.println("First n no of fibonacci series but start from five is : ");
		a22_FibonacciSeriesExamples.fibonacciSeriesStartFromFive(8);
		
		System.out.println();
		System.out.println("Program 3");
		System.out.println("First n no of fibonacci series but start from 5 and end at 38 is : ");
		a22_FibonacciSeriesExamples.printFibonacciSeriesInRange();
		
		System.out.println();
		System.out.println("Program 4");
		System.out.println("Sum of fibonacci series is : ");
		a22_FibonacciSeriesExamples.generateSumFromFibonacciSeries();
		
	}

}
