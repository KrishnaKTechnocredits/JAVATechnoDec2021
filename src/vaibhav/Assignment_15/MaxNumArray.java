/* Assignment - 15 : 30th Dec'2021

Write a program to satisfy below requirement. Make sure method should take Array as parameter. 

Program 1 : Return maximum number from give array.
 
 */

package vaibhav.Assignment_15;

import java.util.Arrays;

public class MaxNumArray {

	int getMaxNum(int[] arr) {
		int maxNum = arr[0];
		for (int index = 1; index < arr.length; index++) {
			if (maxNum < arr[index])
				maxNum = arr[index];
		}
		return maxNum;
	}

	public static void main(String[] args) {
		MaxNumArray maxNumArray = new MaxNumArray();
		int[] inputArr = { 10, 26, 46, 9, 26, 99, 65, 97, 16 };
		System.out.println("Input Array : " + Arrays.toString(inputArr));
		int maxNum = maxNumArray.getMaxNum(inputArr);
		System.out.println("Maximum number form the given array is : " + maxNum);
	}

}
