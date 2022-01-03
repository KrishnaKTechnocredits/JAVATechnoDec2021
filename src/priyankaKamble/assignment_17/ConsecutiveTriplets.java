package priyankaKamble.assignment_17;

import java.util.Arrays;

/*Assignment - 17 : 1st Jan'2022
Program 1: Print all triplets in which all 3 numbers are consecutive.
Sample input : int[] arr = {10,13,14,15,16,19,20,22,23,24};
output : 13 -> 14 -> 15
              14 -> 15 -> 16
              22 -> 23 -> 24 */

public class ConsecutiveTriplets {
	boolean flag= false;
	void findTriples(int[] arr) {
		for (int index=0; index <=arr.length-3 ; index++) {
			int num = arr[index];
			if(arr[index +1] == arr[index]+1 && arr[index +2] == arr[index]+2 ) {
				flag= true;
				System.out.println(arr[index] + "->"+ arr[index +1] + "->"+arr[index +2]);
			}
		}
	}
	
	
	public static void main(String[] args) {
		ConsecutiveTriplets consecutiveTriplets = new ConsecutiveTriplets();
		int[] arr = {10,13,14,15,16,19,20,22,23,24};
		System.out.println("Given Array is- "+ Arrays.toString(arr) );
		System.out.println("\nConsecutive Triplets are = "); 
		consecutiveTriplets.findTriples(arr);
	}
}
