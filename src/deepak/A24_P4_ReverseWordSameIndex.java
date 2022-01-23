/*Assignment 24
	IMPORTANT 
	Program 4. WAP to reverse each word on the same index 
	Input    : "Hi techno hello" 
	Output : "iH onhcet olleh" 
*/

package deepak;

import java.util.Arrays;

public class A24_P4_ReverseWordSameIndex {

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
		A24_P4_ReverseWordSameIndex reverse = new A24_P4_ReverseWordSameIndex();
		String input = "Hi techno hello";
		System.out.print("Reverse word array for the input string '" + input + "' is: ");
		reverse.getReverseArray(input);

	}

}
