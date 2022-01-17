package pradeep.A23;

public class Program7 {

	void checkIdenticalArray(int[] arr1, int[] arr2) {
		boolean flag = true;

		if (arr1.length == arr2.length) {
			for (int index = 0; index < arr1.length; index++) {
				if (arr1[index] != arr2[index]) {
					System.out.println("Arrays are not identical");
					flag = false;
					break;
				}
			}
		} else {
			System.out.println("Arrays are not identical");
			flag = false;
		}

		if (flag)
			System.out.println("Arrays are identical");
	}

	public static void main(String[] args) {
		Program7 program7 = new Program7();
		int[] arr1 = { 10, 44, -32 };
		int[] arr2 = { 10, 44, -32 };

		program7.checkIdenticalArray(arr1, arr2);
	}
}
