package kavleen;

import java.util.Arrays;

public class Assignment24_6 {

	String reverseString(String input) {
		String revWord = "";
		for (int index = input.length() - 1; index >= 0; index--) {
			revWord = revWord + input.charAt(index);
		}
		return revWord;
	}
	String capitalFirstLetter(String input) {
		char ch = Character.toUpperCase(input.charAt(0));
		input = ch + input.substring(1);
		return input;
	}
	void reverseAndCapitalWord(String input) {
		String[] output = input.split(" ");
		for (int index = 0; index < output.length; index++) {
			output[index] = reverseString(output[index]);
			output[index] = capitalFirstLetter(output[index]);
		}
		System.out.println(Arrays.toString(output));
	}
	public static void main (String [] args) {
		Assignment24_6 assignment = new Assignment24_6();
		String input = "Vrushali Sagar Shital";
		assignment.reverseAndCapitalWord(input);
	}
}
