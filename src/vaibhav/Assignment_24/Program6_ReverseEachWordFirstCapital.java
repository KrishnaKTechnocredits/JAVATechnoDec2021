/* Assignment 24 : 16th Jan 2022

6. WAP to reverse each word and convert first letter of each word into capital
Input    : "Vrushali Sagar Shital"
Output : "IlahsurV RagaS LatihS"

*/

package vaibhav.Assignment_24;

public class Program6_ReverseEachWordFirstCapital {

	String reverseString(String str) {
		String outputString = "";
		char ch;
		for (int index = str.length() - 1; index >= 0; index--) {
			ch = str.charAt(index);
			outputString += ch;
		}
		return outputString;
	}

	void getExpectedString(String str) {
		String[] inputArr = str.split(" ");
		String expectedString = "";
		for (int index = 0; index < inputArr.length; index++) {
			String inputTemp = reverseString(inputArr[index]);
			char captitalChar = Character.toUpperCase(inputTemp.charAt(0));
			String temp = captitalChar + inputTemp.substring(1);
			expectedString = expectedString + " " + temp;
		}
		System.out.println("Expected output string	: " + expectedString.trim());
	}

	public static void main(String[] args) {
		Program6_ReverseEachWordFirstCapital program6_ReverseEachWordFirstCapital = new Program6_ReverseEachWordFirstCapital();
		String inputString = "Vrushali Sagar Shital";
		System.out.println("Input String 		: " + inputString);
		program6_ReverseEachWordFirstCapital.getExpectedString(inputString);
	}
}
