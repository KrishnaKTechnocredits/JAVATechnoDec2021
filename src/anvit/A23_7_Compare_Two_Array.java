package anvit;

import java.util.Arrays;

public class A23_7_Compare_Two_Array {
	
	void array(){
		int[] arr1 = {10,44,-33};
		int[] arr2 = {10,44,-33};
		int[] arr3 = {10,44,-33};
		int[] arr4 = {10,44,-33,55};
		String s1 = Arrays.toString(arr1);
		String s2 = Arrays.toString(arr3);
		String s3 = Arrays.toString(arr3);
		String s4 = Arrays.toString(arr4);
		if(s1.equals(s2))
			System.out.println("Array 1 is equal to Array 2");
		else
			System.out.println("Array 1 is not equal to Array 2");
		if(s3.equals(s4))
			System.out.println("Array 3 is equal to Array 4");
		else
			System.out.println("Array 3 is not equal to Array 4");
	}
	
	public static void main(String[] args) {
		A23_7_Compare_Two_Array a23_7_Compare_Two_Array = new A23_7_Compare_Two_Array();
		a23_7_Compare_Two_Array.array();
	}
}
