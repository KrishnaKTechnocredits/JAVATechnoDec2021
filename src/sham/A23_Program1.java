/*
 * Program 1 : Find second max from given array.
input : {1,11,3,99,66,54,22,44};
output : 66 */

package sham;

import java.util.Arrays;

public class A23_Program1 {

	static int findMaxNoInArray(int[] arr) {
		int max = 0;
		int tempindex = 0;
		for (int index = 0; index < arr.length; index++) {
			if (arr[index] > max) {
				max = arr[index];
				tempindex = index;
				
			}
		}
		arr[tempindex] = 0;
	//	System.out.println(Arrays.toString(arr));
		return max;
	}
    
	//if we want 2 max then below method call findmax method 2 times...same for n
	static void findNthMax(int arr[], int n) {
		int output = 0;
		for (int i = 1; i <= n; i++) {
			output = findMaxNoInArray(arr);
		}
		System.out.println("second max from Given String is:  "+output);
	}

	public static void main(String[] args) {
		int[] arr = { 1, 11, 3, 99, 66, 54, 22, 44 };
		findNthMax(arr, 2);
	}

}
