package priyankaKamble.assignment_15;

import java.util.Arrays;
/* Assignment - 15 : 30th Dec'2021
Write a program to satisfy below requirement. Make sure method should take Array as parameter. 

Program 1 : return maximum number from give array.

Program 2 : return minimum number from given array.

Program 3: return count of positive numbers from given array.
sample input : int[] arr = {12,-11,99,11,23,-44}
output : 4

Program 4 : return sum of positive numbers from given array.
sample input : int[] arr = {10,20,-33,-55,2};
output : 32

Program 5 : print sum of all even positive numbers from given array.
sample input : int[] arr = {10,13, -14, -20, 22, 3};
output : 32
hint : 10 + 22 = 32

Program 6 : return name having maximum length from given array.
input : String[] arr = {"Karan", "Shweta", "Pallavi", "Abhishek", "Sagar"};
output : Abhishek*/

public class ArrayProgram {

	
	int maxNum(int[] arrNum) {
		int maxNumber = arrNum[0];
		for (int index = 1; index < arrNum.length; index++) {
			if (maxNumber < arrNum[index]) {
				maxNumber = arrNum[index];
			}
		}
		// System.out.println("Maximum number from given array is = "+maxNumber);
		return maxNumber;
	}

	int minNum(int[] arrNum) {
		int minNumber = arrNum[0];
		for (int index = 1; index < arrNum.length; index++) {
			if (minNumber > arrNum[index]) {
				minNumber = arrNum[index];
			}
		}
		// System.out.println("Maximum number from given array is = "+minNumber);
		return minNumber;
	}

	int positiveNum(int[] arrNum) {
		int count = 0, sum = 0, sumOfEvenNum = 0;
		for (int index = 0; index < arrNum.length; index++) {
			if (arrNum[index] > 0) {
				sum = sum + arrNum[index];
				count++;
			}
			if (arrNum[index] > 0 && arrNum[index] % 2 == 0)
				sumOfEvenNum = sumOfEvenNum + arrNum[index];
		}
		System.out.println("Sum of Positive numbers from given array  is = " + sum);
		System.out.println("Sum of all EVEN Positive numbers from given array  is = " + sumOfEvenNum);
		return count;
	}
	
	String maxLength(String[] arr) {
		String maxName =""; int maxLength =0 ;
		for (int index = 0; index < arr.length; index++) {
			if(maxLength <arr[index].length()) {
				maxLength = arr[index].length();
				maxName = arr[index];
			}
		}
		return maxName;
	}
	
	public static void main(String[] args) {
		ArrayProgram arrayProgram = new ArrayProgram();
		int[] arrNum = { 10, 13, -14, -20, 22, 3 };
		String[] arr = {"Karan", "Shweta", "Pallavi", "Abhishek", "Sagar"};
		
		System.out.println("Given Array is = " + Arrays.toString(arrNum));
		System.out.println("\nMaximum number from given array  is = " + arrayProgram.maxNum(arrNum)); // arrayProgram.maxNum(arrNum);
		System.out.println("Minimum number from given array  is = " + arrayProgram.minNum(arrNum)); // arrayProgram.minNum(arrNum);
		System.out.println("Total Count of Positive numbers from given array  is = " + arrayProgram.positiveNum(arrNum)); // arrayProgram.positiveNum(arrNum);
		System.out.println("Name with maximum length from given array  is = " + arrayProgram.maxLength(arr)); // arrayProgram.maxLength(arr);
	}
}
