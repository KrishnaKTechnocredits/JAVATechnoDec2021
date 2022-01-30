package sandip.Assignment_23;

import java.util.Arrays;

public class Identical_array {

	void identicalArray(int[] input1, int[] input2) {
		if (input1.length == input2.length) {
			System.out.println("Length of given 2 arrays is equal.");
			String s1 = Arrays.toString(input1);
			System.out.println("Array-1 :" + s1);
			String s2 = Arrays.toString(input2);
			System.out.println("Array-2 :" + s2);
			if (s1.equals(s2)) {
				System.out.println();
				System.out.println("The given array are identical.");
			} else {
				System.out.println();
				System.out.println("The given array are not identical.");
			}
		} else if (input1.length != input2.length) {
			System.out.println("length doesnot match, Arrays not identical.");
		}
	}

	public static void main(String[] args) {
		Identical_array a1 = new Identical_array();
		int[] arr1 = { 10, 44, -33 };
		int[] arr2 = { 10, 44, -33 };
		a1.identicalArray(arr1, arr2);
	}
}
