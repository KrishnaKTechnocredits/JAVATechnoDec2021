package apurva;
/*Write a method to print of all digits in a given String.
Input : tech1noc9red3its
Output :1 9 3
 */

public class A21_DisplayDigitInString {

	void displayDigit(String input) {
		String temp = "";
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (Character.isDigit(ch))
				temp += ch;
		}
		System.out.println("Digits in given string are: " + temp);
	}

	public static void main(String[] args) {
		String str = "tech1noc9red3its";
		A21_DisplayDigitInString a21_DisplayDigitInString = new A21_DisplayDigitInString();
		System.out.println("Given string is : " + str);
		a21_DisplayDigitInString.displayDigit(str);

	}

}
