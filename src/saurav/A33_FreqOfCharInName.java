package saurav;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.HashMap;

public class A33_FreqOfCharInName {

	void freqOfChar(String word) {
		Map<Character, Integer> collectWords = new LinkedHashMap<>();
		for (int index = 0; index < word.length(); index++) {
			char ch = word.charAt(index);
			if (collectWords.containsKey(ch)) {
				collectWords.put(ch, collectWords.get(ch) + 1);
			} else {
				collectWords.put(word.charAt(index), 1);
			}
		}
		System.out.println("frq of each ch = " + collectWords);

	}

	HashMap<String, Integer> getFreqOfEachWord(String[] input) {
		HashMap<String, Integer> hm = new HashMap<>();
		for (int index = 0; index < input.length; index++) {
			String str = input[index];
			if (hm.containsKey(str)) {
				hm.put(str, hm.get(str) + 1);
			} else {
				hm.put(str, 1);
			}
		}
		System.out.println(hm);

		return hm;
	}

	Map<Integer, Integer> getFreqOfEachNum(int[] arr) {
		Map<Integer, Integer> tree = new TreeMap<Integer, Integer>();
		for (int index = 0; index < arr.length; index++) {
			if (tree.containsKey(arr[index])) {
				tree.put(arr[index], tree.get(arr[index]) + 1);
			} else {
				tree.put(arr[index], 1);
			}
		}
		System.out.println(tree);
		return tree;
	}

	public static void main(String[] args) {
		A33_FreqOfCharInName ass33_Program6 = new A33_FreqOfCharInName();
		ass33_Program6.freqOfChar("aakanksha");
		System.out.println("#############");
		String[] input = { "raj", "aarya", "aavruti", "shruti", "raj", "aarya" };
		ass33_Program6.getFreqOfEachWord(input);
		// HashMap<String,Integer> op = getFreqOfEachWord(input); when method is static
		// System.out.println(op);
		System.out.println("#############");
		int[] arr1 = { 1, 8, 6, 3, 4, 5, 2, 3, 6, 9, 8, 4 };
		ass33_Program6.getFreqOfEachNum(arr1);

	}
}
