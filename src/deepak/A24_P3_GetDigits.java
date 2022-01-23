/*Assignment24
	Program 3. WAP to return array of words containing only digits. 
	Input    : "Te1c2h C94re3" 
	Output : "12" "943"*/

package deepak;

import java.util.Arrays;

public class A24_P3_GetDigits {

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
		A24_P3_GetDigits getStringsWithDigits = new A24_P3_GetDigits();
		String input = "Te1c2h C94re3";
		System.out.println("Array of words '" + input + "' having only digits is :");
		getStringsWithDigits.getDigits(input);
	}

}
