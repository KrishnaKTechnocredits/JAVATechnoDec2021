package vaibhav.Practice.Collection.HashMap;

import java.util.HashMap;

public class FindWordFrequencyUsingMap2 {

	void printAllWordFrequency(String input) {

		HashMap<String, Integer> wordFrequencyMap = new HashMap<String, Integer>();

		String[] wordArr = input.split(" ");
		for (int index = 0; index < wordArr.length; index++) {
			String currentWord = wordArr[index];

			if (wordFrequencyMap.containsKey(currentWord)) {
				wordFrequencyMap.put(currentWord, wordFrequencyMap.get(currentWord) + 1);
			} else {
				wordFrequencyMap.put(currentWord, 1); 
			}
		}

		System.out.println(wordFrequencyMap);
	}

	public static void main(String[] args) {
		FindWordFrequencyUsingMap2 findWordFrequencyUsingMap = new FindWordFrequencyUsingMap2();
		findWordFrequencyUsingMap.printAllWordFrequency("technocredits techno credits techno we are techno students");
	}
}
