package jagdish;
/*Program 7 : Verify if 2 arrays are identical.

int[] arr1 = {10,44,-33};
int[] arr2 = {10,44,-33};

output : both arrays are identical.

int[] arr3 = {10,44,-33};
int[] arr4 = {10,44,-33,55};

output : both arrays are not identical.*/

import java.util.Arrays;

public class A23_7_Assignment {

	void compareArray(int[] input1, int[] input2) {

		if (input1.length == input2.length) {
			String str1 = Arrays.toString(input1);
			String str2 = Arrays.toString(input2);

			if (str1.equals(str2))
				System.out.println("Both are identical");
		} else {
			System.out.println("Both are not identical");
		}

	}

	public static void main(String[] args) {
		A23_7_Assignment ac = new A23_7_Assignment();
		int[] arr1 = { 10, 44, -33 };
		int[] arr2 = { 10, 44, -33 };
		ac.compareArray(arr1, arr2);

		int[] arr3 = { 10, 44, -33 };
		int[] arr4 = { 10, 44, -33, 55 };
		ac.compareArray(arr3, arr4);

	}

}
