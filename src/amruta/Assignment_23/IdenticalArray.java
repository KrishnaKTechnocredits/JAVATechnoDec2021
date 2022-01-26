/*  Program 7 : Verify if 2 arrays are identical.
int[] arr1 = {10,44,-33};
int[] arr2 = {10,44,-33};

output : both arrays are identical.

int[] arr3 = {10,44,-33};
int[] arr4 = {10,44,-33,55};

output : both arrays are not identical.		*/

package amruta.Assignment_23;

import java.util.Arrays;

class IdenticalArray{
	
	boolean findArraysIdenticalOrNot(int[] input1, int[] input2){
		
		if (Arrays.equals(input1, input2))
			return true;
		else
			return false;
	}
	
	public static void main(String[] args){
		
		int[] arr1 = {10,44,-33};
		int[] arr2 = {10,44,-33};

		int[] arr3 = {10,44,-33};
		int[] arr4 = {10,44,-33,55};
		
		IdenticalArray identicalarray = new IdenticalArray();

		boolean arrayStatus = identicalarray.findArraysIdenticalOrNot(arr1,arr2);
		
		System.out.println("\n------------ 1st Pair of Array ---------------\n");
		
		if (arrayStatus) // if true
			System.out.println("Both Arrays are identical");
		else
			System.out.println("Both Arrays are not identical");
		
		System.out.println("\n------------ 2nd Pair of Array ---------------\n");
		
		boolean arrayStatus1 = identicalarray.findArraysIdenticalOrNot(arr3,arr4);
		
		if (arrayStatus1) // if true
			System.out.println("Both Arrays are identical");
		else
			System.out.println("Both Arrays are not identical\n");		
	}
	
}