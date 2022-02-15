package krishna.Assignment_33;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Assignment_33_findFrequencyValue {

	static void freqofCharacter(String name) {
		Map<Character, Integer> Cfreq = new LinkedHashMap<>();
		for (int index = 0; index < name.length(); index++) {                                           
			if (Cfreq.containsKey(name.charAt(index)))
				Cfreq.put(name.charAt(index), Cfreq.get(name.charAt(index)) + 1);
			else
				Cfreq.put(name.charAt(index), 1);
		}
		System.out.println();
		System.out.println(Cfreq);
	}

	static TreeMap<Integer, Integer> freqOfNumber(int arr[]) {
		TreeMap<Integer, Integer> numFreq = new TreeMap<Integer, Integer>();
		for (int i = 0; i < arr.length; i++) {
			if (numFreq.containsKey(arr[i]))
				numFreq.put(arr[i], numFreq.get(arr[i]) + 1);
			else
				numFreq.put(arr[i], 1);
		}
		return numFreq;
	}

	static HashMap<String, Integer> freqOfWord(String[] word) {
		HashMap<String, Integer> wFreq = new HashMap<>();
		for (int i = 0; i < word.length; i++) {
			String str = word[i];
			if (wFreq.containsKey(str))
				wFreq.put(str, wFreq.get(str) + 1);
			else
				wFreq.put(str, 1);
		}
		return wFreq;
	}

	public static void main(String[] args) {
		freqofCharacter("aakanksha");

		String[] str = { "raj", "aarya", "aavruti", "shruti", "raj", "aarya", "aavruti", "shruti", "aavruti", "shruti" };
		HashMap<String, Integer> wordFreq = freqOfWord(str);
		System.out.println();
		System.out.println(wordFreq);
		
		int arr[] = { 1, 8, 6, 3, 4, 5, 2, 3, 6, 9, 8, 4 };
		TreeMap<Integer, Integer> numFreq = freqOfNumber(arr);
		System.out.println();
		System.out.println(numFreq);
	}
}
