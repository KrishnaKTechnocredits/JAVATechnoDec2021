package kavleen;

import java.util.Arrays;

public class Assignment24_5 {
  
	String capitalFirstLetter(String input) {
		char ch = Character.toUpperCase(input.charAt(0));
		input = ch + input.substring(1);
		return input;
	}
	void capitalFirstLetterOfWord(String input) {
		String[] output = input.split(" ");
		for (int index = 0; index < output.length; index++) {
			output[index] = capitalFirstLetter(output[index]);
		}
		System.out.println(Arrays.toString(output));
	}
	public static void main (String [] args) {
		Assignment24_5 assignment = new Assignment24_5();
		String input = "anvit harsh dipali";
		assignment.capitalFirstLetterOfWord(input);
	}
}
