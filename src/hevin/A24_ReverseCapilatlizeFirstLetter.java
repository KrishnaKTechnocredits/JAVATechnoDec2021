package hevin;

import java.util.Arrays;

public class A24_ReverseCapilatlizeFirstLetter {

	String reverseString(String input) {
		String revWord = "";
		for (int index = input.length() - 1; index >= 0; index--) {
			revWord = revWord + input.charAt(index);
		}
		return revWord;
	}

	String capitalizeFirstLetter(String input) {
		char ch = Character.toUpperCase(input.charAt(0));
		input = ch + input.substring(1);
		return input;
	}

	void reverseAndCapitalizeWords(String input) {
		String[] output = input.split(" ");
		for (int index = 0; index < output.length; index++) {
			output[index] = reverseString(output[index]);
			output[index] = capitalizeFirstLetter(output[index]);
		}
		System.out.println(Arrays.toString(output));
	}

	public static void main(String[] args) {
		A24_ReverseCapilatlizeFirstLetter reverseCapitalize = new A24_ReverseCapilatlizeFirstLetter();
		reverseCapitalize.reverseAndCapitalizeWords("Vrushali Sagar Shital");

	}

}
