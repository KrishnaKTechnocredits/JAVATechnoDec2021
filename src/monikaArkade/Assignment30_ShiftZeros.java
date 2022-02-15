/*
WAP to shift all the zero elements of an array after the non zero elements present in the given array.
Input     : {1, 0, 2, 0, 9, 6, 0, 19, 20, 0}
Output  : {1, 2, 9, 6, 19, 20, 0, 0, 0, 0}
 */
package monikaArkade;

import java.util.Arrays;

public class Assignment30_ShiftZeros {

	static int[] shiftZeros(int[] arr) {
		if (arr.length == 1) {
			return arr;
		}
		int[] output = new int[arr.length];
		int count = 0;

		for (int num : arr) {
			if (num != 0) {
				output[count] = num;
				count++;
			}
		}
		return output;
	}

	public static void main(String[] args) {
		Assignment30_ShiftZeros shift = new Assignment30_ShiftZeros();
		int[] input = { 1, 0, 2, 0, 9, 6, 0, 19, 20, 0 };
		System.out.println(Arrays.toString(shiftZeros(input)));
	}

}
