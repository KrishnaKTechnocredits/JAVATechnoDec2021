/*Assignment 25 : 18th Jan 2022

Program 1.1 : Find the single missing number from the array.*
int num[] = { 1, 2, 8, 10, 9, 5, 7, 6, 4 };
output: 3

Optional Assignment : Try for multiple missing numbers in the same array*

*/

package vaibhav.Assignment_25;

import java.util.Arrays;

public class Program1_SingleMissingNumber {

	int getSingleMissingNum(int[] arr) {
		int sum = 0;
		int n = arr.length + 1;
		int expectedSum = n * (n + 1) / 2;

		for (int index = 0; index < arr.length; index++) {
			sum += arr[index];
		}
		int missingNum = expectedSum - sum;
		return missingNum;
	}

	public static void main(String[] args) {
		Program1_SingleMissingNumber program1_SingleMissingNumber = new Program1_SingleMissingNumber();
		int[] inputArr = { 1, 2, 8, 10, 9, 5, 7, 6, 4 };
		int missingNum = program1_SingleMissingNumber.getSingleMissingNum(inputArr);
		System.out.println("Missing number in the given array " + Arrays.toString(inputArr) + " is : " + missingNum);

	}

}
