/* Assignment - 23 : 15th Jan'2022

Program 7 : Verify if 2 arrays are identical

int[] arr1 = {10,44,-33};
int[] arr2 = {10,44,-33};

output : both arrays are identical.

int[] arr3 = {10,44,-33};
int[] arr4 = {10,44,-33,55};

output : both arrays are not identical.

*/

package vaibhav.Assignment_23;

import java.util.Arrays;

public class Program7_VerifyIdentialArray {

	void verifyArrayIdentical(int[] arr1, int[] arr2) {
		if (arr1.length == arr2.length) {
			boolean flag = false;
			for (int index = 0; index < arr1.length; index++) {
				if (arr1[index] == arr2[index]) {
					flag = true;
				} else {
					flag = false;
					break;
				}
			}
			if (flag) {
				System.out.println("Both arrays are identical");
				System.out.println("Array 1 : " + Arrays.toString(arr1));
				System.out.println("Array 2 : " + Arrays.toString(arr2));
			} else {
				System.out.println("Both arrays are not identical");
				System.out.println("Array 1 : " + Arrays.toString(arr1));
				System.out.println("Array 2 : " + Arrays.toString(arr2));
			}
		} else {
			System.out.println("Both arrays are not identical");
			System.out.println("Array 1 : " + Arrays.toString(arr1));
			System.out.println("Array 2 : " + Arrays.toString(arr2));
		}

	}

	public static void main(String[] args) {
		Program7_VerifyIdentialArray program7_VerifyIdentialArray = new Program7_VerifyIdentialArray();
		int[] arr1 ={10,44,-33};
		int[] arr2 ={10,44,-33};
		int[] arr3 ={10,44,-33};
		int[] arr4 ={10,44,-33,55};
		program7_VerifyIdentialArray.verifyArrayIdentical(arr1, arr2);
		System.out.println();
		program7_VerifyIdentialArray.verifyArrayIdentical(arr3, arr4);
	}

}
