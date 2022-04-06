/* Assignment 24 : 16th Jan 2022

3. WAP to return array of words containing only digits.
Input    : "Te1c2h C94re3"
Output : "12" "943"

*/

package vaibhav.Practice.Assignment_24;

import java.util.Arrays;

public class Program3_DigitArray {

	String[] getDigitArray(String str) {
		String[] stringArray = str.split(" ");
		String[] digitArray = new String[stringArray.length];
		for (int index = 0; index < stringArray.length; index++) {
			digitArray[index] = getDigitString(stringArray[index]);
		}
		return digitArray;
	}

	String getDigitString(String str) {
		String digitString = "";
		char ch;
		for (int index = 0; index < str.length(); index++) {
			ch = str.charAt(index);
			if (Character.isDigit(ch)) {
				digitString += ch;
			}
		}
		return digitString;
	}

	public static void main(String[] args) {
		Program3_DigitArray digitArray = new Program3_DigitArray();
		String inputString = "Te1c2h C94re3";
		String[] outputArray = digitArray.getDigitArray(inputString);
		System.out.println("Input String : " + inputString);
		System.out.println("Expected output of digit array is : " + Arrays.toString(outputArray));
	}

}
