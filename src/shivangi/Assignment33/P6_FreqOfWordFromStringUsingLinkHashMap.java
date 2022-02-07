/*
Assignment-33:
Program-6: 
Find all character frequency from each name given in String array.
Input : Array -> {"raj", "aarya", "aavruti", "shruti","raj", "aarya"}*/

package shivangi.Assignment33;

import java.util.Arrays;
import java.util.LinkedHashMap;

public class P6_FreqOfWordFromStringUsingLinkHashMap {
	
	void printFreqOfWord(String input) {
		System.out.println("Given string : " + input);
		String[] wordsArr = input.split(" ");
		System.out.println("Given input after split : " + Arrays.toString(wordsArr));
		LinkedHashMap<String, Integer> wordFreqMap = new LinkedHashMap<>();
		for(int index=0; index<wordsArr.length; index++) {
			String word = wordsArr[index];
			if(wordFreqMap.containsKey(word)) {
				int count = wordFreqMap.get(word);
				wordFreqMap.put(word, count+1);
			}else {
				wordFreqMap.put(word, 1);
			}
		}
		System.out.println("Frequency of each word : " + wordFreqMap);
	}
	
	public static void main(String[] args) {
		P6_FreqOfWordFromStringUsingLinkHashMap p6 = new P6_FreqOfWordFromStringUsingLinkHashMap();
		p6.printFreqOfWord("raj aarya aavruti shruti raj aarya");	
	}
}
