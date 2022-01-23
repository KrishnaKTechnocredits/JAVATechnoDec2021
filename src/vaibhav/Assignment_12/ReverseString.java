/* Assignment - 12 : 26th Dec'2021 

Write 4 different programs to satisfy below requirements, please take input from user using Scanner class.

5. Write a method to return a reverse string

*/

package vaibhav.Assignment_12;

import java.util.Scanner;

public class ReverseString {

	String getRevString(String input) {
		String temp = "";
		for (int index = input.length() - 1; index >= 0; index--) {
			temp = temp + input.charAt(index);
		}
		return temp;
	}

	public static void main(String[] args) {
		ReverseString reverseString = new ReverseString();
		Scanner scanner = new Scanner(System.in);

		System.out.println("Please enter the input string : ");
		String inputStr = scanner.next();
		System.out.println(
				"Reverse String for the given input string " + inputStr + " is : " + reverseString.getRevString(inputStr));
		scanner.close();
	}
}
