package priyankaKamble.assignment_24;

import java.util.Arrays;

/*5. WAP to convert first character of word with capital letter
Input    : "anvit harsh dipali"
Output : "Anvit Harsh Dipali"
*/
public class ConvertChar {

	String convertString(String input) {
		input = input.toLowerCase();
		char ch = Character.toUpperCase(input.charAt(0));
		String output = ch + "";
		for (int index = 1; index < input.length(); index++) {
			output += input.charAt(index);
		}
		System.out.print(output);
		return output;
	}

	void convertArr(String input) {
		String[] inputArr = input.split(" ");
		for (int index = 0; index < inputArr.length; index++) {
			convertString(inputArr[index]);
			System.out.print(" ");
		}
		// return Arrays.toString(output);
	}

	public static void main(String[] args) {
		ConvertChar convertChar = new ConvertChar();
		String input = "anvit harsh dipali";
		// System.out.println("check = "+ convertChar.convertString(input));
		System.out.println("Input String => "+input);
		System.out.print("Output String => ");
		convertChar.convertArr(input);

	}
}
