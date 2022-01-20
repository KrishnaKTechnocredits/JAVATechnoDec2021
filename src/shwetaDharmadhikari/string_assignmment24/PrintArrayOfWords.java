/*Program 3. WAP to retuen array of words containing only digits.
Input    : "Te1c2h C94re31"
Output : "12" "943"
 */
package shwetaDharmadhikari.string_assignmment24;

import java.util.Arrays;

public class PrintArrayOfWords {

	String[] displayWords(String input) {
		String[] str = input.split(" ");

		for (int index = 0; index < str.length; index++) {
			int wordLength = str[index].length();
			String word = str[index];
			String temp = "";
			for (int innerIndex = 0; innerIndex < wordLength; innerIndex++) {
				char ch = word.charAt(innerIndex);
				if (Character.isDigit(ch))
					temp += ch;
			}
			str[index] = temp;
		}
		return str;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "Te1c2h C94re31";
		PrintArrayOfWords printArrayOfWords = new PrintArrayOfWords();
		String arr[] = printArrayOfWords.displayWords(input);
		System.out.println("Output: " + Arrays.toString(arr));
	}

}
