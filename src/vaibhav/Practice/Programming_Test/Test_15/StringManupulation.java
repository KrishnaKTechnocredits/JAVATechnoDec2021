/*Test - 15 : 28th May'2021

Return first repeating and non repeating word from given input.

String str = "Hi Maulik Techno Maulik Credits Techno Maulik Hello Hi";
output : Hi Credits
*/

package vaibhav.Practice.Programming_Test.Test_15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringManupulation {

	String firstRepeatingAndNonRepeatingWord(String str) {
		String firstRepeatingWord = "";
		String firstNonRepeatingWord = "";
		String[] strArr = str.trim().split(" ");

		List<String> list = Arrays.asList(strArr);
		ArrayList<String> strList = new ArrayList<String>(list);

		for (String word : strList) {
			if (strList.indexOf(word) != strList.lastIndexOf(word)) {
				firstRepeatingWord = word;
				break;
			}
		}

		for (String word : strList) {
			if (strList.indexOf(word) == strList.lastIndexOf(word)) {
				firstNonRepeatingWord = word;
				break;
			}
		}

		return firstRepeatingWord + " " + firstNonRepeatingWord;
	}

	String practiceProgram(String input) {
		// String str = "Hi Maulik Techno Maulik Credits Techno Maulik Hello Hi";

		String firstRepeatingWord = "";
		String firstNonRepeatingWord = "";

		String[] wordArr = input.split(" ");

		for (int index = 0; index < wordArr.length; index++) {
			int count = 0;
			for (String word : wordArr) {
				if (wordArr[index].equals(word)) {
					count++;
				}
			}
			if (count > 1) {
				firstRepeatingWord = wordArr[index];
				break;
			}

		}

		for (int index = 0; index < wordArr.length; index++) {
			int count = 0;
			for (String word : wordArr) {
				if (wordArr[index].equals(word)) {
					count++;
				}
			}

			if (count == 1) {
				firstNonRepeatingWord = wordArr[index];
				break;
			}
		}

		return firstRepeatingWord + " " + firstNonRepeatingWord;
	}

	public static void main(String[] args) {
		String str = "Hi Maulik Techno Maulik Credits Techno Maulik Hello Hi";

		StringManupulation stringManupulation = new StringManupulation();

		String expectedOutputString = stringManupulation.firstRepeatingAndNonRepeatingWord(str);
		//String expectedOutputString = stringManupulation.practiceProgram(str);
		System.out.println("Input String		: " + str);
		System.out.println("Expected Output		: " + expectedOutputString);

	}

}
