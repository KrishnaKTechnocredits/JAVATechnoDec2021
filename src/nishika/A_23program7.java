package nishika;

import java.util.Arrays;

public class A_23program7 {
		
	void arrayIdenticalOrNot(int[] arr, int[] arr1) {
		if(arr.length == arr1.length) {
			String str1 = Arrays.toString(arr);
			String str2 = Arrays.toString(arr1);
			if(str1.equals(str2))
				System.out.println(" Both arrays are identical ");
		}
		else
			System.out.println(" Not identical");
	}
	
	public static void main(String[] args)
	{
		A_23program7 a_23program7 = new A_23program7();
		int[] arr1 = {10,44,-33};
		int[] arr2 = {10,44,-33};
		a_23program7.arrayIdenticalOrNot(arr1, arr2);
		int[] arr3 = {10,44,-33};
		int[] arr4 = {10,44,-33,55};
		a_23program7.arrayIdenticalOrNot(arr3, arr4);
		
	}
	
}
