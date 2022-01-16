package sagarShrikhande.arrayAndStrings;

import java.util.Arrays;

public class A23_P7_ArrayIdenticalOrNot {
	
	void compareArray(int[] a, int[] b) {
		if(a.length == b.length) {
			String s1 = Arrays.toString(a);
			String s2 = Arrays.toString(b);
			if(s1.equals(s2))
				System.out.println("Both arrays are identical");
		}
		else
			System.out.println("Input arrays are not identical");
	}
	
	public static void main(String[] args) {
		A23_P7_ArrayIdenticalOrNot a23_P7_ArrayIdenticalOrNot = new A23_P7_ArrayIdenticalOrNot();
		int[] arr1 = {10,44,-33};
		int[] arr2 = {10,44,-33};
		a23_P7_ArrayIdenticalOrNot.compareArray(arr1, arr2);
		int[] arr3 = {10,44,-33};
		int[] arr4 = {10,44,-33,55};
		a23_P7_ArrayIdenticalOrNot.compareArray(arr3, arr4);
		
	}

}

/* Program 7 : Verify if 2 arrays are identical.

int[] arr1 = {10,44,-33};
int[] arr2 = {10,44,-33};

output : both arrays are identical.

int[] arr3 = {10,44,-33};
int[] arr4 = {10,44,-33,55};

output : both arrays are not identical.  */
