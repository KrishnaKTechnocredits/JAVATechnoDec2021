/*
Test-16
program 2 : find freq of only numbers div by 3
int[] arr = {6,2,6,6,3,4,15,3,3,5,5,12,13,17,12};
*/

package vaibhav.Practice.Programming_Test.Test_16;

import java.util.HashMap;

public class FrequencyOfDigitDivByThree {

	void getFreqOfNumDivByThree(int[] arr) {
		HashMap<Integer, Integer> numberMap = new HashMap<Integer, Integer>();
		for (int num : arr) {
			if (num % 3 == 0) {
				if (numberMap.containsKey(num)) {
					numberMap.put(num, numberMap.get(num) + 1);
				} else {
					numberMap.put(num, 1);
				}
			}
		}
		System.out.println(numberMap);
	}

	public static void main(String[] args) {
		FrequencyOfDigitDivByThree frequencyOfDigitDivByThree = new FrequencyOfDigitDivByThree();
		int[] arr = { 6, 2, 6, 6, 3, 4, 15, 3, 3, 5, 5, 12, 13, 17, 12 };
		frequencyOfDigitDivByThree.getFreqOfNumDivByThree(arr);
	}

}
