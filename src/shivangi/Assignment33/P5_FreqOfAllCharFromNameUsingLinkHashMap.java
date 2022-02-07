/*
Assignment-33
Program-5: 
Find all character frequency from given name using LinkedHashMap (it maintains insertion order).
Input: name - aakanksha
Output : a -> 4
k -> 2
n -> 1
s -> 1
h -> 1
*/
package shivangi.Assignment33;

import java.util.LinkedHashMap;

public class P5_FreqOfAllCharFromNameUsingLinkHashMap {
	
	void printAllCharFreq(String name) {
		System.out.println("Given String is : " + name);
		LinkedHashMap<Character, Integer> charFreqMap = new LinkedHashMap<>();
		for(int index=0; index<name.length(); index++) {
			char ch = name.charAt(index);
			if(charFreqMap.containsKey(ch)) {
				int count = charFreqMap.get(ch);
				charFreqMap.put(ch, count+1);
			}else {
				charFreqMap.put(ch, 1);
			}
		}
		System.out.println(charFreqMap);
	}
	
	public static void main(String[] args) {
		P5_FreqOfAllCharFromNameUsingLinkHashMap p5 = new P5_FreqOfAllCharFromNameUsingLinkHashMap();
		p5.printAllCharFreq("aakanksha");
	}
}
