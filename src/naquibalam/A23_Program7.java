package naquibalam;

import java.util.Arrays;

public class A23_Program7 {

	String arrayIdentical(int arr1[], int arr2[]) {
		if (Arrays.equals(arr1, arr2)) {
			return "Both arrays are identical";
		} else {
			return "Both arrays are not identical";
		}
	}
	
	public static void main(String[] args) {
		A23_Program7 A23_Program7 = new A23_Program7();
		int arr1[] = {10,44,-33};
		int arr2[] = {10,44,-33};
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		System.out.println(A23_Program7.arrayIdentical(arr1, arr2));
		System.out.println("---------------------------------------------------------------");
		int arr3[] = {10,44,-33};
		int arr4[] = {10,44,-33,55};
		System.out.println(Arrays.toString(arr3));
		System.out.println(Arrays.toString(arr4));
		System.out.println(A23_Program7.arrayIdentical(arr3, arr4));
	}
}
