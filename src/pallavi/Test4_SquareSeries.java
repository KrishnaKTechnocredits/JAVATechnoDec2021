/*Programming Test : 27th Jan'2022

Program - 1 : WAP to find next number in an array is square of previous number or not

Input 1: {2,4,16,256}

output 1 : true

Note: 4 is square of 2, 16 is square of 4, and so on
*/

package pallavi;

import java.util.Arrays;
import java.util.Scanner;

public class Test4_SquareSeries {

	boolean isSqaureSeries(int[] input) {
		boolean isSquare = true;

		for (int i = 0; i < input.length - 1; i++) {

			if (input[i + 1] != (input[i] * input[i])) {
				isSquare = false;
				break;
			}
		}
		return isSquare;
	}

	public static void main(String[] args) {
		int[] input1 = { 2, 4, 16, 256 };
		System.out.println("Input:- " + Arrays.toString(input1));
		System.out.println("Output:- " + new Test4_SquareSeries().isSqaureSeries(input1));

		int[] input2 = { 2, 4, 5, 15 };
		System.out.println("Input:- " + Arrays.toString(input2));
		System.out.println("Output:- " + new Test4_SquareSeries().isSqaureSeries(input2));
	}

}
