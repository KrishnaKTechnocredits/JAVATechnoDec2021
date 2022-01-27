/*
Programming Test : 27th Jan'2022

Program - 1 : WAP to find next number in an array is square of previous number or not

Input 1: {2,4,16,256}

output 1 : true

Note: 4 is square of 2, 16 is square of 4, and so on
*/

package shivangi.exam.exam4;

import java.util.Arrays;

public class Shivangi_Exam4_1 {
	boolean isNextNumSquraeOfPrevNumFromArray(int[] arr) {
		boolean flag = false;
		for (int index=0; index<arr.length-1; index++) {
			int square = arr[index]*arr[index];
			if (square == arr[index+1]) {
				flag = true;
			}else {
				flag = false;
				break;
			}
		}
		return flag;
	}
	
	public static void main(String[] args) {
		int[] arr1 = {2,4,16,256};
		int[] arr2 = {3,9,81,6561};
		int[] arr3 =  {5,25,625,67};
		Shivangi_Exam4_1 shivangi_Exam4_1 = new Shivangi_Exam4_1();
		System.out.println("Input array : " + Arrays.toString(arr1));
		System.out.println(shivangi_Exam4_1.isNextNumSquraeOfPrevNumFromArray(arr1));
		System.out.println();
		System.out.println("Input array : " + Arrays.toString(arr2));
		System.out.println(shivangi_Exam4_1.isNextNumSquraeOfPrevNumFromArray(arr2));
		System.out.println();
		System.out.println("Input array : " + Arrays.toString(arr3));
		System.out.println(shivangi_Exam4_1.isNextNumSquraeOfPrevNumFromArray(arr3));
	}
}
