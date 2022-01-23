package priyankaKamble.assignment_23;

import java.util.Arrays;

/*Program 7 : Verify if 2 arrays are identical.
int[] arr1 = {10,44,-33};
int[] arr2 = {10,44,-33}; */

public class IdenticalArrays {

	void areIdentical(int[] input1, int[] input2) {
		String str1 = Arrays.toString(input1);
		String str2 = Arrays.toString(input2);
		if (str1.length() == str2.length()) {
			if (str1.equals(str2))
				System.out.println("Result = Arrays are Identical");
			else
				System.out.println("Result = Arrays are not Identical");
		} else if (str1.length() != str2.length())
			System.out.println("Arrays are not Identical");
	}

	public static void main(String[] args) {
		IdenticalArrays identicalArrays = new IdenticalArrays();
		int[] input1 = { 10, 44,1};
		int[] input2 = { 10, 44, 11 };
		System.out.println("Input Array1 " + Arrays.toString(input1));
		System.out.println("Input Array2 " + Arrays.toString(input2));
		identicalArrays.areIdentical(input1, input2);
		int[] input3 = { 10, 44, -33 };
		int[] input4 = { 10, 44, -33 };
		System.out.println("-----------------Input 2 ------------------");
		System.out.println("Input Array3 " + Arrays.toString(input3));
		System.out.println("Input Array4 " + Arrays.toString(input4));
		identicalArrays.areIdentical(input3, input4);
		int[] input5 = {0,10,1};
		int[] input6 = {100};
		System.out.println("-----------------Input 3 ------------------");
		System.out.println("Input Array5 " + Arrays.toString(input5));
		System.out.println("Input Array6 " + Arrays.toString(input6));
		identicalArrays.areIdentical(input5, input6);
	}
}
