package monikaArkade;

public class A22_Assignment22 {

	void nNumberofFibonacciSeries(int num) {
		int num1 = 0, num2 = 1;
		System.out.print(num1 + " ");
		System.out.print(num2 + " ");
		for (int index = 2; index < 8; index++) {
			num2 = num1 + num2;
			System.out.print(num2 + " ");
			num1 = num2 - num1;
		}
		System.out.println("");
	}

	void nNumberofFibonacciSeriesstart_5(int num) {
		int num1 = 0, num2 = 1;
		for (int index = 1; num2 < 13; index++) {
			num2 = num1 + num2;
			num1 = num2 - num1;
			if (num2 >= 5) {
				System.out.print(num2 + " ");
			}
		}
		System.out.println("");
	}

	void nNumberofFibonacciSeriesstart_5_end34(int stnum, int endno) {
		int num1 = 0, num2 = 1;
		for (int index = 1; num2 < endno; index++) {
			num2 = num1 + num2;
			num1 = num2 - num1;
			if (num2 >= stnum) {
				System.out.print(num2 + " ");
			}
		}
		System.out.println("");
	}

	void nNumberofFibonacciSeriesSum50(int num) {
		int num1 = 0, num2 = 1, sum = 2, count = 2;
		while (sum <= 50) {
			num2 = num1 + num2;
			num1 = num2 - num1;
			sum = sum + num2;
			count++;
		}
		System.out.println(" " + count);
	}

	public static void main(String[] args) {
		A22_Assignment22 fibonacci1 = new A22_Assignment22();
		System.out.println("n no. of");
		fibonacci1.nNumberofFibonacciSeries(8);
		System.out.println("--------------------");
		System.out.println("Start from 5");
		fibonacci1.nNumberofFibonacciSeriesstart_5(3);
		System.out.println("--------------------");
		System.out.println("Start from 5 end number 34");
		fibonacci1.nNumberofFibonacciSeriesstart_5_end34(5, 34);
		System.out.println("--------------------");
		System.out.println("Start from sum greater than 50");
		fibonacci1.nNumberofFibonacciSeriesSum50(50);

	}
}
