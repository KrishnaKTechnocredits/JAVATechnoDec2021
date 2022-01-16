/* Assignment - 15 : 30th Dec'2021

Write a program to satisfy below requirement. Make sure method should take Array as parameter. 

Program 3: Return count of positive & negative numbers from given array.
sample input : int[] arr = {12,-11,99,11,23,-44}
output (Positive Numbers) : 4
output (Negative Numbers) : 2
 
*/

package vaibhav.Assignment_15;

import java.util.Arrays;

public class PositiveNegativeNumbers {

	int getPositiveNumberCount(int[] arr) {
		int positiveCount = 0;
		for (int index = 0; index < arr.length; index++) {
			if (arr[index] > 0)
				positiveCount++;
		}
		return positiveCount;
	}

	int getNegativeNumberCount(int[] arr) {
		int negativeCount = 0;
		for (int index = 0; index < arr.length; index++) {
			if (arr[index] < 0)
				negativeCount++;
		}
		return negativeCount;
	}

	public static void main(String[] args) {
		PositiveNegativeNumbers positiveNegativeNumbers = new PositiveNegativeNumbers();
		int[] inputArr = { 12, -11, 99, 11, 23, -44 };
		int positiveNumCount = positiveNegativeNumbers.getPositiveNumberCount(inputArr);
		int negativeNumCount = positiveNegativeNumbers.getNegativeNumberCount(inputArr);
		System.out.println("Input Array : " + Arrays.toString(inputArr));
		System.out.println("Positive number count from input array is : " + positiveNumCount);
		System.out.println("Negative number count from input array is : " + negativeNumCount);
	}
}
