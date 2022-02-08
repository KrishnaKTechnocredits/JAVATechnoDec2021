package yogeshNimbalkar;

import java.util.HashMap;
import java.util.Set;

//Print word frequency from given string array.
public class A33_P6_WordFrequency {

	void getWordFreq(String[] names) {
		HashMap<String, Integer> wordFreqMap = new HashMap<>();
		for(int index=0; index<names.length; index++) {
			String str = names[index];
			if(wordFreqMap.containsKey(str)) {
				int cnt = wordFreqMap.get(str);
				wordFreqMap.put(str, cnt + 1);
			}else {
				wordFreqMap.put(str, 1);
			}
		}
		printHashMap(wordFreqMap);
	}
	
	void printHashMap(HashMap<String, Integer> wordFreqMap) {
		Set<String> keys = wordFreqMap.keySet();
		for(String key : keys)
			System.out.println(key + " -> " + wordFreqMap.get(key));
	}
	
	public static void main(String[] args) {
		A33_P6_WordFrequency program6 = new A33_P6_WordFrequency();
		String[] input = {"raj", "aarya", "aavruti", "shruti","raj", "aarya"};
		program6.getWordFreq(input);
	}
}
