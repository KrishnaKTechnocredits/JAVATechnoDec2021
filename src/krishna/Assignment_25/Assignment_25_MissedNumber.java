package krishna.Assignment_25;

import java.util.Arrays;

public class Assignment_25_MissedNumber {

	void findAnd_SetNum() {
		int arr[] = { 1, 2, 5, 0, 9, 6, 7, 4 };
		Arrays.sort(arr);
		int i = 1;
		int k;
		while (i < arr.length) {
			k = arr[i - 1];
			if (arr[i] - k == 1) {
			} else {
				System.out.println("The Missing number :  " + (k + 1));
			}
			i++;
		}
	}

	public static void main(String args[]) {
		Assignment_25_MissedNumber ass25 = new Assignment_25_MissedNumber();
		ass25.findAnd_SetNum();
	}
}
