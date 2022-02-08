package monikaArkade;

import java.util.HashMap;

public class Assignment33_FrequencyOfChar {
	static void printAllCharFrq(String input) {
		HashMap<Character, Integer> charfreqMap = new HashMap<>();
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (charfreqMap.containsKey(ch)) {
				int cnt = charfreqMap.get(ch);
				charfreqMap.put(ch, cnt + 1);
			} else {
				charfreqMap.put(ch, 1);
			}
		}
		System.out.println(charfreqMap);
	}

	public static void main(String[] args) {
		printAllCharFrq("aakanksha");
	}
}
