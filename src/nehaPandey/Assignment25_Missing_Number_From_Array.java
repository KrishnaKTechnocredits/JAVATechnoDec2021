package nehaPandey;

public class Assignment25_Missing_Number_From_Array {
	void findSingleMissingNumberFromGivenArray(int[] arr) {

		int n = arr.length + 1;
		int expectedSum = (n * (n + 1) / 2);

		for (int index = 0; index < arr.length; index++) {
			expectedSum = expectedSum - arr[index];
		}
		System.out.println("Single missing number from the array is : " + expectedSum);

	}

	public static void main(String[] args) {
		Assignment25_Missing_Number_From_Array array = new Assignment25_Missing_Number_From_Array();
		int num[] = { 1, 2, 8, 10, 9, 5, 7, 6, 4 };
		array.findSingleMissingNumberFromGivenArray(num);
	}

}
