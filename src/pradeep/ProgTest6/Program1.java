// Write a method to return the first non repeating Capital character.
package pradeep.ProgTest6;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Program1 {

	static char getFirstNonRepCapitalChar(String input) {
		HashMap<Character, Integer> hMap = new HashMap<>();
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (hMap.containsKey(ch)) {
				int cnt = hMap.get(ch);
				hMap.put(ch, cnt + 1);
			} else {
				hMap.put(ch, 1);
			}
		}

		// Now we will iterate hMap
		Set<Character> keys = hMap.keySet();
		Iterator<Character> itr = keys.iterator();
		while (itr.hasNext()) {
			Character key = itr.next();
			if (Character.isUpperCase(key)) {
				if (hMap.get(key) == 1) {
					return key;
				}
			}
		}
		return ' ';

	}

	public static void main(String[] args) {
		String input = "tEChNoCrEdits";
		Character ch = getFirstNonRepCapitalChar(input);
		System.out.println("First Non Repeating Capital Char is: " + ch);
	}
}
