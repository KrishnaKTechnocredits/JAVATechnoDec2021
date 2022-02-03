package poojaRajguru;

import java.util.Arrays;

public class A30_1_ArrayUniqueElements {
	int count = 0;

	int[] removeZero(int[] arr) {
		int[] output = uniqueNum(arr);
		System.out.println("Unique elements with zero : " + Arrays.toString(output));
		int[] result = new int[count];
		for (int index = 0; index < count; index++) {
			result[index] = output[index];
		}
		return result;
	}

	int[] uniqueNum(int[] arr) {
		System.out.println("Input array is : " + Arrays.toString(arr));
		count = 0;
		int[] output = new int[arr.length];
		boolean flag = true;
		for (int index = 0; index < arr.length; index++) {
			flag = true;
			for (int innerIndex = 0; innerIndex < count; innerIndex++) {
				if (arr[index] == output[innerIndex]) {
					flag = false;
					break;
				}
			}
			if (flag == true) {
				output[count] = arr[index];
				count++;
			}
		}
		return output;
	}

	public static void main(String[] args) {
		A30_1_ArrayUniqueElements array = new A30_1_ArrayUniqueElements();
		int[] arr1 = { 1, 9, 1, 3, 16, 3, 9, 59, 4, 4, 16 };
		int[] output1 = array.removeZero(arr1);
		System.out.println("Resultant Array : " + Arrays.toString(output1));
		System.out.println();
		int[] arr2 = { 19, 8, 0, 8, 60, 56, 97, 0, 33, 60, 0 };
		int[] output2 = array.removeZero(arr2);
		System.out.println("Resultant Array : " + Arrays.toString(output2));
	}
}