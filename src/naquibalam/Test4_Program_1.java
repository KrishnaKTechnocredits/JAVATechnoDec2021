package naquibalam;

import java.util.Arrays;

public class Test4_Program_1 {

	boolean getSquareSequence(int arr[]) {
		boolean output = true;
		for (int i = 1; i < arr.length; i++) {
			if (!(arr[i] == (arr[i-1] * arr[i-1]))) {
				return output = false;
			}
		}
		return output;
	}
	
	public static void main(String[] args) {
		Test4_Program_1 test4_Program_1 = new Test4_Program_1();
		int arr[] = {2,4,16,256};
		//int arr[] = {3,9,81,6561};
		//int arr[] = {1,1,1,1,1,1,1,1,1};
		System.out.println("The given array " + Arrays.toString(arr) +" has each next number as square of previous number : " + test4_Program_1.getSquareSequence(arr));
	}
}
