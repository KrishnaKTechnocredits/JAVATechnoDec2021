package krishna.Assignment_23_StringArray;

import java.util.Arrays;

public class Assignment_23_ArrayCompare {
	void compareArray(int[] arr1, int[] arr2) {
		int size1 = arr1.length;
		int size2 = arr2.length;
		if (size1 == size2) {
			String a1 = Arrays.toString(arr1);
			String a2 = Arrays.toString(arr2);
			if (a1.equals(a2))
				System.out.println("The array [arr1 and arr2] are identical");
			else
				System.out.println("The array [arr1 and arr2] are not identical");
		}
	}

	public static void main(String[] arr) {
		Assignment_23_ArrayCompare ass23A = new Assignment_23_ArrayCompare();
		int[] arr1 = { 10, 44, -33 };
		int[] arr2 = { 10, 44, -33 };
		ass23A.compareArray(arr1, arr2);
	}
}
