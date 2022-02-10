package yogeshNimbalkar;

import java.util.LinkedHashMap;
import java.util.Set;

//return the first non repeating Capital character.
public class Test6_Program1 {

	char getFirstNonRepCapLetter(String str) {
		LinkedHashMap<Character, Integer> letterFreqMap = new LinkedHashMap<>();
		char[] letters = str.toCharArray();
		char result=' ';
		for(int index=0; index<letters.length; index++) {
			char ch = letters[index];
			if(letterFreqMap.containsKey(ch)) {
				int cnt = letterFreqMap.get(ch);
				letterFreqMap.put(ch, cnt +1);
			}else {
				letterFreqMap.put(ch, 1);
			}
		}
		Set<Character> keys = letterFreqMap.keySet();
		for(char key : keys) {
			if(Character.isUpperCase(key) && letterFreqMap.get(key)==1) {
				result = key;
				break;
			}
		}
//		System.out.println(letterFreqMap);
//		System.out.println(result);
		return result;
	}
	
	public static void main(String[] args) {
		String input = "tEChNoCrEdits";
		Test6_Program1 program1 = new Test6_Program1();
		System.out.println("First non repeating capital letter is : " + program1.getFirstNonRepCapLetter(input));
	}
}
