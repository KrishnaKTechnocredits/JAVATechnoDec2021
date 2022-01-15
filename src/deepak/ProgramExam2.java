/*1. How to find all pairs in an array of integers whose sum is equal to the given number
i/p  : {5,1,2,7,6,3,4,9} , sum : 6
o/p : {5,1}, {2,4} -------30 mins

2. WAP to print a single occurrence element from the array in Java?
i/p  : {5,8,1,2,4,3,2,1}
o/p : {5,8,4,3} -------20 mins
*/

package deepak;

import java.util.Arrays;

public class ProgramExam2 {

	void getPairSum(int[] input1) {
		int[] output = new int[2];
		System.out.println("Pairs in array having sum equal to 6: ");
		for (int index = 0; index < input1.length; index++) {
			for (int innerIndex = index + 1; innerIndex < input1.length; innerIndex++) {
				if (input1[index] + input1[innerIndex] == 6) {
					output[0] = input1[index];
					output[1] = input1[innerIndex];
					System.out.println("{" + output[0] + "," + output[1] + "}");
				}
			}
		}
		System.out.println();
	}

	void getSingleOccurance(int[] input2) {
		String temp = Arrays.toString(input2);
		char ch = ' ';
		System.out.print("Single occurance of elements in the array: ");
		for (int index = 0; index < temp.length(); index++) {
			ch = temp.charAt(index);
			if (temp.indexOf(ch) == temp.lastIndexOf(ch))
				System.out.print(ch + " ");
		}
	}

	public static void main(String[] args) {
		ProgramExam2 test1 = new ProgramExam2();
		int[] input1 = { 5, 1, 2, 7, 6, 3, 4, 9 };
		int[] input2 = { 5, 8, 1, 2, 4, 3, 2, 1 };
		test1.getPairSum(input1);
		test1.getSingleOccurance(input2);
	}
}
