package vaishnavi;

import java.util.Arrays;

public class A30_ArrayProgram2 {
	
	void findUniqueElementsFromArray(int[] arr) {
		System.out.println("Input is : " + Arrays.toString(arr));
		int[] outputArr = new int[arr.length];
		int j = 0;
		int dupCount = 0;
		for (int index1 = 0; index1 < arr.length - 1; index1++) {
			int count = 1;
			for (int index2 = index1 + 1; index2 < arr.length; index2++) {
				if (arr[index1] == arr[index2]) {
					count++;
					dupCount++;
					break;
				}
			}
			if (count == 1) {
				outputArr[j] = arr[index1];
				j++;
			}
		}
		int[] finalOutput = new int[outputArr.length - dupCount];

		for (int index = 0; index < finalOutput.length; index++) {
			finalOutput[index] = outputArr[index];
			
		}
		System.out.println("Output is : " + Arrays.toString(finalOutput));
	}

	public static void main(String[] args) {
		A30_ArrayProgram2 a30_ArrayProgram2 = new A30_ArrayProgram2();
		int[] arr1 = {19, 8, 0, 8, 60, 56, 97, 0, 33, 60, 0};
		a30_ArrayProgram2.findUniqueElementsFromArray(arr1);
	}
}
