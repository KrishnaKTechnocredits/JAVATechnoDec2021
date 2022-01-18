package hevin;

import java.util.Arrays;

public class A24_GetDigitsFromWords {

	String getDigitsWord(String word) {
		String temp = "";
		for (int index = 0; index < word.length(); index++) {
			char ch = word.charAt(index);
			if (Character.isDigit(ch)) {
				temp = temp + ch;
			}
		}
		return temp;
	}

	void getDigits(String input) {
		String[] output = input.split(" ");
		for (int index = 0; index < output.length; index++) {
			output[index] = getDigitsWord(output[index]);
		}
		System.out.println(Arrays.toString(output));
	}

	public static void main(String[] args) {
		A24_GetDigitsFromWords A24_GetDigitsFromWords = new A24_GetDigitsFromWords();
		String input = "Te1c2h C94re3";
		System.out.println("Array of words '" + input + "' having only digits is :");
		A24_GetDigitsFromWords.getDigits(input);
	}

}
