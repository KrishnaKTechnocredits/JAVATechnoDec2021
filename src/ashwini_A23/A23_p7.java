//Program 7 : Verify if 2 arrays are identical.
//
//int[] arr1 = {10,44,-33};
//int[] arr2 = {10,44,-33};
//
//output : both arrays are identical.
//
//int[] arr3 = {10,44,-33};
//int[] arr4 = {10,44,-33,55};
//
//output : both arrays are not identical.
package ashwini_A23;

import java.util.Arrays;

public class A23_p7 {

	void checkArrayIsIdentical(int[] arr1, int[] arr2) {
		if (arr1.length == arr2.length) {
			String s1 = Arrays.toString(arr1);
			String s2 = Arrays.toString(arr2);
			if (s1.equals(s2)) {
				System.out.println("both arrays are identical.");
			} else
				System.out.println("both arrays are not identical.");

		} else
			System.out.println("both arrays are not identical.");
	}

	public static void main(String[] args) {
		A23_p7 assign23_7 = new A23_p7();
		int[] arr1 = { 10, 44, -33 };
		int[] arr2 = { 10, 44, -33 };
		assign23_7.checkArrayIsIdentical(arr1, arr2);
	}
}
