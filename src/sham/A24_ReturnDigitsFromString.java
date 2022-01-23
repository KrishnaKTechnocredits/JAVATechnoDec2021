package sham;

public class A24_ReturnDigitsFromString {

	String findDigitFromString(String name) {
		String temp = "";
		for (int i = 0; i < name.length(); i++) {
			char ch = name.charAt(i);
			if (Character.isDigit(ch)) {
				temp += ch;
			}
		}
		return temp;

	}

	void returnDigitFromStrong(String input) {

		String[] words = input.split(" ");
		String[] output = new String[words.length];
		for (int i = 0; i < words.length; i++) {
			output[i] = findDigitFromString(words[i]);
			System.out.println(i + " : " + output[i]);
		}

	}

	public static void main(String[] args) {
		A24_ReturnDigitsFromString returnDigit = new A24_ReturnDigitsFromString();
		String input = "Te1c2h C94re3";
		returnDigit.returnDigitFromStrong(input);

	}

}
