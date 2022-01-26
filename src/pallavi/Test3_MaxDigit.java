/*Write a program to find max digit from given number.
Input will be as number format only, DO NOT CHANGE NUMBER INTO STRING

Input : 6832774
Output :8*/

package pallavi;

import java.util.Scanner;

public class Test3_MaxDigit {

	int getMaxDigit(int input) {
		int maxDigit = 0;

		if (input < 10) {
			maxDigit = input;
		} else {
			while (input > 10) {
				if (input % 10 > maxDigit) {
					maxDigit = input % 10;
				}
				input = input / 10;
			}
		}
		return maxDigit;
	}

	public static void main(String[] arr) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the number: ");
		int input = sc.nextInt();
		System.out.println("Max digit in given number is:" + new Test3_MaxDigit().getMaxDigit(input));
		sc.close();
	}

}
