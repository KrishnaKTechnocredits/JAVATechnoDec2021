/* Assignment 30 : 29th Jan'2022
1. WAP to shift all the zero elements of an array after the non zero elements present in the given array.
Input     : {1, 0, 2, 0, 9, 6, 0, 19, 20, 0}
Output  : {1, 2, 9, 6, 19, 20, 0, 0, 0, 0}
 */
package shwetaDharmadhikari.Assignment30;

import java.util.Arrays;

public class ShiftZeros {

	void transferZeroToRight(int[] arr) {
		int[] output = new int[arr.length];
		int count = 0;
		for (int index = 0; index < arr.length; index++) {
			if (arr[index] != 0) {
				output[count] += arr[index];
				count++;
			}
		}
		System.out.println("Output:" + Arrays.toString(output));

	}

	public static void main(String[] args) {
		int[] input = { 1, 0, 2, 0, 9, 6, 0, 19, 20, 0 };
		System.out.println("Input: "+Arrays.toString(input));
		ShiftZeros shiftZeros = new ShiftZeros();
		shiftZeros.transferZeroToRight(input);
	}
}
