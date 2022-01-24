package priyankaKamble.assignment_24;

import java.util.Arrays;

/*3. WAP to return array of words containing only digits.
Input    : "Te1c2h C94re3"
Output : "12" "943"
*/
public class ExtractDigits {

	private void findDigit(String input) {
		String temp = "";
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (Character.isDigit(ch)) {
				temp += ch;
			}
		}
		System.out.println("Extracted Digits From '" + input + "' =>  " + temp);
	}

	String findArrDigit(String input) {
		String[] inputArr = input.split(" ");
		for (int index = 0; index < inputArr.length; index++) {
			findDigit(inputArr[index]);
		}
		return Arrays.toString(inputArr);
	}

	public static void main(String[] args) {
		ExtractDigits extractDigits = new ExtractDigits();
		String input = "Te1c2h C94re3";
		System.out.println("Input String -> '" + input + "'\n");
		// extractDigits.findDigit(input);
		extractDigits.findArrDigit(input);
	}
}
