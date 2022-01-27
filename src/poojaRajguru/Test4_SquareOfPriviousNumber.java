package poojaRajguru;

import java.util.Arrays;

public class Test4_SquareOfPriviousNumber {	
	boolean isSquare(int[] arr) {		
		boolean flag = false;
		for(int i = 0;i< arr.length-1; i++) {
			int prod = arr[i]*arr[i];
			if(prod == arr[i+1]) {
				flag = true;			
			}
			else
				flag = false;
		}
		return flag;
	}
	public static void main(String[] ags) {
		Test4_SquareOfPriviousNumber square = new Test4_SquareOfPriviousNumber();
		int[] arr = {2,4,16,256};
		System.out.println(Arrays.toString(arr));
		System.out.println(square.isSquare(arr));
	}
}
