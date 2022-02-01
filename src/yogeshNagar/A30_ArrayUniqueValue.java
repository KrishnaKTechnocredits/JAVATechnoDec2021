package yogeshNagar;

import java.util.Arrays;

public class A30_ArrayUniqueValue {

	void shiftAllZerosEnd(int[] arr) {
		int[] outArr = new int[arr.length];
		int count = 0;
		for (int index = 0; index < arr.length; index++) {
			if (arr[index] != 0) {
				outArr[count] = arr[index];
				count++;
			}
		}
		System.out.println(Arrays.toString(outArr));
	}

	void getUniqueNumberArray(int[] arr) {
		int[] outArr = new int[arr.length];
		int getMiniNumber = getMiniValueArr(arr);
		int tempIndex = 0;

		for (int index = 0; index < arr.length; index++) {
			for (int innerIndex = index + 1; innerIndex < arr.length; innerIndex++) {
				if (arr[index] == arr[innerIndex]) {
					arr[innerIndex] = getMiniNumber;
				}
			}
			if (arr[index] != getMiniNumber) {
				outArr[tempIndex] = arr[index];
				tempIndex++;
			}
		}

		int[] output = new int[tempIndex];
		for (int index = 0; index < tempIndex; index++) {
			output[index] = outArr[index];

		}
		System.out.println(Arrays.toString(output));
	}

	int getMiniValueArr(int[] arr) {
		int mini = arr[1];
		for (int index = 0; index < arr.length; index++) {
			if (mini > arr[index])
				mini = arr[index];
		}
		return (mini - 10);
	}

	public static void main(String[] args) {
		A30_ArrayUniqueValue arrUniqueValue = new A30_ArrayUniqueValue();
		int[] arr = { 1, 0, 2, 0, 9, 6, 0, 19, 20, 0 };
		System.out.println("Program 1 :");
		System.out.println("Input : " + Arrays.toString(arr));
		System.out.print("Output : ");
		arrUniqueValue.shiftAllZerosEnd(arr);

		int[] arr1 = { 1, 9, 1, 3, 16, 3, 9, 59, 4, 4, 16 };
		System.out.println();
		System.out.println("Program 2 :");
		System.out.println("Input : " + Arrays.toString(arr1));
		System.out.print("Output : ");
		arrUniqueValue.getUniqueNumberArray(arr1);

		int[] arr2 = { 19, 8, 0, 8, 60, 56, 97, 0, 33, 60, 0 };
		System.out.println();
		System.out.println("Input : " + Arrays.toString(arr2));
		System.out.print("Output : ");
		arrUniqueValue.getUniqueNumberArray(arr2);
	}
}