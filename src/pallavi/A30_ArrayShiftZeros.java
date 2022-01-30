/*Assignment 30 : 29th Jan'2022

1. WAP to shift all the zero elements of an array after the non zero elements present in the given array.
Input     : {1, 0, 2, 0, 9, 6, 0, 19, 20, 0}
Output  : {1, 2, 9, 6, 19, 20, 0, 0, 0, 0}

2. WAP to find out unique elements from the given array an return in the form of an array.
Input    : {1, 9, 1, 3, 16, 3, 9, 59, 4, 4, 16}
Output : {1, 9, 3, 16, 59, 4}

Input    : {19, 8, 0, 8, 60, 56, 97, 0, 33, 60, 0}
Output : {19, 8, 0, 60, 56, 97, 33}
*/

package pallavi;

import java.util.Arrays;

public class A30_ArrayShiftZeros {

	public static void main(String[] arr) {
		int[] input = { 1, 0, 2, 0, 9, 6, 0, 19, 20, 0 };
		System.out.println("Input:- " + Arrays.toString(input));
		new A30_ArrayShiftZeros().shiftZerosLast(input);
	}

	void shiftZerosLast(int[] input) {
		int[] output = new int[input.length];
		int index = 0;
		for (int i = 0; i < input.length; i++) {
			if (input[i] != 0) {
				output[index] = input[i];
				index++;
			}
		}
		System.out.println("Output:- " + Arrays.toString(output));
	}
}
