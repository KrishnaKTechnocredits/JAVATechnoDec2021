package hevin;

import java.util.Arrays;

public class A24_ReverseWordOnSameIndex {

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

	public static void main(String[] args) {
		A24_ReverseWordOnSameIndex reverse = new A24_ReverseWordOnSameIndex();
		String input = "Hi techno hello";
		System.out.print("Reverse word array for the input string '" + input + "' is: ");
		reverse.getReverseArray(input);

	}

}
