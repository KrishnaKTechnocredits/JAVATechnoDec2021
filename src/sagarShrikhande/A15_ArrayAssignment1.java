package sagarShrikhande;

public class A15_ArrayAssignment1 {

	int maxNumber(int[] arr) {
		int max = arr[0];
		for (int index = 1; index < arr.length; index++) {
			if (max < arr[index])
				max = arr[index];
		}
		return max;
	}

	int minNumber(int[] arr) {
		int min = arr[0];
		for (int index = 1; index < arr.length; index++) {
			if (min > arr[index])
				min = arr[index];
		}
		return min;

	}

	int countPositiveNum(int[] arr) {
		int count = 0;
		for (int index = 0; index < arr.length; index++) {
			if (arr[index] > 0)
				count++;
		}
		return count;
	}

	int sumOfPositiveNum(int[] arr) {
		int sum = 0;
		for (int index = 0; index < arr.length; index++) {
			if (arr[index] > 0)
				sum = sum + arr[index];
		}
		return sum;

	}

	int sumOfEvenPostiveNum(int[] arr) {
		int sum = 0;
		for (int index = 0; index < arr.length; index++) {
			if (arr[index] > 0 && arr[index] % 2 == 0)
				sum = sum + arr[index];
		}
		return sum;
	}

	String maxLengthString(String[] str) {
		String maxString = str[0];
		int maxLength = str[0].length();
		for (int index = 1; index < str.length; index++) {
			if (maxLength < str[index].length()) {
				maxString = str[index];
				maxLength = str[index].length();
			}

		}
		return maxString;

	}

	public static void main(String[] args) {
		A15_ArrayAssignment1 a15_ArrayAssignment1 = new A15_ArrayAssignment1();
		int[] a = { 75, 86, -29, 45, 99, -5, 80, 101 };
		System.out.println("Max Number in array is: " + a15_ArrayAssignment1.maxNumber(a));
		System.out.println("Min Number in array is: " + a15_ArrayAssignment1.minNumber(a));

		int[] arr = { 12, -11, 99, 11, 23, -44 };
		System.out.println("Count of all positive Numbers in array is: " + a15_ArrayAssignment1.countPositiveNum(arr));

		int[] arr1 = { 10, 20, -33, -55, 2 };
		System.out.println("Sum of all positive Numbers in array is: " + a15_ArrayAssignment1.sumOfPositiveNum(arr1));

		int[] arr2 = { 10, 13, -14, -20, 22, 3 };
		System.out.println("Sum of all positive Even Numbers in array is: " + a15_ArrayAssignment1.sumOfEvenPostiveNum(arr2));

		String[] str = { "Karan", "Shweta", "Pallavi", "Abhishek", "Sagar" };
		System.out.println("String with max length is: " + a15_ArrayAssignment1.maxLengthString(str));
	}
}

/*
 * Write a program to satisfy below requirement. Make sure method should take
 * Array as parameter.
 * 
 * Program 1 : return maximum number from give array.
 * 
 * Program 2 : return minimum number from given array.
 * 
 * Program 3: return count of positive numbers from given array. sample input :
 * int[] arr = {12,-11,99,11,23,-44} output : 4
 * 
 * Program 4 : return sum of positive numbers from given array. sample input :
 * int[] arr = {10,20,-33,-55,2}; output : 32
 * 
 * Program 5 : print sum of all even positive numbers from given array. sample
 * input : int[] arr = {10,13, -14, -20, 22, 3}; output : 32 hint : 10 + 22 = 32
 * 
 * Program 6 : return name having maximum length from given array. input :
 * String[] arr = {"Karan", "Shweta", "Pallavi", "Abhishek", "Sagar"}; output :
 * Abhishek
 */