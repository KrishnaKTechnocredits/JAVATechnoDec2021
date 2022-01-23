package pradeep.A23;

public class Program1_1 {
	// This Program prints nth maximum number
	int maxIndex = 0;

	// This method returns maximum number from integer array
	int findMaxNum(int[] arr) {
		int max = arr[0];

		for (int index = 1; index < arr.length; index++) {
			if (max < arr[index]) {
				max = arr[index];
				maxIndex = index;
			}
		}
		return max;
	}

	void printNmaxNum(int[] arr, int n) {
		int max = 0;
		for (int i = 1; i <= n; i++) {
			max = findMaxNum(arr);
			arr[maxIndex] = 0;
		}
		System.out.println(n + " maximum number is :" + max);
	}

	public static void main(String[] args) {
		Program1_1 program2 = new Program1_1();

		int[] arr = { 10, 7, 11, 99, 56, 46, 3 };
		program2.printNmaxNum(arr, 3);
	}

}
