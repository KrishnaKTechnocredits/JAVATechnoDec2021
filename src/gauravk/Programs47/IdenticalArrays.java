package gauravk.Programs47;
import java.util.Arrays;

/*
 * 21.Write a program to check if the two arrays are identical
i/p1 : {5,1,3,6}, i/p2: {5,1,3,9}
o/p : true
 */
public class IdenticalArrays {
	
	boolean checkingArrays(int[] arr1, int[] arr2) {
		if(arr1.length==arr2.length) {
			int mismatchCount=0;
			for(int i=0; i<arr1.length; i++) {
				if(arr1[i]!=arr2[i]) {
					mismatchCount++;
					return false;
				}
			}if(mismatchCount==0)
				return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		int[]input1 = {5,1,3,6};
		int[]input2 = {5,1,3,6};
		int[]input3 = {5,1,3,9};
		IdenticalArrays ia = new IdenticalArrays();
		System.out.println("Between "+Arrays.toString(input1)+" and "+Arrays.toString(input2)+" : "+ia.checkingArrays(input1, input2));
		System.out.println("Between "+Arrays.toString(input2)+" and "+Arrays.toString(input3)+" : "+ia.checkingArrays(input2, input3));
		System.out.println("Between "+Arrays.toString(input3)+" and "+Arrays.toString(input1)+" : "+ia.checkingArrays(input3, input1));
	}
}
// to compare the content of two arrays.
/*1 use hashmap
 * 2 use treeset
 * 3 list then Collections.sort() and then removeall
 * 4 Arrays.sort() and compare by index.
*/ 
