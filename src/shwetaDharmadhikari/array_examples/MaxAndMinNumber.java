/*
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
output : Abhishek
 */
package shwetaDharmadhikari.array_examples;

public class MaxAndMinNumber {

	int maximumNumber(int[] input) {
		int index = 0;
		int maxNum = input[index];
		for (; index < input.length; index++) {
			if (input[index] > maxNum)
				maxNum = input[index];
		}
		return maxNum;
	}

	int minimumNumber(int[] input) {
		int index = 0;
		int minNum = input[index];
		for (; index < input.length; index++) {
			if (input[index] < minNum)
				minNum = input[index];
		}
		return minNum;
	}

	int countPositiveNum(int[] input) {
		int count = 0;
		for (int index = 0; index < input.length; index++) {
			if (input[index] > 0)
				count++;
		}
		return count;
	}

	int SumOfPositiveNum(int[] input) {
		int sum = 0;
		for (int index = 0; index < input.length; index++) {
			if (input[index] > 0)
				sum += input[index];
		}
		return sum;
	}

	int SumOfEvenPositiveNum(int[] input) {
		int evenSum = 0;
		for (int index = 0; index < input.length; index++) {
			if (input[index] > 0 && input[index] % 2 == 0)
				evenSum += input[index];
		}
		return evenSum;
	}

	String maxLenghtFromArray(String[] input) {
		int index = 0;
		// Arrays.toString(input)
		int max = input[index].length();
		String maxStr = input[index];
		for (; index < input.length; index++) {

			if (input[index].length() > max) {
				max = input[index].length();
				maxStr = input[index];
			}
		}
		return maxStr;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MaxAndMinNumber maxAndMinNumber = new MaxAndMinNumber();
		int[] arr = { 12, 2, 13, 9, 115 };
		int[] arr1 = { 12, -11, 99, 11, 23, -44 };
		int[] arr2 = { 10, 20, -33, -55, 2 };
		int[] arr3 = { 10, 13, -14, -20, 22, 3 };
		String[] arr4 = { "Karan", "Shweta", "Pallavi", "Abhishek", "Sagar" };
		System.out.println("Maximum number is : " + maxAndMinNumber.maximumNumber(arr));
		System.out.println("Minimum number is : " + maxAndMinNumber.minimumNumber(arr));
		System.out.println("Count of positive numbers is :" + maxAndMinNumber.countPositiveNum(arr1));
		System.out.println("Sum of positive numbers is :" + maxAndMinNumber.SumOfPositiveNum(arr2));
		System.out.println("Sum of even positive numbers is :" + maxAndMinNumber.SumOfEvenPositiveNum(arr3));
		System.out.println("Output :" + maxAndMinNumber.maxLenghtFromArray(arr4));
	}

}
