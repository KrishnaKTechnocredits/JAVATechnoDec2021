package apurva;

import java.util.Arrays;

public class A23_UniqueNumberinArray {
	private int temp = 0;

	void getUniqueNumbers(int[] input, int[] output) {
		for (int index = 0; index < input.length; index++) {
			boolean flag = true;
			for (int innerIndex = 0; innerIndex < output.length; innerIndex++) {
				if (input[index] == output[innerIndex]) {
					flag = false;
					break;
				}
			}

			if (flag == true) {
				output[temp] = input[index];
				temp++;

			}
		}
	}

	void getUniqueArray(int[] input1, int[] input2) {
		int[] output = new int[input1.length + input2.length];
		getUniqueNumbers(input1, output);
		getUniqueNumbers(input2, output);
		int[] finaloutput = new int[temp];
		for (int i = 0; i < finaloutput.length; i++) {
			finaloutput[i] = output[i];
		}
		System.out.println("Unique number in given set of arrays are " + Arrays.toString(finaloutput));
	}

	public static void main(String[] args) {
		int[] arr1 = { 10, 44, -33 };
		int[] arr2 = { 10, 44, -33, 55 };
		new A23_UniqueNumberinArray().getUniqueArray(arr1, arr2);
	}
}


