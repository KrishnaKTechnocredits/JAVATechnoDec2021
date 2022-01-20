/*IMPORTANT
 * Program 5. WAP to convert first character of word with capital letter
Input    : "anvit harsh dipali"
Output : "Anvit Harsh Dipali"
 */
package shwetaDharmadhikari.string_assignmment24;

import java.util.Arrays;

public class ConvertFirstLetterOfString {

	String[] convertFirstLetter(String input) {
		String[] arr = input.split(" ");
		char ch = ' ';
		for (int index = 0; index < arr.length; index++) {
			String word = arr[index];
			ch = Character.toUpperCase(word.charAt(0));
			word = ch + word.substring(1, word.length());
			arr[index] = word;
		}
		return arr;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "anvit harsh dipali";
		ConvertFirstLetterOfString convertFirstLetterOfString = new ConvertFirstLetterOfString();
		String arr[] = convertFirstLetterOfString.convertFirstLetter(input);
		System.out.println("Output" + Arrays.toString(arr));
	}
}
