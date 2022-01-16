package nishika;

public class A22_fibonaci_series {

	void findNnum(int n) {

		int num1 = 0;
		int num2 = 1;

		System.out.println(num1);
		System.out.println(num2);

		for (int index = 1; index <= n; index++) {

			num2 = num1 + num2;
			num1 = num2 - num1;

			System.out.println(num2);
		}
	}

	void findseries(int n) {

		int num1 = 5;
		int num2 = 8;

		System.out.println(num1);
		System.out.println(num2);

		for (int index = 1; index <= n - 2; index++) {

			num2 = num1 + num2;
			num1 = num2 - num1;

			System.out.println(num2);
		}
	}

	void printGivenRangeSeries() {

		int num1 = 0;
		int num2 = 1;

		for (int index = 1; num2 < 34; index++) {

			num2 = num1 + num2;
			num1 = num2 - num1;

			if (num2 >= 5) {
				System.out.println(num2);
			}
		}

	}

	void findNumAreRequire() {
		int sum = 0;
		int count = 0;
		int num1 = 0;
		int num2 = 1;

		while (sum <= 50) {

			num2 = num1 + num2;
			num1 = num2 - num1;

			sum = sum + num2;
			count++;
			// System.out.println(sum);
			// System.out.println(num2);
		}
		System.out.println(count);
	}

	public static void main(String[] args) {
		A22_fibonaci_series a22_fibonaci_series = new A22_fibonaci_series();
		a22_fibonaci_series.findNnum(5);
		System.out.println("........*.........*........");
		a22_fibonaci_series.findseries(3);
		System.out.println("........*.........*........");
		a22_fibonaci_series.printGivenRangeSeries();
		System.out.println("........*.........*........");
		a22_fibonaci_series.findNumAreRequire();
	}
}
