/* Assignment - 17 : 1st Jan'2022

Program 2: return String having maximum vowels from given array.
Sample input : String[] arr = {"hi","priyanka", "sandip", "aakanksha", "pallavi", "apurva"};
output : aakanksha 

 */

package vaibhav.Assignment_17;

import java.util.Arrays;

public class Program2_MaxVowelString {

	int getVowelCount(String str) {
		int vowelCount = 0;
		char ch;

		for (int index = 0; index < str.length(); index++) {
			ch = str.charAt(index);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				vowelCount++;
			}
		}
		return vowelCount;
	}

	String getMaxVowelCountString(String[] arr) {
		int maxVowelCount = 0;
		int maxVowelCountIndex = 0;

		for (int index = 0; index < arr.length; index++) {
			int vowelCount = getVowelCount(arr[index]);
			if (vowelCount > maxVowelCount) {
				maxVowelCount = vowelCount;
				maxVowelCountIndex = index;
			}
		}
		return arr[maxVowelCountIndex];
	}

	public static void main(String[] args) {
		Program2_MaxVowelString program2_MaxVowelString = new Program2_MaxVowelString();
		String[] inputArr = { "hi", "priyanka", "sandip", "aakanksha", "pallavi", "apurva" };
		String maxVowelCountString = program2_MaxVowelString.getMaxVowelCountString(inputArr);
		System.out.println("Given Input Array 		: " + Arrays.toString(inputArr));
		System.out.println("String with maximum vowel is	: " + maxVowelCountString);
	}
}
