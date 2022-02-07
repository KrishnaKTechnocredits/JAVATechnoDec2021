/*/*Assignment 30 : 29th Jan'2022

1. WAP to shift all the zero elements of an array after the non zero elements present in the given array.
Input     : {1, 0, 2, 0, 9, 6, 0, 19, 20, 0}
Output  : {1, 2, 9, 6, 19, 20, 0, 0, 0, 0}
 */
package anjali.Assignment30;

import java.util.Arrays;

public class program1 {
	
	
	static int[] program1(int arr[]) 
	{
		int [] output= new int [arr.length];
		int count=0;
		for(int index=0;index<arr.length;index++) 
		{
			if(arr[index]!=0) 
			{
				output[count]=arr[index];
				count++;
				//System.out.println(Arrays.toString(output));
			}
		}
		return output;
	}

	public static void main(String[] args) {
		int [] arr= {1, 0, 2, 0, 9, 6, 0, 19, 20, 0};
	    int[] output=program1(arr);
	    System.out.println(Arrays.toString(output));
	}

}
