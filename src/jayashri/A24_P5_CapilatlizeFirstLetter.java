package jayashri;

import java.util.Arrays;

public class A24_P5_CapilatlizeFirstLetter {
	String capitalizeFirstLetter(String input) {
		char ch = Character.toUpperCase(input.charAt(0));
		input = ch + input.substring(1);
		return input;
	}

	void capitalizeFirstLetterOfWords(String input) {
		String[] output = input.split(" ");
		for (int index = 0; index < output.length; index++) {
			output[index] = capitalizeFirstLetter(output[index]);
		}
		System.out.println(Arrays.toString(output));
	}

	public static void main(String[] args) {
		A24_P5_CapilatlizeFirstLetter a24_p5 = new A24_P5_CapilatlizeFirstLetter();
		a24_p5.capitalizeFirstLetterOfWords("anvit harsh dipali");

	}
}
