/*Assignment 30 : 29th Jan'2022

2. WAP to find out unique elements from the given array an return in the form of an array.
Input    : {1, 9, 1, 3, 16, 3, 9, 59, 4, 4, 16}
Output : {1, 9, 3, 16, 59, 4}

Input    : {19, 8, 0, 8, 60, 56, 97, 0, 33, 60, 0}
Output : {19, 8, 0, 60, 56, 97, 33}

*/

package vaibhav.Assignment_30;

import java.util.Arrays;

public class Program2_UniqueElementsOfArray {

	int tempNumber;

	/*
	void setMinTempNumber(int[] arr) {
		int minNum = arr[0];

		for (int index = 1; index < arr.length; index++) {
			if (arr[index] <= minNum) {
				minNum = arr[index];
			}
		}
		tempNumber = minNum - 10;
	}*/

	void getArrayOfUniqueElements(int[] inputArr) {
		// int[] inputArray1= { 1, 9, 1, 3, 16, 3, 9, 59, 4, 4, 16 };
		// int[] arr = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}
		int[] uniqueElementArray = new int[inputArr.length];
		int uniqueElementArrIndex = 0;
		int countUniqueElements = 0;
		int zeroCount = 0;

		for (int index = 0; index < inputArr.length; index++) {
			int currentNum = inputArr[index];
			boolean flag = true;

			for (int innerIndex = 0; innerIndex <= uniqueElementArrIndex; innerIndex++) {
				if (currentNum == uniqueElementArray[innerIndex]) {
					if (currentNum != 0) {
						flag = false;
						break;
					} else if (currentNum == 0) {
						zeroCount++;
						if (zeroCount > 1) {
							flag = false;
							break;
						}
					}
				}
			}

			if (flag == true) {
				uniqueElementArray[uniqueElementArrIndex] = currentNum;
				uniqueElementArrIndex++;
				countUniqueElements++;
			}
		}

		int[] finalUniqueElementArray = new int[countUniqueElements];

		for (int index = 0; index < countUniqueElements; index++) {
			finalUniqueElementArray[index] = uniqueElementArray[index];
		}
		System.out.println("Input Array  : " + Arrays.toString(inputArr));
		System.out.println("Output Array : " + Arrays.toString(finalUniqueElementArray));
	}

	public static void main(String[] args) {
		Program2_UniqueElementsOfArray program2_UniqueElementsOfArray = new Program2_UniqueElementsOfArray();
		int[] inputArray1 = { 1, 9, 1, 3, 16, 3, 9, 59, 4, 4, 16 };
		int[] inputArray2 = { 19, 8, 0, 8, 60, 56, 97, 0, 33, 60, 0 };
		System.out.println("Expected Output Array of unique elements for the given input array : \n");
		program2_UniqueElementsOfArray.getArrayOfUniqueElements(inputArray1);
		System.out.println();
		program2_UniqueElementsOfArray.getArrayOfUniqueElements(inputArray2);
	}

}
