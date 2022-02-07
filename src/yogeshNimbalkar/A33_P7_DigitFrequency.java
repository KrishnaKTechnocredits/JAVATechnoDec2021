package yogeshNimbalkar;

import java.util.HashMap;
import java.util.Set;

//Print digit frequency of given integer array.
public class A33_P7_DigitFrequency {

	void getDigitFreq(int[] arr) {
		HashMap<Integer, Integer> digitFreqMap = new HashMap<>();
		for(int index=0; index<arr.length; index++) {
			int num = arr[index];
			if(digitFreqMap.containsKey(num)) {
				int cnt = digitFreqMap.get(num);
				digitFreqMap.put(num, cnt + 1);
			}else {
				digitFreqMap.put(num, 1);
			}
		}
		printHashMap(digitFreqMap);
	}
	
	void printHashMap(HashMap<Integer, Integer> digitFreqMap) {
		Set<Integer> keys = digitFreqMap.keySet();
		for(int key : keys)
			System.out.println(key + " -> " + digitFreqMap.get(key));
	}
	
	public static void main(String[] args) {
		A33_P7_DigitFrequency program7 = new A33_P7_DigitFrequency();
		int[] input = {1,8,6,3,4,5,2,3,6,9,8,4};
		program7.getDigitFreq(input);
	}
}
