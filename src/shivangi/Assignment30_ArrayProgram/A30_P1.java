/*
Assignment-30
program-1. WAP to shift all the zero elements of an array after the non zero elements present in the given array.
Input     : {1, 0, 2, 0, 9, 6, 0, 19, 20, 0}
Output  : {1, 2, 9, 6, 19, 20, 0, 0, 0, 0}
*/
package shivangi.Assignment30_ArrayProgram;

import java.util.Arrays;

public class A30_P1 {
	
	void shiftAllZeroInLast(int[] numArr) {
		System.out.println("Input Array is : " + Arrays.toString(numArr));
		int count = 0;
		int[] outputArr = new int[numArr.length];
		//System.out.println(Arrays.toString(outputArr));
		for(int index=0; index<=numArr.length-1; index++) {
			
			/*This condition will work only when numArray[index]'s value is non-zero and will hold into output 
			array as per the count value*/
			if(numArr[index]!=0) {
				outputArr[count] = numArr[index];
				//System.out.println(outputArr[count]);
				count++;
			}
		}
		System.out.println("output Array is : " + Arrays.toString(outputArr));
	}
	
	public static void main(String[] args) {
		int[] numArr = {1, 0, 2, 0, 9, 6, 0, 19, 20, 0};
		A30_P1 p1 = new A30_P1();
		p1.shiftAllZeroInLast(numArr);
	}
}
