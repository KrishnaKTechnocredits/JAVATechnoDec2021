package kalyani;

import java.util.Arrays;

public class A24_ReverseAndConvertCapital_P6 {
	
	String reverseStr(String input) {
		String name = "";
		for (int index = input.length() - 1; index >= 0; index--) {
			name = name + input.charAt(index);
		}
		return name;
	}

	String convertFirstLetterCapital(String word) {
		char ch = Character.toUpperCase(word.charAt(0));
		word = ch + word.substring(1);
		return word;
	}

	void revAndCapitalWords(String name) {
		String[] output = name.split(" ");
		for (int index = 0; index < output.length; index++) {
			output[index] = reverseStr(output[index]);
			output[index] = convertFirstLetterCapital(output[index]);
		}
		System.out.println(Arrays.toString(output));
	}

	public static void main(String[] args) {
		A24_ReverseAndConvertCapital_P6 assign24 = new A24_ReverseAndConvertCapital_P6();
		assign24.revAndCapitalWords("Kalyani Ragini Abhijeet");

	}

}