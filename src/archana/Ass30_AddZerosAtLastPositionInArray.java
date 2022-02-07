package archana;

import java.util.Arrays;

public class Ass30_AddZerosAtLastPositionInArray {

	void addZerosAtLastPositionInArray(int[] arr) {
		int[] newArr = new int[arr.length];
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0) {
				newArr[count] = arr[i];
				count++;
			}
		}
		System.out.println(Arrays.toString(newArr));
	}

	public static void main(String[] args) {
		Ass30_AddZerosAtLastPositionInArray ass30 = new Ass30_AddZerosAtLastPositionInArray();
		int[] arr = { 1, 0, 1, 3, 4, 0, 6, 2, 5, 0 };
		ass30.addZerosAtLastPositionInArray(arr);
	}
}
