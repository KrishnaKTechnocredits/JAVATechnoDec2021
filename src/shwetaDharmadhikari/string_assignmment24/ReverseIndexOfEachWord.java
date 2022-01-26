/*IMPORTANT
Program 4. WAP to reverse each word on the same index
Input    : "Hi techno hello"
Output : "iH onhcet olleh"
 */
package shwetaDharmadhikari.string_assignmment24;

import java.util.Arrays;

public class ReverseIndexOfEachWord {

	String[] reverseStringCharactersAtSameIndex(String input) {
		String[] arr = input.split(" ");
		for (int index = 0; index < arr.length; index++) {
			int wordLength = arr[index].length();
			String word = arr[index];
			String str = "";
			for (int innerIndex = wordLength-1; innerIndex >= 0; innerIndex--) {
				str += word.charAt(innerIndex);
			}
			arr[index] = str;
		}
		return arr;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "Hi techno hello";
		ReverseIndexOfEachWord reverseIndexOfEachWord = new ReverseIndexOfEachWord();
		String[] str= reverseIndexOfEachWord.reverseStringCharactersAtSameIndex(input);
		System.out.println("Output: "+Arrays.toString(str));
	}

}
