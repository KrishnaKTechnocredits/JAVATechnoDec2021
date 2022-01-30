package priyankaKamble.test_4;

import java.util.Arrays;

/*Write a program to find max digit from given number.
Input will be as number format only, DO NOT CHANGE NUMBER INTO STRING

Input : 6832774
Output :8*/

public class Test3 {

	int findMax(int input) {
		int max = 0;
		int remender = 0;
		while (input > 0) {
			remender = input % 10;
			if (max < remender) {
				max = remender;
			}
			input = input / 10;
		}
		//System.out.println(max);
		return max;
	}

	public static void main(String[] args) {
		Test3 test3 = new Test3();
		int input = 6832774;
		System.out.println("Input Number => " + input);
		System.out.println("Max number from integer =>" +test3.findMax(input));
	}
}
