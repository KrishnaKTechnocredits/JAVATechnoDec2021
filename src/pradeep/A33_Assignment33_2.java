package pradeep;

import java.util.Arrays;
import java.util.HashMap;

public class A33_Assignment33_2 {

	// Program 7: This method finds frequency of each digit in given array
	static void printFreqOfEachDigit(int[] numArray) {
		HashMap<Integer, Integer> intFreqMap = new HashMap<>();
		for (int index = 0; index < numArray.length; index++) {
			int num = numArray[index];
			if (intFreqMap.containsKey(num)) {
				int cnt = intFreqMap.get(num);
				intFreqMap.put(num, cnt + 1);
			} else {
				intFreqMap.put(num, 1);
			}
		}
		System.out.println("Input Array " + Arrays.toString(numArray));
		System.out.println("Frequency of each Digit " + intFreqMap);
	}

	// Program 6 : This method finds frequency of character from each name
	static void printAllCharFreqFromEachWord(String[] arr) {
		for (int index = 0; index < arr.length; index++) {
			String str = arr[index];
			System.out.println("name: " + str);
			printAllCharFreq(str);
		}
	}

	// Program 5: This method finds all char frequency from given string
	static void printAllCharFreq(String input) {
		HashMap<Character, Integer> charFreqMap = new HashMap<>();

		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (charFreqMap.containsKey(ch)) {
				int cnt = charFreqMap.get(ch);
				charFreqMap.put(ch, cnt + 1);
			} else {
				charFreqMap.put(ch, 1);
			}
		}
		System.out.println(charFreqMap);
	}

	public static void main(String[] args) {

		String input = "aakanksha";
		String[] arr = { "raj", "aarya", "aavruti", "shruti", "raj", "aarya" };
		int[] numArray = { 1, 8, 6, 3, 4, 5, 2, 3, 6, 9, 8, 4 };

		System.out.println("\nProgram 5..........................");
		printAllCharFreq(input);
		System.out.println("\nProgram 6..........................");
		printAllCharFreqFromEachWord(arr);
		System.out.println("\nProgram 7..........................");
		printFreqOfEachDigit(numArray);

	}

}
