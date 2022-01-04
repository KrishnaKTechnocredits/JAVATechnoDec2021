/*3. find the first non repeating character from given string. [program-3]
   input : technocredits
   output : h
4. find the first repeating character from given string. [program-3]
   input : shivangi
   output : i
5. write a method to return the reverse string. [program-3]
 */
package shwetaDharmadhikari.scanner_demo;

import java.util.Scanner;

public class Assign12_RepeatingChar {

	void firstNonRepeatingChar(String input) {
		for (int index = 0; index < input.length(); index++) {
			if (input.indexOf(input.charAt(index)) == input.lastIndexOf(input.charAt(index))) {
				System.out.println("First Non Repeating Character is :" + input.charAt(index));
				System.out.println(input.charAt(index));
				break;
			}
		}
	}

	void firstRepeatingChar(String input) {
		for (int index = 0; index < input.length(); index++) {
			if (input.indexOf(input.charAt(index)) != input.lastIndexOf(input.charAt(index))) {
				System.out.println("First Repeating Character is :" + input.charAt(index));
				break;
			}
		}
	}

	String reverseString(String input) {
		String reverse = " ";
		for (int index = input.length()-1; index >= 0; index--) {
			reverse = reverse + input.charAt(index);
		}
		return reverse;
	}

	public static void main(String[] args) {
		Assign12_RepeatingChar assign12_RepeatingChar = new Assign12_RepeatingChar();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String str = sc.next();
		assign12_RepeatingChar.firstNonRepeatingChar(str);
		//assign12_RepeatingChar.firstRepeatingChar(str);
		//System.out.println("Reverse string is: " + assign12_RepeatingChar.reverseString(str));
	}

}
