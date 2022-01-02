/*Assignment - 15: 30th Dec'2021

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
package deepak;

public class A15_ArrayOperations {

	int getMaxNumInArray(int[] input) {
		int max = input[0];
		for (int index = 0; index < input.length; index++) {
			if (max < input[index]) {
				max = input[index];
			}
		}
		return max;
	}

	int getMinNumInArray(int[] input) {
		int min = input[0];
		for (int index = 0; index < input.length; index++) {
			if (min > input[index]) {
				min = input[index];
			}
		}
		return min;
	}

	int getPositiveNumCountInArray(int[] input) {
		int count = 0;
		for (int index = 0; index < input.length; index++) {
			if (input[index] >= 0) {
				count++;
			}
		}
		return count;
	}

	int getPositiveNumSumInArray(int[] input) {
		int sum = 0;
		for (int index = 0; index < input.length; index++) {
			if (input[index] >= 0)
				sum = sum + input[index];

		}
		return sum;
	}

	int getPositiveEvenNumSumInArray(int[] input) {
		int sum = 0;
		for (int index = 0; index < input.length; index++) {
			if (input[index] >= 0)
				if (input[index] % 2 == 0)
					sum = sum + input[index];

		}
		return sum;
	}

	String getMaxlengthStringInArray(String[] input) {
		String str = input[0];
		int length = input[0].length();
		for (int index = 0; index < input.length; index++) {
			if (length < input[index].length()) {
				str = input[index];
			}
		}
		return str;
	}

	public static void main(String[] args) {
		int[] input = { 11, 34, 45, 76, -23, -98, 4, 109, 88, -2, -9, -54 };
		A15_ArrayOperations arrayOperations = new A15_ArrayOperations();
		System.out.print("The Maximum number in the array is: ");
		System.out.println(arrayOperations.getMaxNumInArray(input));
		System.out.print("The Minimum number in the array is: ");
		System.out.println(arrayOperations.getMinNumInArray(input));
		int[] input1 = { 12, -11, 99, 11, 23, -44 };
		System.out.print("The count of positive numbers in the array is: ");
		System.out.println(arrayOperations.getPositiveNumCountInArray(input1));
		int[] input2 = { 10, 20, -33, -55, 2 };
		System.out.print("The sum of positive numbers in the array is: ");
		System.out.println(arrayOperations.getPositiveNumSumInArray(input2));
		int[] input3 = { 10, 13, -14, -20, 22, 3, 4 };
		System.out.print("The sum of even positive numbers in the array is: ");
		System.out.println(arrayOperations.getPositiveEvenNumSumInArray(input3));
		String[] input4 = { "Karan", "Shweta", "Pallavi", "Abhishek", "Sagar" };
		System.out.print("The string with maximum length in the array is: ");
		System.out.println(arrayOperations.getMaxlengthStringInArray(input4));
	}

}
