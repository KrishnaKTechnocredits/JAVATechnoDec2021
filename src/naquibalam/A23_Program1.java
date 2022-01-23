package naquibalam;

import java.util.Arrays;
import java.util.Scanner;

public class A23_Program1 {
	
	int getMax(int[] arr) {
		int max = arr[0];
		int tempIndex = 0;
		for (int i=0; i<arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
				tempIndex = i;
			}
		}
		arr[tempIndex] = findMin(arr);
		return max;
	}
	
	int getNthMax(int[] arr, int nth) {
		int out = 0;
		for (int i=1; i<=nth; i++) {
			out = getMax(arr);
		}
		return out;	
	}
	
	int findMin(int[] arr) {
		int min = arr[0];
		for (int i=1; i<arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		return min;	
	}

    public static void main(String args[]) {
    	int[] arr = {1,11,3,99,66,54,22,44};
    	A23_Program1 a23_Program1 = new A23_Program1();
		System.out.print("Find 2nd highest number from the given array - ");
		System.out.println(Arrays.toString(arr));
		System.out.println("2nd highest number from the given array is : " + a23_Program1.getNthMax(arr,2));
    }
}


