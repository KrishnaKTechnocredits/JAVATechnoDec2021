package apurva;

import java.util.Arrays;

public class A23_IdentailArrays {
	void verifyTwoIdentialArray(int[] arr1, int[] arr2) {
		if (arr1.length != arr2.length) {
			System.out.println("Both arrays are not identical.");
		} else {
			String s1 = Arrays.toString(arr1);
			String s2 = Arrays.toString(arr2);
			System.out.println("Both arrays are idential?: " + s1.equals(s2));
		}
	}

	public static void main(String[] args) {

		int[] arr1 = { 10, 44, -33 };
		int[] arr2 = { 10, 44, -33 };

		int[] arr3 = { 10, 44, -33 };
		int[] arr4 = { 10, 44, -33, 55 };

		new A23_IdentailArrays().verifyTwoIdentialArray(arr1, arr2);
		new A23_IdentailArrays().verifyTwoIdentialArray(arr3, arr4);
	}

}
