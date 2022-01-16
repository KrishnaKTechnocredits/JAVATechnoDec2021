package archana;
public class Ass22_FibonacciSeriesVariations {
	// 0 1 1 2 3 5 8 13 21 34...
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

		Ass22_FibonacciSeriesVariations ass22 = new Ass22_FibonacciSeriesVariations();
		System.out.println("----n no. of ------");
		ass22.nNumberofFibonacciSeries(8);

		System.out.println("----Start from 5 ------");
		ass22.nNumberofFibonacciSeriesstart_5(3);

		System.out.println("----Start from 5 end np 34 ------");
		ass22.nNumberofFibonacciSeriesstart_5_end34(5, 34);

		System.out.println("----Start from sum greater than 50 ------");
		ass22.nNumberofFibonacciSeriesSum50(50);

	}
}
