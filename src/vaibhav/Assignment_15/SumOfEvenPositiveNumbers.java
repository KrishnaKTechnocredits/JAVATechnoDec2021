/* Assignment - 15 : 30th Dec'2021

Write a program to satisfy below requirement. Make sure method should take Array as parameter. 

Program 5 : Print sum of all even positive numbers from given array.
sample input : int[] arr = {10, 13, -14, -20, 22, 3};
output : 32
hint : 10 + 22 = 32

*/

package vaibhav.Assignment_15;

import java.util.Arrays;

public class SumOfEvenPositiveNumbers {

	int getEvenPositiveNumberSum(int[] arr) {
		int sum = 0;
		for (int index = 0; index < arr.length; index++) {
			if (arr[index] > 0 && arr[index] % 2 == 0)
				sum = sum + arr[index];
		}
		return sum;
	}

	public static void main(String[] args) {
		SumOfEvenPositiveNumbers sumOfEvenPositiveNumbers = new SumOfEvenPositiveNumbers();
		int[] inputArr = { 10, 13, -14, -20, 22, 3 };
		int evenPositiveNumSum = sumOfEvenPositiveNumbers.getEvenPositiveNumberSum(inputArr);
		System.out.println("Input Array : " + Arrays.toString(inputArr));
		System.out.println("Sum of even positive numbers from given array is : " + evenPositiveNumSum);
	}

}
