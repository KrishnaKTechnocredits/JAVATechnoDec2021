package monikaArkade;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Assignment33_FreqOfDigit {
	static void getDigitFreq(int[] input) {
		HashMap<Integer, Integer> digitFreqMap = new HashMap<Integer, Integer>();
		for (int index = 0; index < input.length; index++) {
			int num = input[index];
			if (digitFreqMap.containsKey(num)) {
				int cnt = digitFreqMap.get(num);
				digitFreqMap.put(num, cnt + 1);
			} else {
				digitFreqMap.put(num, 1);
			}
		}
		printHashMap(digitFreqMap);
	}

	static void printHashMap(HashMap<Integer, Integer> digitFreqMap) {
		Set<Integer> keys = digitFreqMap.keySet();
		for (int key : keys)
			System.out.println(key + "-" + digitFreqMap.get(key));
	}

	public static void main(String[] args) {
		int[] input = { 1, 8, 6, 3, 4, 5, 2, 3, 6, 9, 8, 4 };
		getDigitFreq(input);
	}

}
