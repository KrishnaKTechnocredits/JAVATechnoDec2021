package rushikesh.assign23;

import java.util.Arrays;

//Program 7 : Verify if 2 arrays are identical.
//
//int[] arr1 = {10,44,-33};
//int[] arr2 = {10,44,-33};
//
//output : both arrays are identical.
//
//int[] arr3 = {10,44,-33};
//int[] arr4 = {10,44,-33,55};
//
//output : both arrays are not identical.
public class Assign23_7 {
	void checkArrayIsIdentical(int[]arr1,int[] arr2) {
		if(arr1.length==arr2.length) {
			String s1=Arrays.toString(arr1);
			String s2=Arrays.toString(arr2);
			if(s1.equals(s2)) {
				System.out.println("both arrays are identical.");
			}else
				System.out.println("both arrays are not identical.");	
			
		}else
			System.out.println("both arrays are not identical.");
	}
	public static void main(String[] args) {
		Assign23_7 assign23_7=new Assign23_7();
		int[] arr1 = {10,44,-33};
		int[] arr2 = {10,44,-33};
		assign23_7.checkArrayIsIdentical(arr1, arr2);
	}
}
