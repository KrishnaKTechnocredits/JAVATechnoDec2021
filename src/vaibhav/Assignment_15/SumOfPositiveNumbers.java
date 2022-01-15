/* Assignment - 15 : 30th Dec'2021

Write a program to satisfy below requirement. Make sure method should take Array as parameter. 

Program 4 : Return sum of positive numbers from given array.
sample input : int[] arr = {10,20,-33,-55,2};
output : 32
 
*/

package vaibhav.Assignment_15;

import java.util.Arrays;

public class SumOfPositiveNumbers {

	int getPositiveNumberSum(int[] arr) {
		int sum = 0;
		for (int index = 0; index < arr.length; index++) {
			if (arr[index] > 0)
				sum = sum + arr[index];
		}
		return sum;
	}

	public static void main(String[] args) {
		SumOfPositiveNumbers sumOfPositiveNumbers = new SumOfPositiveNumbers();
		int[] inputArr = { 10, 20, -33, -55, 2 };
		int positiveNumSum = sumOfPositiveNumbers.getPositiveNumberSum(inputArr);
		System.out.println("Input Array : " + Arrays.toString(inputArr));
		System.out.println("Sum of positive numbers from given array is : "+positiveNumSum);
	}
}
