package vaibhav.Practice.Collection.HashMap;

import java.util.HashMap;

public class FindCharFrequencyUsingMap {

	void printAllCharFrequency(String word) {

		HashMap<Character, Integer> charFrequencyMap = new HashMap<Character, Integer>();

		char[] chArr = word.toCharArray();
		for (int index = 0; index < chArr.length; index++) {
			char currentChar = chArr[index];

			if (charFrequencyMap.containsKey(currentChar)) {
				charFrequencyMap.put(currentChar, charFrequencyMap.get(currentChar) + 1);
			} else {
				charFrequencyMap.put(currentChar, 1);
			}
		}

		System.out.println(charFrequencyMap);
	}

	public static void main(String[] args) {
		FindCharFrequencyUsingMap findCharFrequencyUsingMap = new FindCharFrequencyUsingMap();
		findCharFrequencyUsingMap.printAllCharFrequency("technocredits");
	}
}
