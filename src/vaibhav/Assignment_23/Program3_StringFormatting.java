/* Assignment - 23 : 15th Jan'2022

Program 3 : Return a string by placing all small characters first, followed by digits, capital letters, special characters.

input : te4c&Hno7CreD-8i*ts
output : tecnoreits478HCD&-*

*/

package vaibhav.Assignment_23;

public class Program3_StringFormatting {

	String getFormattedString(String str) {
		char ch;
		String smallCharString = "";
		String digitString = "";
		String capitalCharString = "";
		String specialCharString = "";

		for (int index = 0; index < str.length(); index++) {
			ch = str.charAt(index);

			if (Character.isLetter(ch)) {
				if (Character.isLowerCase(ch)) {
					smallCharString += ch;
				} else {
					capitalCharString += ch;
				}
			} else if (Character.isDigit(ch)) {
				digitString += ch;
			} else {
				specialCharString += ch;
			}
		}
		return smallCharString + digitString + capitalCharString + specialCharString;
	}

	public static void main(String[] args) {
		Program3_StringFormatting program3_StringFormatting = new Program3_StringFormatting();
		String inputStr = "te4c&Hno7CreD-8i*ts";
		String formattedString = program3_StringFormatting.getFormattedString(inputStr);
		System.out.println("Input String			: " + inputStr);
		System.out.println("Expected formatted String 	: "+ formattedString);
	}

}
