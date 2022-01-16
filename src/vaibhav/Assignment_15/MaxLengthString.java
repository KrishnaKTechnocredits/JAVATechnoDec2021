/* Assignment - 15 : 30th Dec'2021

Write a program to satisfy below requirement. Make sure method should take Array as parameter. 

Program 6 : return name having maximum length from given array.
input	: String[] arr = {"Karan", "Shweta", "Pallavi", "Abhishek", "Sagar"};
output	: Abhishek

*/

package vaibhav.Assignment_15;

import java.util.Arrays;

public class MaxLengthString {

	String getMaxLengthString(String[] arr) {
		int maxStringLength = arr[0].length();
		String maxLengthString = arr[0];

		for (int index = 1; index < arr.length; index++) {
			if (arr[index].length() > maxStringLength) {
				maxStringLength = arr[index].length();
				maxLengthString = arr[index];
			}
		}
		return maxLengthString;
	}

	public static void main(String[] args) {
		MaxLengthString maxLengthString = new MaxLengthString();
		String[] inputArr = { "Karan", "Shweta", "Pallavi", "Abhishek", "Sagar" };
		String maxLengthName = maxLengthString.getMaxLengthString(inputArr);
		System.out.println("Input String Array : " + Arrays.toString(inputArr));
		System.out.println("Name with maximum length from given array : " + maxLengthName);
	}
}
