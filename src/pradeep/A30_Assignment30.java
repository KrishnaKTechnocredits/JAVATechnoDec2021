package pradeep;

import java.util.Arrays;

public class A30_Assignment30 {

	// This program shifts all zeros after the non zero numbers
	void shiftZero(int[] input) {
		int outputIndex = 0;
		int[] output = new int[input.length];
		for (int index = 0; index < input.length; index++) {
			if (input[index] != 0) {
				output[outputIndex] = input[index];
				outputIndex++;
			}
		}
		System.out.println(Arrays.toString(output));
	}

	//This method prints unique number from array
	void uniqueNumber(int[] input) {
		int min = getMin(input) - 1;
		int tempIndex = 0;
		int[] temp = new int[input.length];

		for (int index = 0; index < input.length; index++) {
			for (int innerIndex = index + 1; innerIndex < input.length; innerIndex++) {
				if (input[index] == input[innerIndex]) {
					input[innerIndex] = min;
				}
			}
			if (input[index] != min) {
				temp[tempIndex] = input[index];
				tempIndex++;
			}
		}
		
		int[] output = new int[tempIndex];
		for (int index = 0; index < tempIndex; index++) {
			output[index] = temp[index];

		}
		System.out.println(Arrays.toString(output));
	}

	//This method returns minimum number from array
	int getMin(int[] input) {
		int min = input[0];
		for (int index = 0; index < input.length; index++) {
			if (min > input[index]) {
				min = input[index];
			}
		}
		return min;
	}

	public static void main(String[] args) {
		A30_Assignment30 a30_Assignment30 = new A30_Assignment30();

		int[] input1 = { 1, 0, 2, 0, 9, 6, 0, 19, 20, 0 };
		int[] input2 = { 1, 9, 1, 3, 16, 3, 9, 59, 4, 4, 16 };

		System.out.println("Input Array: "+ Arrays.toString(input1));
		System.out.println("Output array with zero shifted: ");
		a30_Assignment30.shiftZero(input1);
		System.out.println("Input Array: "+ Arrays.toString(input2));
		System.out.println("Output array with unique element: ");
		a30_Assignment30.uniqueNumber(input2);
	}
}
