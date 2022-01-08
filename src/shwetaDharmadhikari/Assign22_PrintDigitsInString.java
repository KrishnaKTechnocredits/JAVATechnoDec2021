/*Assignment - 21 : 07th Jan'2022
 Print digits in a given string
 String str = "T4ech1cr5edi2ts6"
 */
package shwetaDharmadhikari;

import java.util.*;

public class Assign22_PrintDigitsInString {
	void getDigits(String input) {
		String temp = " ";
		for (int index = 0; index < input.length(); index++) {
			if (Character.isDigit(input.charAt(index))) {
				temp += input.charAt(index);
			}
		}System.out.print("Digits in given string: " + temp);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String str = sc.next();
		Assign22_PrintDigitsInString assign22_PrintDigitsInString = new Assign22_PrintDigitsInString();
		assign22_PrintDigitsInString.getDigits(str);
	}

}
