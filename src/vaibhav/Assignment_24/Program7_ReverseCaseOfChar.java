/* Assignment 24 : 16th Jan 2022

7. WAP to reverse the case of each char in a given word
Input    : "TeCHnoC"

*/

package vaibhav.Assignment_24;

public class Program7_ReverseCaseOfChar {

	void reverseCaseOfEachChar(String str) {
		String outputString = "";
		char ch;
		for (int index = 0; index < str.length(); index++) {
			ch = str.charAt(index);
			if (Character.isUpperCase(ch)) {
				ch = Character.toLowerCase(ch);
			} else if (Character.isLowerCase(ch)) {
				ch = Character.toUpperCase(ch);
			}
			outputString += ch;
		}
		System.out.println("Expected output string 	: " + outputString);
	}

	public static void main(String[] args) {
		Program7_ReverseCaseOfChar program7_ReverseCaseOfChar = new Program7_ReverseCaseOfChar();
		String inputString = "TeCHnoC";
		System.out.println("Input String 		: " + inputString);
		program7_ReverseCaseOfChar.reverseCaseOfEachChar(inputString);
	}
}
