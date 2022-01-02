package naquibalam;

import java.util.Arrays;

public class A17_TripletCheck {

	void getConsecutiveTriplets(int[] arr) {
		Arrays.sort(arr);
		System.out.println("Below are all triplets in which all 3 numbers are consecutive from the given array : ");
		for (int i = 0; i < arr.length-2; i++) {
			if ((arr[i+1] == (arr[i] + 1)) && (arr[i+2] == (arr[i] + 2))) {
				System.out.println((arr[i]) + " - " + (arr[i+1]) + " - " + (arr[i+2]));
			}
		}
	}
	
	public static void main(String[] args) {
		A17_TripletCheck a17_TripletCheck = new A17_TripletCheck();
		int[] arr = {10,13,14,15,16,19,20,22,23,24};
		a17_TripletCheck.getConsecutiveTriplets(arr);
	}
}
