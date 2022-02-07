/*Assignment 30: 29th Jan'2022  
2. WAP to find out unique elements from the given array an return in the form of an array. 
Input    : {1, 9, 1, 3, 16, 3, 9, 59, 4, 4, 16} 
Output : {1, 9, 3, 16, 59, 4} 

Input    : {19, 8, 0, 8, 60, 56, 97, 0, 33, 60, 0} 
Output : {19, 8, 0, 60, 56, 97, 33}*/

package deepak;

import java.util.Arrays;

public class A30_P2_ArrayUniqueIntegers {

	void getUniqueCount(int[] input) {
		System.out.print("Output: [");
		for (int index = 0; index < input.length; index++) {
			int innerIndex;
			for (innerIndex = 0; innerIndex < index; innerIndex++)
				if (input[index] == input[innerIndex])
					break;
			if (index == innerIndex)
				System.out.print(input[index] + ",");
		}
		System.out.println("]");
	}

	public static void main(String[] args) {

		A30_P2_ArrayUniqueIntegers array = new A30_P2_ArrayUniqueIntegers();
		int input1[] = { 1, 9, 1, 3, 16, 3, 9, 59, 4, 4, 16 };
		int input2[] = { 19, 8, 0, 8, 60, 56, 97, 0, 33, 60, 0 };
		System.out.println("Input: " + Arrays.toString(input1));
		array.getUniqueCount(input1);
		System.out.println();
		System.out.println("Input: " + Arrays.toString(input2));
		array.getUniqueCount(input2);
	}
}
