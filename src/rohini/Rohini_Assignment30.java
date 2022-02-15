package rohini;

import java.util.Arrays;

/*
Assignment 30 : 29th Jan'2022

1. WAP to shift all the zero elements of an array after the non zero elements present in the given array.
Input     : {1, 0, 2, 0, 9, 6, 0, 19, 20, 0}
Output  : {1, 2, 9, 6, 19, 20, 0, 0, 0, 0}

2. WAP to find out unique elements from the given array an return in the form of an array.
Input    : {1, 9, 1, 3, 16, 3, 9, 59, 4, 4, 16}
Output : {1, 9, 3, 16, 59, 4}

Input    : {19, 8, 0, 8, 60, 56, 97, 0, 33, 60, 0}
Output : {19, 8, 0, 60, 56, 97, 33}
 */

public class Rohini_Assignment30 {
	void shiftZeroAtLast(int[] input) {
		int length = input.length;
		int index1 = 0;
		int[] input1 = new int[length];
		for (int index = 0; index < input.length; index++) {
			int temp = input[index];
			if (temp != 0)
				input1[index1++] = temp;
		}
		System.out.println(Arrays.toString(input1));
	}
	void findUniqueElement(int[] input) {
		for (int index = 0; index < input.length; index++) {
			int temp = input[index];
			int innerIndex;
			for (innerIndex = 0; innerIndex < index; innerIndex++) {
				if (temp == input[innerIndex])
					break;
			}
			if (index == innerIndex)
				System.out.print(input[index] + " ");
		}
	}
	public static void main(String[] args) {
		Rohini_Assignment30 ass30= new Rohini_Assignment30();
	    System.out.println("Program 1 - Output :");
		int[] arr = { 1, 0, 2, 0, 9, 6, 0, 19, 20, 0 };
		ass30.shiftZeroAtLast(arr);

		System.out.println("\n");
		System.out.println("Unique Array :");
		int[] arr1 = { 19, 8, 0, 8, 60, 56, 97, 0, 33, 60, 0 };
		ass30.findUniqueElement(arr1);

	}
}
