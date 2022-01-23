/* Assignment - 12 : 26th Dec'2021 

Write 4 different programs to satisfy below requirements, please take input from user using Scanner class.

6. Write a method to return a reverse number

*/

package vaibhav.Assignment_12;

import java.util.Scanner;

public class ReverseNumber {

	int getRevNumber(int inputNum) {
		int sum = 0;
		while (inputNum > 0) {
			sum = sum * 10 + inputNum % 10;
			inputNum = inputNum / 10;
		}
		return sum;
	}

	public static void main(String args[]) {
		ReverseNumber reverseNumber = new ReverseNumber();
		Scanner scanner = new Scanner(System.in);

		System.out.println("Please enter the scanner number : ");
		int input = scanner.nextInt();
		scanner.close();
		
		System.out.println();
		System.out
				.println("Reveres number for the given number " + input + " is : " + reverseNumber.getRevNumber(input));

		
	}

}
