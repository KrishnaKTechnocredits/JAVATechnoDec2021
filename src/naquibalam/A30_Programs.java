package naquibalam;

import java.awt.datatransfer.StringSelection;
import java.util.Arrays;

public class A30_Programs {
	
	int[] getZeroAtEnd(int[] input) {
		int output[] = new int[input.length];
		int count = 0;
		for (int i = 0; i < input.length; i++) {
			if (input[i] != 0) {
				output[count] = input[i];
				count++;
			}
		}
		return output;
	}
	
	int findMax(int[] input) {
		int maxNum = 0;
		for (int i : input) {
			if (i > maxNum)
				maxNum = i;
		}
		return maxNum;
	}
	
	int[] getUniqueNumbers(int[] input) {
		int max = findMax(input) + 1;
		int count = 0;
		for (int i = 0; i < input.length; i++) {
			if (input[i] != max) {
				for (int j = i + 1; j < input.length; j++)  {
					if (input[i] == input[j]) {
						input[j] = max;
					}
				}
				count++;
			}
		}
		int[] output = new int[count];
		int j = 0;
		for (int i = 0; i < input.length; i++) {
			if (input[i] != max) {
				output[j] = input[i];
				j++;
			}
		}
		return output;
	}
	
	public static void main(String[] args) {
		A30_Programs a30_Programs = new A30_Programs();
		int[] arr1 = {1, 0, 2, 0, 9, 6, 0, 19, 20, 0};
		int[] arr2 = {1, 9, 1, 3, 16, 3, 9, 59, 4, 4, 16};
		int[] arr3 = {19, 8, 0, 8, 60, 56, 97, 0, 33, 60, 0};
		System.out.println("-----------------------------------------------------------------");
		System.out.println("Shift all the zero elements of an array after the non zero elements");
		System.out.println("Input - " + Arrays.toString(arr1));
		System.out.println("Output - " + Arrays.toString(a30_Programs.getZeroAtEnd(arr1)));
		System.out.println("-----------------------------------------------------------------");
		System.out.println("Find out unique elements from the given array an return in the form of an array");
		System.out.println("Input - " + Arrays.toString(arr1));
		System.out.println("Output - " + Arrays.toString(a30_Programs.getUniqueNumbers(arr2)));
		System.out.println("-----------------------------------------------------------------");
		System.out.println("Find out unique elements from the given array an return in the form of an array");
		System.out.println("Input - " + Arrays.toString(arr1));
		System.out.println("Output - " + Arrays.toString(a30_Programs.getUniqueNumbers(arr3)));
		System.out.println("-----------------------------------------------------------------");
	}
}
