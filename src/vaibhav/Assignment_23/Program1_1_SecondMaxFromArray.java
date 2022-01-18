/* Assignment - 23 : 15th Jan'2022

Program 1.1 : Find second max from given array.
input : {1,11,3,99,66,54,22,44};
output : 66

*/

package vaibhav.Assignment_23;

import java.util.Arrays;

public class Program1_1_SecondMaxFromArray {

	void secondMaxNum(int[] arr) {
		int maxNum;
		int secondMax;

		if (arr[0] > arr[1]) {
			maxNum = arr[0];
			secondMax = arr[1];
		} else {
			maxNum = arr[1];
			secondMax = arr[0];
		}

		for (int index = 1; index < arr.length; index++) {
			if (arr[index] > maxNum) {
				secondMax = maxNum;
				maxNum = arr[index];
			} else if (arr[index] > secondMax && arr[index] < maxNum) {
				secondMax = arr[index];
			}
		}

		System.out.println("Maximum number		: " + maxNum);
		System.out.println("Second maximum number	: " + secondMax);
	}

	public final static void main(String[] args) {
		Program1_1_SecondMaxFromArray secondMaxFromArray = new Program1_1_SecondMaxFromArray();
		int[] inputArr = { 1, 11, 3, 99, 66, 54, 22, 44 };
		System.out.println("Given Input Array : " + Arrays.toString(inputArr));
		secondMaxFromArray.secondMaxNum(inputArr);
	}
}