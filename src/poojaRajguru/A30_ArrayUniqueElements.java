package poojaRajguru;

import java.util.Arrays;

public class A30_ArrayUniqueElements {
	void removeZero(int[] arr) {
		int[] output = new int[arr.length];
		int cnt = 0;
		System.out.println("The array : " + Arrays.toString(arr));
		for (int index = 0; index <= arr.length - 1; index++) {
			if (arr[index] != 0) {
				output[cnt] = arr[index];
				cnt++;
			}
		}
		System.out.println("Resultant array : " + Arrays.toString(output));
	}

	public static void main(String[] args) {
		int[] arr = { 1, 0, 2, 0, 9, 6, 0, 19, 20, 0 };
		A30_ArrayUniqueElements array = new A30_ArrayUniqueElements();
		array.removeZero(arr);
	}
}