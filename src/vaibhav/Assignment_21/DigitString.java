/* Assignment - 21 : 7th Jan'2022

Create a method which will written the string with all the digits from the given string 
Input : "Tec1hn2o3C9r6e8d1i9ts"
Output : 12396819
 */

package vaibhav.Assignment_21;

public class DigitString {

	String getDigitString(String input) {
		String temp = "";
		char ch = ' ';
		for (int index = 0; index <= input.length() - 1; index++) {
			ch = input.charAt(index);
			if (Character.isDigit(ch)) {
				temp += ch;
			}
		}
		return temp;
	}

	public static void main(String args[]) {
		DigitString digitString = new DigitString();
		String input = "Tec1hn2o3C9r6e8d1i9ts";
		String outputDigitString = digitString.getDigitString(input);
		
		System.out.println("Input String with character and digits 	:" + input); 
		System.out.println("Output String with only digits		:" + outputDigitString);
	}
}
