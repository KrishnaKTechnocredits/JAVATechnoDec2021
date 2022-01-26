package priyankaKamble.assignment_24;

import java.util.Arrays;

/*IMPORTANT
4. WAP to reverse each word on the same index
Input    : "Hi techno hello"
Output : "iH onhcet olleh"
*/
public class ReverseWord {

	String reverseString(String input) {
		String outputReverString = "";
		for (int index = input.length() - 1; index >= 0; index--) {
			outputReverString += input.charAt(index);
		}
		return outputReverString;
	}

	void reversewordArr(String input) {
		String[] outputArr = input.split(" ");
		for (int index = 0; index < outputArr.length; index++) {
			outputArr[index] = reverseString(outputArr[index]);
		}
		System.out.println(Arrays.toString(outputArr));
	}

	public static void main(String[] args) {
		ReverseWord reverseWord = new ReverseWord();
		String input = "Hi techno hello";
		System.out.println("Input String = " + input);
		System.out.print("Output String = ");
		reverseWord.reversewordArr(input);
	}
}
