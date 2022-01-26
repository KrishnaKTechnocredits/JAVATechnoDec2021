package kavleen;

import java.util.Arrays;

public class Assignment24_3 {
    
	String getDigitsWord(String word ) {
		String temp = " ";
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
	
	public static void main (String [] args) {
		Assignment24_3 assignment = new Assignment24_3();
		String input = "Te1c2h C94re3";
		System.out.println("Array of words '" + input + "' having only digits is :");
		assignment.getDigits(input);
	}
}
