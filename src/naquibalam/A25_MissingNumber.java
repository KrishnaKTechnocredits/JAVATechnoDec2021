package naquibalam;

import java.util.Arrays;

public class A25_MissingNumber {
	
	int getMissingNumber(int arr[]) {
		int arrayLength = arr.length + 1;
		int totalSum = (arrayLength * (arrayLength + 1) / 2);
		for (int i = 0; i < arr.length; i++) {
			totalSum = totalSum - arr[i];
		}
		return totalSum;
	}

	public static void main(String[] args) {
		A25_MissingNumber a25_MissingNumber = new A25_MissingNumber();
		int arr[] = { 1, 2, 8, 10, 9, 5, 7, 6, 4 };
		System.out.println(a25_MissingNumber.getMissingNumber(arr));
	}
}
