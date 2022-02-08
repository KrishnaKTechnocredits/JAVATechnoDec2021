/*
WAP to find out unique elements from the given array an return in the form of an array.
Input    : {1, 9, 1, 3, 16, 3, 9, 59, 4, 4, 16}
Output : {1, 9, 3, 16, 59, 4}

Input    : {19, 8, 0, 8, 60, 56, 97, 0, 33, 60, 0}
Output : {19, 8, 0, 60, 56, 97, 33}
 */
package monikaArkade;

public class Assignment30_UniqueArrayElements {
	static void unique(int[] arr) {
		for (int index = 0; index < arr.length; index++) {
			int innerIndex;
			for (innerIndex = 0; innerIndex < index; innerIndex++) {
				if (arr[index] == arr[innerIndex])
					break;
			}
			if (index == innerIndex)
				System.out.print(arr[index] + " ");
		}
	}

	public static void main(String args[]) {
		int number[] = { 1, 9, 1, 3, 16, 3, 9, 59, 4, 4, 16 };
		int number1[] = { 19, 8, 0, 8, 60, 56, 97, 0, 33, 60, 0 };
		unique(number);
		System.out.println();
		unique(number1);
	}
}
