package nehaPandey;

public class Assignment23_Program7 {
	void findTwoArraysIdentical(int[] arr1, int[] arr2) {

		boolean flag = false;

		if (arr1.length == arr2.length) {
			for (int index = 0; index < arr1.length; index++) {
				if (arr1[index] == arr2[index]) {
					flag = true;
				}
			}
		} else {
			flag = false;
		}
		if (flag == true) {
			System.out.println("Both Arrays are identical");
		} else {
			System.out.println("Both Arrays are non identical");
		}
	}

	public static void main(String[] args) {
		Assignment23_Program7 program7 = new Assignment23_Program7();
		int[] arr1 = { 10, 44, -33 };
		int[] arr2 = { 10, 44, -33 };
		program7.findTwoArraysIdentical(arr1, arr2);
		int[] arr3 = { 10, 44, -33 };
		int[] arr4 = { 10, 44, -33, 55 };
		program7.findTwoArraysIdentical(arr3, arr4);

	}

}
