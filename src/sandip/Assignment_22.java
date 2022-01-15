package sandip;

public class Assignment_22 {

	void febonaSeries(int num1, int num2, int itteration) {
		System.out.print(" " + num1);
		System.out.print(" " + num2);
		for (int i = 1; i <= itteration - 2; i++) {
			int temp = num1;
			num1 = num2;
			num2 = temp + num1;
			System.out.print(" " + num2);
		}
	}

	void inBetweenFebona(int start, int itteration) {
		int num1 = 0;
		int num2 = 1;
		for (int i = 1; i <= itteration; i++) {
			int temp = num1;
			num1 = num2;
			num2 = temp + num1;
			if (num2 >= start) {
				System.out.print(" " + num2);
			}
		}
	}

	void startEnd(int start, int end) {
		int num1 = 0;
		int num2 = 1;
		for (int i = 1; i <= end; i++) {
			int temp = num1;
			num1 = num2;
			num2 = temp + num1;
			if (num2 >= start && num2 <= end) {
				System.out.print(" " + num2);
			}
		}
	}

	void countNumber(int num) {
		int num1 = 0;
		int num2 = 1;
		int count = 0;
		for (int i = 1; i <= num; i++) {
			int temp = num1;
			num1 = num2;
			num2 = temp + num1;
			if (num2 <= num) {
				count++;
			}
		}
		System.out.print("Number of count required for " + num + " : " + count);
	}

	void numberAddition() {
		int num1 = 0;
		int num2 = 1;
		int sum = 0;
		int count = 0;
		for (int i = 1; i <= 50; i++) {
			int temp = num1;
			num1 = num2;
			num2 = temp + num1;
			sum = sum + num2;
			count++;
			if (sum >= 50) {
				break;
			}
		}
		System.out.println("Febona Addition : " + sum + " count : " + count);
	}

	public static void main(String[] args) {
		Assignment_22 a1 = new Assignment_22();
		a1.febonaSeries(0, 1, 15);
		System.out.println();
		a1.inBetweenFebona(3, 5);
		System.out.println();
		a1.startEnd(3, 34);
		System.out.println();
		a1.countNumber(34);
		System.out.println();
		a1.numberAddition();
	}
}
