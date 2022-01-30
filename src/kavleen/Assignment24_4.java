package kavleen;

import java.util.Arrays;

public class Assignment24_4 {
	
	String getReverseWord(String input) {
		String output = "";
		for (int index = input.length() - 1; index >= 0; index--) {
			output += input.charAt(index);
		}
		return output;
	}

	
	void getReverseArray(String input) {
		String[] output = input.split(" ");
		for (int index = 0; index < output.length; index++) {
			output[index] = getReverseWord(output[index]);
		}
		System.out.println(Arrays.toString(output));
	}
	public static void main (String [] args) {
		Assignment24_4 assignment = new Assignment24_4();
		String input = "Hi techno hello";
		assignment.getReverseArray(input);
	}
}
