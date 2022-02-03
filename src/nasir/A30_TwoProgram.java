package nasir;

import java.util.Arrays;

public class A30_TwoProgram {
	void shiftZeroAtLast(int[] input) {
		int length = input.length;
		int index1 = 0;
		int[] input1 = new int[length];
		for (int index = 0; index < input.length; index++) {
			int temp = input[index];
			if (temp != 0)
				input1[index1++] = temp;
		}
		System.out.println(Arrays.toString(input1));
	}

	void findUniqueElement(int[] input) {
		for (int index = 0; index < input.length; index++) {
			int temp = input[index];
			int innerIndex;
			for (innerIndex = 0; innerIndex < index; innerIndex++) {
				if (temp == input[innerIndex])
					break;
			}
			if (index == innerIndex)
				System.out.print(input[index] + " ");
		}
	}

	public static void main(String[] args) {
		A30_TwoProgram assignment30 = new A30_TwoProgram();
		System.out.println("Program 1 :");
		int[] arr = { 1, 0, 2, 0, 9, 6, 0, 19, 20, 0 };
		assignment30.shiftZeroAtLast(arr);
		System.out.println("Program 2:");
		// int[]arr1 = {1,9,1,3,16,3,9,59,4,4,16};
		int[] arr1 = { 19, 8, 0, 8, 60, 56, 97, 0, 33, 60, 0 };
		assignment30.findUniqueElement(arr1);

	}
}
