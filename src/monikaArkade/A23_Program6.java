/*Program 7 : Verify if 2 arrays are identical.
int[] arr1 = {10,44,-33};
int[] arr2 = {10,44,-33}; */
package monikaArkade;

import java.util.Arrays;

public class A23_Program6 {
	void areIdentical(int[] input1, int[] input2) {
		String str1 = Arrays.toString(input1);
		String str2 = Arrays.toString(input2);
		if (str1.length() == str2.length()) {
			if (str1.equals(str2))
				System.out.println("Both arrays are Identical");
			else
				System.out.println("Both Arrays are not Identical");
		} else if (str1.length() != str2.length())
			System.out.println("Arrays are not Identical");
	}

	public static void main(String[] args) {
		A23_Program6 p6 = new A23_Program6();
		int[] arr1 = { 10, 44, -33 };
		int[] arr2 = { 10, 44, -33 };
		p6.areIdentical(arr1, arr2);

		int[] arr3 = { 10, 44, -33 };
		int[] arr4 = { 10, 44, -33, 55 };
		p6.areIdentical(arr3, arr4);
	}
}
