package vaishnavi;

import java.util.Arrays;

public class A23_VerifyAnIdenticalArray {
	void verifyArrayIsIdenticalOrNot(int[] num1, int[] num2) {
		if (num1.length == num2.length) {
			String str1 = Arrays.toString(num1);
			String str2 = Arrays.toString(num2);
			if (str1.equals(str2))
				System.out.println("Both arrays are identical.");
		} else
			System.out.println("Both arrays are not identical.");
	}

	public static void main(String[] args) {
		A23_VerifyAnIdenticalArray a23_VerifyAnIdenticalArray = new A23_VerifyAnIdenticalArray();
		int[] arr1 = { 10, 44, -33 };
		int[] arr2 = { 10, 44, -33 };
		a23_VerifyAnIdenticalArray.verifyArrayIsIdenticalOrNot(arr1, arr2);
		int[] arr3 = { 10, 44, -33 };
		int[] arr4 = { 10, 44, -33, 55 };
		a23_VerifyAnIdenticalArray.verifyArrayIsIdenticalOrNot(arr3, arr4);

	}

}
