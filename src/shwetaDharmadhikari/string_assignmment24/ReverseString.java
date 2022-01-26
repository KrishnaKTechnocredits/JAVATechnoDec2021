/*IMPORTANT
 * Program 6. WAP to reverse each word and convert first letter of each word into capital
Input    : "Vrushali Sagar Shital"
Output : "IlahsurV RagaS LatihS"
 */
package shwetaDharmadhikari.string_assignmment24;

import java.util.Arrays;

public class ReverseString {

	String[] reverseWordAndConvertFirstLetter(String input) {
		String[] str = input.split(" ");
		for (int index = 0; index < str.length; index++) {
			String word = str[index];
			String temp = "";
			int length = str[index].length();
			temp += Character.toUpperCase(word.charAt(length - 1));
			for (int innerIndex = length - 2; innerIndex >= 0; innerIndex--) {
				temp += word.charAt(innerIndex);
			}
			str[index] = temp;
		}
		return str;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "Vrushali Sagar Shital";
		String[] arr = new ReverseString().reverseWordAndConvertFirstLetter(input);
		System.out.println("Output : " + Arrays.toString(arr));

	}
}
