package omkar;

import java.util.Arrays;

public class A25_MissingNumber {

	int getMissingNumber(int[] num) {
		int n = num.length + 1;
		int expSum = (n * (n + 1) / 2);

		for (int index = 0; index < num.length; index++) {
			expSum = expSum - num[index];
		}

		return expSum;
	}

	public static void main(String[] args) {
		A25_MissingNumber a25_MissingNumber = new A25_MissingNumber();
		int num[] = { 1, 2, 8, 10, 3, 9, 5, 7, 6, 4, 13, 11 };
		System.out.println("Given array: " + Arrays.toString(num));
		int mNum = a25_MissingNumber.getMissingNumber(num);
		System.out.println("Missing Number is :" + mNum);
	}
}