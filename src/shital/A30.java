package shital;

import java.util.Arrays;

public class A30 {
	
	void shiftAllZeroAtEnd(int[] arr) {
		int arrLength = arr.length;
		int index1 = 0;
		int[] temp = new int[arrLength];
		for (int index = 0; index < arr.length; index++) {
			if (arr[index] != 0)
				temp[index1++] = arr[index];
		}
		System.out.println(Arrays.toString(temp));
	}

	void uniqueElementsInArray(int[] arr) {
		int arr1[] = new int[getSize(arr)];
		int outputIndex = 0;
		for (int index = 0; index < arr.length; index++) {
			int innerIndex;
			for (innerIndex = 0; innerIndex < index; innerIndex++)
				if (arr[index] == arr[innerIndex])
					break;
			if (index == innerIndex) {
				arr1[outputIndex] = arr[index];
				outputIndex++;
			}

		}

		System.out.print(Arrays.toString(arr1));
	}

	public int getSize(int[] arr) {
		int count = 1;
		for (int index = 0; index < arr.length; index++) {
			int innerIndex;
			for (innerIndex = 0; innerIndex < index; innerIndex++)
				if (arr[index] == arr[innerIndex])
					count++;

		}
		return count;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		A30 a30 = new A30();
		
		int[] arr = { 1, 0, 2, 0, 9, 6, 0, 19, 20, 0 };
		System.out.println("Input : " + Arrays.toString(arr));
		System.out.print("Output is : ");
		a30.shiftAllZeroAtEnd(arr);
		
		int[] arr1 = { 1, 9, 1, 3, 16, 3, 9, 59, 4, 4, 16 };
		System.out.println("\n");
		System.out.println("Input : " + Arrays.toString(arr1));
		System.out.print("Output is : ");
		a30.uniqueElementsInArray(arr1);
	}

}
