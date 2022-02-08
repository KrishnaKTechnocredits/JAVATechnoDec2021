package pranoti;

import java.util.Arrays;

public class A24_P3_StringFindDigits {
	
	String findDigit(String input) {
		String temp = "";
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (Character.isDigit(ch))
				temp = temp + ch;
		}
		return temp;
	}

	void arrayContainingDigits(String input) {
		String[] word = input.split(" ");
		String[] output = new String[word.length];

		for (int index = 0; index < word.length; index++) {
			output[index] = findDigit(word[index]);
		}
		System.out.println(Arrays.toString(output));
	}
	
	public static void main(String[] args) {
		A24_P3_StringFindDigits a24_P3_StringFindDigits =new A24_P3_StringFindDigits();
		a24_P3_StringFindDigits.arrayContainingDigits("Te1c2h C94re3");
	}
}
