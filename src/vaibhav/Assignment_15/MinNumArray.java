/* Assignment - 15 : 30th Dec'2021

Write a program to satisfy below requirement. Make sure method should take Array as parameter. 

Program 2 : Return minimum number from give array.
 
*/

package vaibhav.Assignment_15;

import java.util.Arrays;

public class MinNumArray {
	int getMinNum(int[] arr) {
		int minNum = arr[0];
		for (int index = 1; index < arr.length; index++) {
			if (minNum > arr[index])
				minNum = arr[index];
		}
		return minNum;
	}

	public static void main(String[] args) {
		MinNumArray minNumArray = new MinNumArray();
		int[] inputArr = { 10, 26, 46, 9, 26, 99, -65, 97, 16 };
		System.out.println("Input Array : " + Arrays.toString(inputArr));
		int minNum = minNumArray.getMinNum(inputArr);
		System.out.println("Minimum number form the given array is : " + minNum);
	}
}
