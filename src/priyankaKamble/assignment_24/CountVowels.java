package priyankaKamble.assignment_24;

import java.util.Arrays;

public class CountVowels {
	String[] input;

	private int findVowels(String input) {
		input = input.toLowerCase();
		int vowelCount = 0;
		for (int index = 0; index < input.length(); index++) {
			if (input.charAt(index) == 'a' || input.charAt(index) == 'e' || input.charAt(index) == 'i'
					|| input.charAt(index) == 'o' || input.charAt(index) == 'u')
				vowelCount++;
		}
		System.out.println("Vowel count of " + input + " = " + vowelCount);
		return vowelCount;
	}

	void countVowels(String input) {
		String[] output = input.split(" ");
		for (int index = 0; index < output.length; index++) {
			findVowels(output[index]);
		}
	}

	public static void main(String[] args) {
		CountVowels countVowels = new CountVowels();
		String input = "Good Going TechnoCredits";
		System.out.println("Input String = > ' " + input + " '\n");
		// countVowels.findVowels(input);
		countVowels.countVowels(input);
	}
}
