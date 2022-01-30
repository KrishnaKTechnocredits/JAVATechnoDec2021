package pradeep;

import java.util.Arrays;

public class Exam4Prog1 {

	boolean checkSquareOfNum(int[] input) {

		for (int index = 0; index < input.length - 1; index++) {
			int num1 = input[index];
			int num2 = input[index + 1];
			if (num2 != (num1 * num1)) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		Exam4Prog1 exam4Prog1 = new Exam4Prog1();
		int[] input = { 2, 4, 16, 256 };
		System.out.println("Input " + Arrays.toString(input));
		boolean output = exam4Prog1.checkSquareOfNum(input);
		System.out.println("Output:" + output);
	}
}
