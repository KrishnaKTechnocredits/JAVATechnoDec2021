/*
Assignment-33:
Program-7: 
Return the frequency of each numbers from given array.
input: [1,8,6,3,4,5,2,3,6,9,8,4]
*/

package shivangi.Assignment33;

import java.util.LinkedHashMap;

public class P7_FreqOfEachNumberUsingLinkedHashMap {
	
	void printFreqOfEachNumber(int[] numArr) {
		LinkedHashMap<Integer, Integer> numFreMap = new LinkedHashMap<>();
		for(int index=0; index<numArr.length; index++) {
			int num = numArr[index];
			if(numFreMap.containsKey(num)) {
				int count = numFreMap.get(num);
				numFreMap.put(num, count+1);
			}else {
				numFreMap.put(num, 1);
			}
		}
		System.out.println("Frequency of number : " + numFreMap);
	}
	
	public static void main(String[] args) {
		P7_FreqOfEachNumberUsingLinkedHashMap p7 = new P7_FreqOfEachNumberUsingLinkedHashMap();
		int[] numArr = {1, 8, 6, 3, 4, 5, 2, 3, 6, 9, 8, 4, 4}; 
		p7.printFreqOfEachNumber(numArr);
	}
	
}
