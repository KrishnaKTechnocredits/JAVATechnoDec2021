package monikaArkade;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Assignment33_FreqOfWord {
	void printFreqOfWord(String[] input) {
		Map<String, Integer> wordFreqMap = new TreeMap<String, Integer>();
		for (int index = 0; index < input.length; index++) {
			String word = input[index];
			// String ch = word[index];
			if (wordFreqMap.containsKey(word)) {
				int cnt = wordFreqMap.get(word);
				wordFreqMap.put(word, cnt + 1);
			} else {
				wordFreqMap.put(word, 1);
			}
		}
		printTreeMap(wordFreqMap);
	}

	void printTreeMap(Map<String, Integer> wordFreqMap) {
		Set<String> keys = wordFreqMap.keySet();
		for (String key : keys)
			System.out.println(key + "-" + wordFreqMap.get(key));
	}

	public static void main(String[] args) {
		Assignment33_FreqOfWord freqword = new Assignment33_FreqOfWord();
		String[] input = { "raj", "aarya", "aavruti", "shruti", "raj", "aarya" };
		freqword.printFreqOfWord(input);
	}
}
