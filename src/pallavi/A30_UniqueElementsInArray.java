/*Assignment 30 : 29th Jan'2022

1. WAP to find out unique elements from the given array an return in the form of an array.
Input    : {1, 9, 1, 3, 16, 3, 9, 59, 4, 4, 16}
Output : {1, 9, 3, 16, 59, 4}

Input    : {19, 8, 0, 8, 60, 56, 97, 0, 33, 60, 0}
Output : {19, 8, 0, 60, 56, 97, 33}
*/

package pallavi;

import java.util.Arrays;

public class A30_UniqueElementsInArray {
	int maxNum;

	void findMaxNum(int[] input) {

		for (int i : input) {
			if (i > maxNum)
				maxNum = i;
		}
	}

	void getUniqueElementArray(int[] input) {
		int count = 0;
		findMaxNum(input);
		maxNum = maxNum + 10;
		for (int i = 0; i < input.length - 1; i++) {
			if (input[i] != maxNum) {
				for (int j = i + 1; j < input.length; j++) {
					if (input[i] == input[j])
						input[j] = maxNum;
				}
				count++;
			}
		}
		int[] output = new int[count];
		int j = 0;
		for (int i : input) {
			if (i != maxNum) {
				output[j] = i;
				j++;
			}
		}
		System.out.println("Output :-" + Arrays.toString(output));
	}

	public static void main(String[] args) {
		int[] input = {19, 8, 0, 8, 60, 56, 97, 0, 33, 60, 0};
		System.out.println("Input :-" + Arrays.toString(input));
		new A30_UniqueElementsInArray().getUniqueElementArray(input);

	}
}
