package yogeshNimbalkar;

import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.Set;

//Print character frequency from given name.
public class A33_P5_CharacterFrequency {

	void getCharFreq(String name) {
		LinkedHashMap<Character, Integer> charFreqMap = new LinkedHashMap<>();
		for(int index=0; index<name.length(); index++) {
			char ch = name.charAt(index);
			if(charFreqMap.containsKey(ch)) {
				int cnt = charFreqMap.get(ch);
				charFreqMap.put(ch, cnt + 1);
			}else {
				charFreqMap.put(ch,1);
			}
		}
		printHashMap(charFreqMap);
	}
	
	void printHashMap(LinkedHashMap<Character,Integer> charFreqMap) {
		Set<Character> keys = charFreqMap.keySet();
		for(char key : keys)
			System.out.println(key + " -> " + charFreqMap.get(key)); 
	}
	
	public static void main(String[] args) {
		A33_P5_CharacterFrequency program5 = new A33_P5_CharacterFrequency();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter input string :");
		String input = sc.next();
		program5.getCharFreq(input);
		sc.close();
	}
}
