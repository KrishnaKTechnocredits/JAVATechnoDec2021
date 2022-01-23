package jayashri;

public class A22_FibonacciSeries {
	void printAll() {
		int num1 = 0;
		int num2 = 1;
		int n = 8;
		System.out.println(num1);
		System.out.println(num2);
		for (int i = 1; i < n - 2; i++) {
			num2 = num1 + num2;
			num1 = num2 - num1;
			System.out.println(num1 + num2);
		}
	}
	void startFrm5() {
		int num1 = 0;
		int num2 = 1;
		System.out.println("------------Fibonacci series starting from 5-----------------");
		for (int i = 1; num2 < 13; i++) {
			num2 = num1 + num2;
			num1 = num2 - num1;
			if (num2 >= 5) {
				System.out.println(num2);
			}
		}
	}
	void startFrm5end34(int strt, int end) {
		int num1 = 0;
		int num2 = 1;
		System.out.println("------------Fibonacci series starting from 5 & ends with 34-----------------");
		for (int i = 1; num2 < end; i++) {
			num2 = num1 + num2;
			num1 = num2 - num1;
			if (num2 >= 5) {
				System.out.println(num2);
			}
		}
	}
	void findsum() {
		int num1 = 0;
		int num2 = 1;
		int sum = 0;
		int count = 1;
		System.out.println("-----------------------------------------------------");
		for (int index = 0; sum <= 50; index++) {
			num2 = num1 + num2;
			num1 = num2 - num1;
			sum = sum + num2;
			count++;
		}
		System.out.println("Total numbers required from fibonacci series to generate sum >=50: " + count);
	}
	public static void main(String[] args) {
		A22_FibonacciSeries fb = new A22_FibonacciSeries();
		fb.printAll();
		fb.startFrm5();
		fb.startFrm5end34(5, 34);
		fb.findsum();
	}
}
