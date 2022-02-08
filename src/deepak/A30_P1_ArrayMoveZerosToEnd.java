/*Assignment 30: 29th Jan'2022  
1. WAP to shift all the zero elements of an array after the non zero elements present in the given array. 
Input     : {1, 0, 2, 0, 9, 6, 0, 19, 20, 0} Output  : {1, 2, 9, 6, 19, 20, 0, 0, 0, 0} 
*/

package deepak;

import java.util.Arrays;

public class A30_P1_ArrayMoveZerosToEnd {

	void moveZerosToEnd(int[] input) {
		int length = input.length;
		int[] output = new int[length];
		int count = 0;
		for (int i = 0; i < length; i++) {
			if (input[i] != 0) {
				output[count] = input[i];
				count++;
			}
		}
		System.out.println("Output array:" + Arrays.toString(output));
	}

	public static void main(String[] args) {

		A30_P1_ArrayMoveZerosToEnd array = new A30_P1_ArrayMoveZerosToEnd();
		int input[] = { 1, 0, 2, 0, 9, 6, 0, 19, 20, 0 };
		System.out.println("Input array:" + Arrays.toString(input));
		array.moveZerosToEnd(input);

	}

}
