package yogeshNagar;

public class A22_FabonaciSeriesLogic {

	void getFirstNNumberFromSeries(int number) {
		int num1 = 0;
		int num2 = 1;
		int temp = 0;
		System.out.println(num1);
		System.out.println(num2);
		for (int index = 0; index < number - 2; index++) {
			temp = num1;
			num1 = num2;
			num2 = temp + num2;
			System.out.println(num2);
		}
	}

	void getNumberDefinedStartDigit(int number) {
		int num1 = 0;
		int num2 = 1;
		for (int index = 0; index < number - 2; index++) {
			num2 = num1 + num2;
			num1 = num2 - num1;
			if (num2 >= 5) {
				System.out.println(num2);
			}
		}
	}

	void getNumberInRange() {
		int num1 = 0;
		int num2 = 1;
		while (num2 < 38) {
			num2 = num1 + num2;
			num1 = num2 - num1;
			if (num2 >= 5 && num2 < 38) {
				System.out.println(num2);
			}
		}
	}

	void getNumberSum() {
		int num1 = 0;
		int num2 = 1;
		int count = 1;
		int sum = 0;
		while (sum <= 50) {
			num2 = num1 + num2;
			num1 = num2 - num1;
			sum = sum + num2;
			count++;
		}
		System.out.println(count);
	}

	public static void main(String[] args) {
		A22_FabonaciSeriesLogic fabLogic = new A22_FabonaciSeriesLogic();
		System.out.println("-------------Program 1------------");
		fabLogic.getFirstNNumberFromSeries(8);
		System.out.println("-------------Program 2------------");
		fabLogic.getNumberDefinedStartDigit(8);
		System.out.println("-------------Program 3------------");
		fabLogic.getNumberInRange();
		System.out.println("-------------Program 4------------");
		fabLogic.getNumberSum();
	}
}