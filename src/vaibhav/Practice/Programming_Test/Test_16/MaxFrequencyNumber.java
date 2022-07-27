/*
program 3 : return the number having max freq.
int[] arr = {6,2,6,6,6,6,3,4,15,3,3,5,5,12,13,17,12};

String getMaxFreqNumber(int[] arr){
	
}

output : 6 freq is 5
 
*/

package vaibhav.Practice.Programming_Test.Test_16;

import java.util.HashMap;
import java.util.Set;

public class MaxFrequencyNumber {

	void getMaxFreqNum(int[] arr) {
		HashMap<Integer, Integer> numberMap = new HashMap<Integer, Integer>();
		int maxNum = 0;
		int maxNumFreq = 0;
		for (int num : arr) {
			if (numberMap.containsKey(num)) {
				numberMap.put(num, numberMap.get(num) + 1);
			} else {
				numberMap.put(num, 1);
			}
		}

		Set<Integer> keySet = numberMap.keySet();

		for (int num : keySet) {
			if (maxNumFreq < numberMap.get(num)) {
				maxNum = num;
				maxNumFreq = numberMap.get(num);
			}
		}
		System.out.println(maxNum + " freq is " + maxNumFreq);
	}

	public static void main(String[] args) {
		MaxFrequencyNumber maxFrequencyNumber = new MaxFrequencyNumber();
		int[] arr = { 6, 2, 6, 6, 6, 6, 3, 4, 15, 3, 3, 5, 5, 12, 13, 17, 12 };
		maxFrequencyNumber.getMaxFreqNum(arr);
	}
}
