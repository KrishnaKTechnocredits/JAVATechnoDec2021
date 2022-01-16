package kalyani;

import java.util.Scanner;

public class A22_FibonacciSeries1 {

	void printFibonacciSeries(int num) {
		int num1 = 0;
		int num2 = 1;
		
		if(num >= 2) {
			System.out.print(num1 + " " + num2 + " ");
		}else if(num == 1) {
			System.out.print(num1 + " ");
		}

		for (int i=1; i<=num-2; i++) {
			num2 = num1 + num2;
			num1 = num2 - num1;
			System.out.print(num2+ " ");
		}
	}

	public static void main(String[] args) {
		A22_FibonacciSeries1 fibonacci = new A22_FibonacciSeries1();
		Scanner scanner =new Scanner(System.in);
		System.out.println("Enter count of number to display from series : ");
		int count = scanner.nextInt();
		fibonacci.printFibonacciSeries(count);
		scanner.close();
	}
}