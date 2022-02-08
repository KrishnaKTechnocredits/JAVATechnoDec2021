package technocredits.collectionDemo;

import java.util.Map;
import java.util.TreeMap;

// Find freq of each character [done]
// Find freq of each word [done]
// Find freq of each number

public class Important_Program2 {
	
	static void printAllCharFreq(String input) {
		String[] words = input.split(" ");
		Map<String, Integer> wordFreqMap = new TreeMap<>();
		
		for(int index=0;index<words.length;index++) {
			String word = words[index];
			if(wordFreqMap.containsKey(word)) {
				int cnt = wordFreqMap.get(word);
				wordFreqMap.put(word, cnt+1);
			}else {
				wordFreqMap.put(word, 1);
			}
		}
		System.out.println(wordFreqMap);
	}
	
	public static void main(String[] args) {
		printAllCharFreq("techno credits techno techno hi hello hi techno");
	}
}
