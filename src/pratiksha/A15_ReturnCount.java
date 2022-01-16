package pratiksha;

public class A15_ReturnCount {

	int countOfNumber(int[] arr) {
		int count = 0;
		for (int index = 0; index < arr.length; index++) {
			if (arr[index] >= 0)
				count++;
		}

		return count;
	}

	public static void main(String[] args) {
		A15_ReturnCount returnCount = new A15_ReturnCount();
		int[] arr = { 13, -9, 34, -31, 23, 43};
		int count = returnCount.countOfNumber(arr);
		System.out.println("Count of positive number in the given array is : " + count);
	}

}
