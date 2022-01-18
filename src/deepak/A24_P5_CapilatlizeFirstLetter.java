/*Assignment24
	Program 5. WAP to convert first character of word with capital letter 
	Input    : "anvit harsh dipali" 
	Output : "Anvit Harsh Dipali" 
*/
package deepak;

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
		A24_P5_CapilatlizeFirstLetter capitalizeLetter = new A24_P5_CapilatlizeFirstLetter();
		capitalizeLetter.capitalizeFirstLetterOfWords("anvit harsh dipali");

	}

}
