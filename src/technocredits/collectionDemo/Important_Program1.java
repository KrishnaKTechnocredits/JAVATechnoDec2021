package technocredits.collectionDemo;

import java.util.Map;
import java.util.TreeMap;

// Find freq of each character [done]
// Find freq of each word
// Find freq of each number

public class Important_Program1 {
	
	static void printAllCharFreq(String input) {
		Map<Character, Integer> charFreqMap = new TreeMap<>();
		
		for(int index=0;index<input.length();index++) {
			char ch = input.charAt(index);
			if(charFreqMap.containsKey(ch)) {
				int cnt = charFreqMap.get(ch);
				charFreqMap.put(ch, cnt+1);
			}else {
				charFreqMap.put(ch, 1);
			}
		}
		System.out.println(charFreqMap);
	}
	
	public static void main(String[] args) {
		printAllCharFreq("technocredits");
	}
}
