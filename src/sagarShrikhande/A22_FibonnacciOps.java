package sagarShrikhande;

public class A22_FibonnacciOps {

	void printFibonnaciNum(int n, int startNum) {
		int num1 = 0;
		int num2 = 1;
		if (num1 >= startNum) {
			System.out.println("First " + n + " Fibonacci series elements are: ");
			System.out.print(num1 + "  ");
			System.out.print(num2 + "  ");
		} else
			System.out.println(
					"Fibonnacci series till " + n + "th element of series starting from " + startNum + " are: ");
		for (int i = 0; i <= n - 2; i++) {
			num2 = num1 + num2;
			num1 = num2 - num1;
			if (num2 >= startNum)
				System.out.print(num2 + "  ");
		}
		System.out.println(" ");
	}

	void printFibonnaciNumInRange(int startNum, int endNum) {
		int num1 = 0;
		int num2 = 1;
		System.out.println("Fibonacci series elements in given range " + startNum + " & " + endNum + " are : ");
		while (num2 <= endNum) {
			num2 = num1 + num2;
			num1 = num2 - num1;
			if (num2 >= startNum & num2 <= endNum)
				System.out.print(num2 + "  ");
		}
		System.out.println(" ");
	}

	void printFibonnaciCountForSum(int inputSum) {
		int num1 = 0;
		int num2 = 1;
		int tempSum = 0;
		int count = 2;
		while (tempSum <= inputSum) {
			num2 = num1 + num2;
			num1 = num2 - num1;
			tempSum = tempSum + num2;
			count++;
		}
		System.out.println("Count is: " + count + " and current sum is: " + tempSum);
	}

	public static void main(String[] arr) {
		A22_FibonnacciOps a22 = new A22_FibonnacciOps();
		a22.printFibonnaciNum(8, 0);
		a22.printFibonnaciNum(10, 5);
		a22.printFibonnaciNumInRange(5, 34);
		a22.printFibonnaciCountForSum(50);
	}

}

/*
 * Assignment - 22 : 9th Jan'2022
 * 
 * Print fibonacci series for different variations as bellow
 * 
 * 1 . Print first n no of fibonacci series ( 8 numbers ) output : 0 1 1 2 3 5 8
 * 13 2 . Print first n no of fibonacci series but start no from 5 output : 5 8
 * 13 3 . Print first n no of fibonacci series but start no from 5 and End no is
 * 34 output : 5 8 13 21 34 4 . find how many no required from fibonacci series
 * to generate sum >=50 . output number count : 8
 */