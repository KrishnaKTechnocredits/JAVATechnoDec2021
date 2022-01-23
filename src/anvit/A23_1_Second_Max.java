package anvit;

import java.util.Arrays;

public class A23_1_Second_Max {

	int findMax(int[] arr) {
		int max = 0;
		int index = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
				index = i;
			}
		}
		arr[index] = 0;
		return max;
	}

	void printNthNumber(int[] arr, int n) {
		int ans = 0;
		for (int i = 1; i <= n; i++) {
			ans = findMax(arr);
		}
		System.out.println("Second max from given array is :" + ans);
	}

	public static void main(String[] args) {
		A23_1_Second_Max a23_1_Second_Max = new A23_1_Second_Max();
		int[] arr = { 1, 11, 3, 99, 66, 54, 22, 44 };
		a23_1_Second_Max.printNthNumber(arr, 2);

		/*
		 * Directly with help of method 
		 * Arrays.sort(arr);
		 * System.out.println(Arrays.toString(arr));
		 * System.out.println(arr[arr.length-2]);
		 */
	}
}
