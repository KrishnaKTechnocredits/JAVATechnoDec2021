/*Assignment - 17: 1st Jan'2022
Program 1: Print all triplets in which all 3 numbers are consecutive.
Sample input : int[] arr = {10,13,14,15,16,19,20,22,23,24};
output : 	  13 -> 14 -> 15
              14 -> 15 -> 16
              22 -> 23 -> 24 
*/

package deepak;

import java.util.Arrays;

public class A17_ConsecutiveTriplets {

	void printTriplets(int[] input) {
		for (int index = 0; index < input.length - 2; index++) {
			if (input[index] == (input[index + 1] - 1) && input[index] == (input[index + 2] - 2)) {
				System.out.println(input[index] + " , " + (input[index + 1]) + " , " + (input[index + 2]));
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A17_ConsecutiveTriplets consecutiveTriplets = new A17_ConsecutiveTriplets();
		int[] input = { 10, 13, 14, 15, 16, 19, 20, 22, 23, 24 };
		System.out.println("Below are the Consecutive triplets in the given array: " + Arrays.toString(input));
		consecutiveTriplets.printTriplets(input);

	}
}