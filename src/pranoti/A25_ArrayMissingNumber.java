package pranoti;

public class A25_ArrayMissingNumber {

	void findMissingNum() {
		int[] arr = { 1, 2, 3, 5, 6, 7, 8, 9 };
		int n = arr.length + 1;
		int expectedSum = (n * (n + 1) / 2);
		for (int index = 0; index < arr.length; index++) {
			expectedSum = expectedSum - arr[index];
		}
		System.out.println("Misiing number in given array : " + expectedSum);
	}

	public static void main(String[] args) {
		A25_ArrayMissingNumber a25_ArrayMissingNumber = new A25_ArrayMissingNumber();
		a25_ArrayMissingNumber.findMissingNum();
	}
}
