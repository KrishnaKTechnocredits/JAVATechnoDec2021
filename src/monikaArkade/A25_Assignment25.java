package monikaArkade;

public class A25_Assignment25 {
	int missingNum(int[] numArray) {
		int n = numArray.length + 1;
		int expectedSum = (n * (n + 1) / 2);
		// System.out.println(expectedSum);

		for (int index = 0; index < numArray.length; index++) {
			expectedSum = expectedSum - numArray[index];
		}
		System.out.println("missing num from given array is = " + expectedSum);
		return expectedSum;
	}

	public static void main(String[] a) {
		A25_Assignment25 a25 = new A25_Assignment25();
		int numArray[] = { 1, 2, 3, 10, 9, 8, 7, 6, 4 };
		a25.missingNum(numArray);
	}
}
