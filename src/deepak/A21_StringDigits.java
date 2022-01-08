/*Assignment -21: 7th Jan'2022
Print all the digits from string
Input : TE1ch2noC2red9iTs
output : 1229*/

package deepak;

public class A21_StringDigits {

	void stringOperation(String input) {
		String digits = "";
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (Character.isDigit(ch)) {
				int num = Character.getNumericValue(ch);
				digits = digits + num;
			}
		}
		System.out.println("Digits in the given string are: " + digits);
	}

	public static void main(String[] args) {
		A21_StringDigits stringDetails = new A21_StringDigits();
		stringDetails.stringOperation("TE1ch2noC2red9iTs");
	}
}