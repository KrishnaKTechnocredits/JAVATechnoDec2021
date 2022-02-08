package pranoti;

import java.util.Arrays;

public class A23_P7_ArrayOperations {

	void identicalArray(int[] arr1, int[] arr2) {
		boolean flag = true;
		if (arr1.length != arr2.length)
			flag = false;
		else {
			for (int index = 0; index < arr1.length; index++) {
				if (arr1[index] != arr2[index]) {
					flag = false;
					break;
				}
			}
		}
		if (flag == true)
			System.out.println("both arrays are identical");
		else
			System.out.println("both arrays are not identical");
	}

	public static void main(String[] args) {
		int[] arr1 = { 10, 44, -33 };
		int[] arr2 = { 10, 44, -33 };
		int[] arr3 = { 10, 44, -33 };
		int[] arr4 = { 10, 44, -33, 55 };
		A23_P7_ArrayOperations a23_P7_ArrayOperations = new A23_P7_ArrayOperations();
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		a23_P7_ArrayOperations.identicalArray(arr1, arr2);
		System.out.println("----------------------------");
		System.out.println(Arrays.toString(arr3));
		System.out.println(Arrays.toString(arr4));
		a23_P7_ArrayOperations.identicalArray(arr3, arr4);
	}
}
