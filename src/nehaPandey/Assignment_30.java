package nehaPandey;

import java.util.Arrays;

public class Assignment_30 {

	void shiftAllZeroElementsAfterNonZeroElements(int[] arr) {

		int[] outputArr = new int[arr.length];
		int count = 0;
		for (int index = 0; index < arr.length; index++) {
			if (arr[index] != 0) {
				outputArr[count] = arr[index];
				count++;
			}
		}
		System.out.println(Arrays.toString(outputArr));

	}

	void findOutUniqueElementsFromGivenArray(int[] arr) {

		for (int index = 0; index < arr.length; index++) {
			int temp = arr[index];
			int innerIndex;
			for (innerIndex = 0; innerIndex < index; innerIndex++) {
				if (temp == arr[innerIndex])
					break;
			}
			if (index == innerIndex)
				System.out.print(arr[index] + " ");
		}
	}

	public static void main(String[] args) {
		Assignment_30 a30 = new Assignment_30();
		System.out.println("Program : 1 ");
		System.out.println();
		int[] input1 = { 1, 0, 2, 0, 9, 6, 0, 19, 20, 0 };
		a30.shiftAllZeroElementsAfterNonZeroElements(input1);
		System.out.println();
		System.out.println("Program : 2 ");
		System.out.println();
		int[] input2 = { 1, 9, 1, 3, 16, 3, 9, 59, 4, 4, 16 };
		a30.findOutUniqueElementsFromGivenArray(input2);
	}

}
