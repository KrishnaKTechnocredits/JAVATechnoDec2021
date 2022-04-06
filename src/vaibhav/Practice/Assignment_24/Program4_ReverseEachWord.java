/* Assignment 24 : 16th Jan 2022

4. WAP to reverse each word on the same index
Input    : "Hi techno hello"
Output : "iH onhcet olleh"

*/

package vaibhav.Practice.Assignment_24;

public class Program4_ReverseEachWord {

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
		for (int index=0;index<inputArr.length;index++) {
			expectedString = expectedString + " " + reverseString(inputArr[index]);
		}
		System.out.println("Expected output String	: "+expectedString.trim());
	}
		
	public static void main(String[] args) {
		Program4_ReverseEachWord program4_ReverseEachWord = new Program4_ReverseEachWord();
		String inputString = "Hi techno hello";
		System.out.println("Input String 		: " + inputString);
		program4_ReverseEachWord.getExpectedString(inputString);
	}
}
