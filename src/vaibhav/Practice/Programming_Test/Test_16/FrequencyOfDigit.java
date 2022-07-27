/*
Test - 16 : 
Program 1 : freq of each digit
int[] arr = {1,2,1,1,3,4,5,3,3,4,5,5,2};
*/

package vaibhav.Practice.Programming_Test.Test_16;

import java.util.HashMap;

public class FrequencyOfDigit {

	void getDigitFreq(int[] arr) {
		HashMap<Integer, Integer> numberMap = new HashMap<Integer, Integer>();
		for (int num : arr) {
			if (numberMap.containsKey(num)) {
				numberMap.put(num, numberMap.get(num) + 1);
			} else {
				numberMap.put(num, 1);
			}
		}
		System.out.println(numberMap);
	}

	public static void main(String[] args) {
		FrequencyOfDigit frequencyOfDigit = new FrequencyOfDigit();
		int[] arr = { 1, 2, 1, 1, 3, 4, 5, 3, 3, 4, 5, 5, 2 };
		frequencyOfDigit.getDigitFreq(arr);
	}
}
