/*Assignment 30 : 29th Jan'2022

1. WAP to shift all the zero elements of an array after the non zero elements present in the given array.
Input     : {1, 0, 2, 0, 9, 6, 0, 19, 20, 0}
Output  : {1, 2, 9, 6, 19, 20, 0, 0, 0, 0}
*/

package vaibhav.Assignment_30;

import java.util.Arrays;

public class Program1_ShiftZeroElements {

	void shiftZeroElement(int[] arr) {
		System.out.println("Input Array	: " + Arrays.toString(arr));
		int[] outputArr = new int[arr.length];
		int outputArrIndex = 0;
		for (int num : arr) {
			if (num != 0) {
				outputArr[outputArrIndex] = num;
				outputArrIndex++;
			}
		}
		System.out.println("Output Array	: " + Arrays.toString(outputArr));
	}

	public static void main(String[] args) {
		Program1_ShiftZeroElements program1_ShiftZeroElements = new Program1_ShiftZeroElements();
		int[] inputArr = { 1, 0, 2, 0, 9, 6, 0, 19, 20, 0 };
		program1_ShiftZeroElements.shiftZeroElement(inputArr);
	}
}
