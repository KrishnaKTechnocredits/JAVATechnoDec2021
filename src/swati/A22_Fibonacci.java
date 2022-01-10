package swati;

public class A22_Fibonacci {

	// Generate Fibonacci
	void fibonacci(int num) {
		int num1 = 0;
		int num2 = 1;
		// int totalSum = num1 + num2;
		System.out.print(num1 + " " + num2);
		for (int i = 2; i < num; i++) {
			int next = num1 + num2;
			num1 = num2;
			num2 = next;
			// totalSum += num2;
			System.out.print(" " + num2);
		}
		System.out.println();
		// System.out.println("Total Sum of Fibonacci series is " + totalSum);
	}

	// Generate Fibonacci from Num 5
	void startFive(int num) {
		int num1 = 0;
		int num2 = 1;
		/*
		 * for (int i = 1; i < num-1; i++) { int num3 = num1 + num2; num1 = num2; num2 =
		 * num3; if (num3 >= 5) { System.out.print(" " + num3); } }
		 */
		int i = 1;
		while (i < num - 1) {
			int num3 = num1 + num2;
			num1 = num2;
			num2 = num3;
			if (num3 >= 5) {
				System.out.print(" " + num3);
			}
			i++;

		}
		System.out.println();

	}

	// Generate Fibonacci from 5 to 34
	void printInRange(int start, int end) {
		int num1 = 0;
		int num2 = 1;
		for (int i = 1; i < end; i++) {
			int num3 = num1 + num2;
			num1 = num2;
			num2 = num3;
			if (num3 >= start && num3 <= end) {
				System.out.print(" " + num3);
			}
		}
		System.out.println();
	}

	// Display iteration till Sum > 50
	void count(int num) {
		int num1 = 0;
		int num2 = 1;
		int sum = num1 + num2;
		int count = 1;
		System.out.print(num1 + " " + num2);
		for (int i = 0; i < num - 2; i++) {
			if (sum < 50) {
				count++;
				int num3 = num1 + num2;
				num1 = num2;
				num2 = num3;
				System.out.print(" " + num2);
				sum = sum + num3;
			}
		}
		System.out.println(" ");
		System.out.println("Total iterations till Sum >50 is " + count);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A22_Fibonacci a22 = new A22_Fibonacci();
		a22.fibonacci(9);
		a22.startFive(8);
		a22.printInRange(5, 34);
		a22.count(9);
	}

}
