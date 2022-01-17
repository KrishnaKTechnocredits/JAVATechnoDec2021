package priyankaKamble.assignment_23;

import java.util.Arrays;

/*jan 15th 2022

Program 1 : Find second max from given array.
input : {1,11,3,99,66,54,22,44};
output : 66*/

public class SecondMax {

	int findSecondMax(int[] input) {
		int max = 0, secondMax = 0;
		for (int index = 0; index < input.length; index++) {
			if (input[index] > max)
				max = input[index];
			if (max > input[index] && input[index] > secondMax)
				secondMax = input[index];
		}
		return secondMax;
	}

	int secondMaxWithSort(int[] input) {
		Arrays.sort(input);
		//System.out.println("Sorter Array = " + Arrays.toString(input));
		int max = 0, secondMax = 0;
		for (int index = 0; index < input.length; index++) {
			if (input[index] > max) {
				secondMax = max;
				max = input[index];
			}
		}
		return secondMax;
	}

	public static void main(String[] args) {
		SecondMax secondMax = new SecondMax();
		int[] input = { 1, 11, 3, 99, 66, 54, 22, 44 };
		System.out.println("Input Array = "+Arrays.toString(input)+"\n");
		System.out.println("Second Max Number without using Sort method= " + secondMax.findSecondMax(input));
		System.out.println("-------------------------------------------------");
		System.out.println("Second Max Number Using Sort method = " +secondMax.secondMaxWithSort(input));
		//System.out.println("-------------------------------------------------");
	}
}
