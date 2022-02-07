package rohini.Rohini_Assignment23;

import java.util.Arrays;

/*Program 7 : Verify if 2 arrays are identical

int[] arr1 = {10,44,-33};
int[] arr2 = {10,44,-33};

output : both arrays are identical.

int[] arr3 = {10,44,-33};
int[] arr4 = {10,44,-33,55};

output : both arrays are not identical.
 */

public class Program7 {
	void compareArray(int[] a, int[] b) {
		if(a.length == b.length) {
			String str1 = Arrays.toString(a);
			String str2 = Arrays.toString(b);
			if(str1.equals(str2))
				System.out.println("Both arrays are identical");
		}
		else
			System.out.println("Input arrays are not identical");
	}

	public static void main(String[] args) {
		Program7 prg7 = new Program7();
		int[] arr1 = {10,44,-33};
		int[] arr2 = {10,44,-33};
		prg7.compareArray(arr1, arr2);
		int[] arr3 = {10,44,-33};
		int[] arr4 = {10,44,-33,55};
		prg7.compareArray(arr3, arr4);

	}


}
