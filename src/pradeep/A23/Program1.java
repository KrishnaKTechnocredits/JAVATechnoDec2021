package pradeep.A23;

public class Program1 {
	// Program 1 : Find second max from given array.

	int maxIndex = 0;

	void printSecMaxNum(int[] arr) {
		int max = arr[0];
		int secMax = arr[1];

		for (int index = 2; index < arr.length; index++) {
			if (max < arr[index]) {
				secMax = max;
				max = arr[index];
			} else if (secMax < arr[index]) {
				secMax = arr[index];
			}
		}
		System.out.println("Second max num is:" + secMax);
	}

	public static void main(String[] args) {
		Program1 program1 = new Program1();

		int[] arr = { 1, 11, 3, 99, 66, 54, 22, 44 };
		program1.printSecMaxNum(arr);
	}
}
