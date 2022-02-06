package archana;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Ass33_Find_Frequency {

	static void findFreqOfCharecterInArray_Prog5(String name) {
		Map<Character, Integer> charFreq = new TreeMap<>();// LinkedHashMap<>()//HashMap<>();
		for (int ch = 0; ch < name.length(); ch++) {
			char c = name.charAt(ch);
			if (charFreq.containsKey(c)) {
				int cnt = charFreq.get(c);
				charFreq.put(c, cnt + 1);

			} else {
				charFreq.put(c, 1);
			}
		}
		System.out.println(charFreq);
	}

	static void findFreqOfWordInArray_Prog6(String[] arr) {
		Map<String, Integer> wordMap = new TreeMap<>();// LinkedHashMap<>()//HashMap<>();

		for (int word = 0; word < arr.length; word++) {
			String wordName = arr[word];
			if (wordMap.containsKey(wordName)) {
				int cnt = wordMap.get(wordName);
				wordMap.put(wordName, cnt + 1);

			} else {
				wordMap.put(wordName, 1);
			}
		}
		System.out.println(wordMap);
	}

	static void findFreqOfNumberInArray_Prog7(int[] arr) {
		Map<Integer, Integer> numMap = new TreeMap<>();
		for (int ind = 0; ind < arr.length; ind++) {
			int number = arr[ind];
			if (numMap.containsKey(number)) {
				int cnt = numMap.get(number);
				numMap.put(number, cnt + 1);
			} else {
				numMap.put(number, 1);
			}
		}
		System.out.println(numMap);
	}

	public static void main(String[] args) {
		findFreqOfCharecterInArray_Prog5("aakanksha");
		System.out.println("---------------------------------------------------------------");
		String[] arr = { "raj", "aarya", "aavruti", "shruti", "raj", "aarya" };
		findFreqOfWordInArray_Prog6(arr);
		System.out.println("---------------------------------------------------------------");
		int[] num = { 1, 8, 6, 3, 4, 5, 2, 3, 6, 9, 8, 4 };
		findFreqOfNumberInArray_Prog7(num);
	}
}
