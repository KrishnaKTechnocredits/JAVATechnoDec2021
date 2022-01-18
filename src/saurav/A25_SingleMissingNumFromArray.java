package saurav;

/*Assignment-25 : 18th Jan'2022

Program 1 : Find the single missing number from the array.
int num[] = { 1, 2, 8, 10, 9, 5, 7, 6, 4 };
output: 3*/

public class A25_SingleMissingNumFromArray {

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
		A25_SingleMissingNumFromArray program = new A25_SingleMissingNumFromArray();
		int numArray[] = { 1, 2, 3, 10, 9, 8, 7, 6, 4 };
		program.missingNum(numArray);
	}
}
