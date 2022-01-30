package apurva;

import java.util.Arrays;

public class A23_SecondMaximumNoInArray {
	// without any sorting
	int getSecondHighest(int[] arr) {
		int max = 0;
		int secondMax = 0;
		if (arr[0] > arr[1]) {
			max = arr[0];
			secondMax = arr[1];
		} else {
			max = arr[1];
			secondMax = arr[0];
		}
		for (int index = 2; index <= arr.length - 1; index++) {
			if (max < arr[index]) {
				secondMax = max;
				max = arr[index];
			} else if (max > arr[index] && secondMax < arr[index])
				secondMax = arr[index];
		}
		System.out.println("Second Highest no is: " + secondMax);
		return max = 0;
	}

	// with sorting

	void displaySecondHighest(int[] arr, int nth) {
		int count = 0;
		for (int index = 1; index < arr.length; index++) {
			count++;
		}
		System.out.println("position of number in given array is: " + count);
		System.out.println("Second highest number is " + arr[arr.length - nth]);
	}

	public static void main(String[] ar) {
		int[] c = { 1, 11, 3, 99, 66, 54, 22, 44 };
		System.out.println("The given list is :" + Arrays.toString(c));
		A23_SecondMaximumNoInArray a23_SecondMaximumNoInArray = new A23_SecondMaximumNoInArray();
		a23_SecondMaximumNoInArray.getSecondHighest(c);
		System.out.println("---------------------------------------------");

		int arr[] = { 1, 11, 3, 99, 66, 54, 22, 44 };
		Arrays.sort(arr);
		System.out.println("The sorted list is :" + Arrays.toString(arr));
		new A23_SecondMaximumNoInArray().displaySecondHighest(arr, 2);
	}
}
