package swati.swati_Assignment23;

import java.util.Arrays;

public class SortArray {

	boolean flag = false;

	boolean sortArray(int[] arr1, int[] arr2) {
		if (arr1.length == arr2.length) {
			for (int i = 0; i < arr1.length; i++) {
				if (arr1[i] == arr2[i]) {
					flag = true;
				} else {
					flag = false;
					break;
				}
			}
		} else {
			System.out.println("Array size not matching");
			flag = false;
		}
		return flag;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SortArray sa = new SortArray();
		int[] arr1 = { 10, 44, -33 };
		int[] arr2 = { 10, 44, -33 };
		int[] arr3 = {10,44,-33};
		int[] arr4 = {10,44,-33,55};
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		Arrays.sort(arr3);
		Arrays.sort(arr4);
		//boolean flag = sa.sortArray(arr1, arr2);
		boolean flag = sa.sortArray(arr3, arr4);
		if (flag) {
			System.out.println("Arrays are matching");
		} else {
			System.out.println("Arrays not matching");
		}

	}

}
