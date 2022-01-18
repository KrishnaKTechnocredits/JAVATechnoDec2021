
package kalyani;

public class A23_Find2ndMaxNum_P1 {
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
		System.out.println("Second maximum number in given array is :" + secMax);
	}

	public static void main(String[] args) {
		A23_Find2ndMaxNum_P1 assign_p1 = new A23_Find2ndMaxNum_P1();

		int[] arr = {1,11,3,99,66,54,22,44};
		assign_p1.printSecMaxNum(arr);
	}
}