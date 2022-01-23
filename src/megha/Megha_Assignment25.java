package megha;

public class Megha_Assignment25 {

	void findMissingNumber(int[] arr) {
		int n = arr.length + 1;
		int expSum = (n * (n + 1) / 2);
		for (int index = 0; index < arr.length; index++) {
			expSum = expSum - arr[index];
		}
		System.out.println("The Missing Number from the given array is : " + expSum);
	}

	public static void main(String[] args) {
		Megha_Assignment25 megha_Assignment = new Megha_Assignment25();
		int[] arr = { 1, 2, 8, 10, 9, 5, 7, 6, 4 };
		megha_Assignment.findMissingNumber(arr);
	}

}
