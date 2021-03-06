/*Program 7 : Verify if 2 arrays are identical.

int[] arr1 = {10,44,-33};
int[] arr2 = {10,44,-33};

output : both arrays are identical.

int[] arr3 = {10,44,-33};
int[] arr4 = {10,44,-33,55};

output : both arrays are not identical.
*/

package pallavi;

import java.util.Arrays;

public class A23_IdenticalArray {
	void identicalArray(int[] arr1, int[] arr2) {
		boolean identical = true;
		if (arr1.length != arr2.length)
			System.out.println("Both arrays are not identical");
		else {
			for (int index = 0; index < arr1.length; index++) {
				if (arr1[index] != arr2[index]) {
					identical = false;
					break;
				}
			}
			if (identical == true)
				System.out.println("Both arrays are identical");
		}
	}

	public static void main(String[] args) {
		A23_IdenticalArray a23_IdenticalArray = new A23_IdenticalArray();

		int[] arr1 = { 10, 44, -33 };
		int[] arr2 = { 10, 44, -33 };
		System.out.println("Input array1 "+ Arrays.toString(arr1));
		System.out.println("Input array2 "+ Arrays.toString(arr2));
		a23_IdenticalArray.identicalArray(arr1, arr2);

		System.out.println();
		int[] arr3 = { 10, 44, -33 };
		int[] arr4 = { 10, 44, -33, 55 };
		System.out.println("Input array1 "+ Arrays.toString(arr3));
		System.out.println("Input array2 "+ Arrays.toString(arr4));
		a23_IdenticalArray.identicalArray(arr3, arr4);
	}

}
