package priya;

import java.util.Arrays;

public class A17_Triplets {
	
		void printTriplets(int[] input) {
			for (int index = 0; index < input.length - 2; index++) {
				if (input[index] == (input[index + 1] - 1) && input[index] == (input[index + 2] - 2)) {
					System.out.println(input[index] + " , " + (input[index + 1]) + " , " + (input[index + 2]));
				}
			}
		}

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			A17_Triplets consecutiveTriplets = new A17_Triplets();
			int[] input = { 10, 11, 12, 13, 16, 19, 20, 21, 26, 24 };
			System.out.println("Triplets in the given array are: " + Arrays.toString(input));
			consecutiveTriplets.printTriplets(input);

		}
	}

