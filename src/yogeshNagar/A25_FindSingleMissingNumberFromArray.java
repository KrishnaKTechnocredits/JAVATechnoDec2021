package yogeshNagar;

public class A25_FindSingleMissingNumberFromArray {
	void getMissingNumberFromArray(int arr[]) {
		int actualNumber = arr.length + 1;
		int expectedNumber = actualNumber * (actualNumber + 1) / 2;
		for (int index = 0; index < actualNumber - 1; index++) {
			expectedNumber = expectedNumber - arr[index];
		}
		System.out.println("Missing number is "+expectedNumber);
	}

	public static void main(String[] args) {
		A25_FindSingleMissingNumberFromArray missingArray = new A25_FindSingleMissingNumberFromArray();
		int arr[] = { 1, 2, 8, 10, 9, 5, 7, 6, 4 };
		missingArray.getMissingNumberFromArray(arr);
	}
}