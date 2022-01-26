/* Assignment - 23 : 15th Jan'2022

Program 6 : Return a string by placing all odd numbers , first capital letters from given string, even numbers.
input : eTe17CH96cred498it67s
output : 19T46

*/

package vaibhav.Assignment_23;

public class Program6_StringFormatting {
	
	
	
	// This logic is working for both single digit number and as well as for double digit 

	String getFormattedString(String str) {
		int capLetterCount = 0;
		String firstCapLetter = "";
		String evenNumString = "";
		String oddNumString = "";
		String tempString = "0";
		int tempNum = 0;
		char ch;
		for (int index = 0; index < str.length(); index++) {
			ch = str.charAt(index);

			// for first capital letter
			if (Character.isLetter(ch)) {
				if (Character.isUpperCase(ch) && capLetterCount == 0) {
					firstCapLetter += ch;
					capLetterCount++;
				}
			}

			// for even odd digit collection
			if (Character.isDigit(ch)) {
				tempString += ch;
			} else {
				tempNum = Integer.parseInt(tempString);
				if (tempNum % 2 == 0) {
					evenNumString += tempString.substring(1);
				} else {
					oddNumString += tempString.substring(1);
				}
				tempString = "0";
			}
		}
		// if digit at the end of the string
		if (!tempString.equals("")) {
			tempNum = Integer.parseInt(tempString);
			if (tempNum % 2 == 0) {
				evenNumString += tempString.substring(1);
			} else {
				oddNumString += tempString.substring(1);
			}
			tempString = "0";
		}

		return oddNumString + firstCapLetter + evenNumString;

	}

	public static void main(String[] args) {
		Program6_StringFormatting program6_StringFormatting = new Program6_StringFormatting();
		String inputStr1 = "eTe1CH9cred4it6s";
		String inputStr2 = "eTe17CH96cred498it67s";
		String formattedString1 = program6_StringFormatting.getFormattedString(inputStr1);
		String formattedString2 = program6_StringFormatting.getFormattedString(inputStr2);

		System.out.println("Input String		: " + inputStr1);
		System.out.println("Formatted String int the sequence of Odd Numbers, Fisrt Capital Letter & Even numbers is : "
				+ formattedString1);
		System.out.println("\n");
		System.out.println("Input String		: " + inputStr2);
		System.out.println("Formatted String int the sequence of Odd Numbers, Fisrt Capital Letter & Even numbers is : "
				+ formattedString2);
		
	}
}
