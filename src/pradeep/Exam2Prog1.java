package pradeep;

import java.util.Scanner;

public class Exam2Prog1 {

	void findPair(int[] arr, int sum) {
		for (int index = 0; index < arr.length; index++) {
			int num1 = arr[index];
			for (int index1 = index + 1; index1 < arr.length; index1++) {
				int num2 = arr[index1];
				if (num1 + num2 == sum) {
					System.out.println("{" + num1 + "," + num2 + "}");
				}
			}
		}
	}

	public static void main(String[] args) {
		Exam2Prog1 exam2Prog1 = new Exam2Prog1();
		Scanner scanner = new Scanner(System.in);

		int[] arr = { 5, 1, 2, 7, 6, 3, 4, 9 };
		System.out.println("Enter sum: ");
		int sum = scanner.nextInt();
		exam2Prog1.findPair(arr, sum);
	}
}
