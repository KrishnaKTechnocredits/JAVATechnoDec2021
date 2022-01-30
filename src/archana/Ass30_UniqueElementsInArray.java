package archana;

import java.util.Arrays;

public class Ass30_UniqueElementsInArray {

	void getUniqueElementsInArray(int[] arr) {
		int[] arr2 = new int[20];
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			int flag = 0;
			for (int j = 0; j < i; j++) {

				if (arr[i] == arr[j]) {
					flag = 1;
					break;
				}
			}
			if (flag == 0) {
				arr2[count] = arr[i];
				count++;
			}
		}
		System.out.print("int [] arr2 = { ");
		for (int i = 0; i < count; i++)
			System.out.print(arr2[i] + ",");
		System.out.print("} ");
	}

	public static void main(String[] args) {
		Ass30_UniqueElementsInArray ass30 = new Ass30_UniqueElementsInArray();
		int arr[] = { 1, 9, 1, 3, 16, 3, 9, 59, 4, 4, 16 };
		ass30.getUniqueElementsInArray(arr);
		System.out.println();
		int arr2 []={19, 8, 0, 8, 60, 56, 97, 0, 33, 60, 0};
		ass30.getUniqueElementsInArray(arr2);

	}

}
