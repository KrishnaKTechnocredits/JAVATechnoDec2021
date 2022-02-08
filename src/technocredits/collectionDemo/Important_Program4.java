package technocredits.collectionDemo;

import java.util.HashMap;

// Find freq of each character [done]
// Find freq of each word [done]
// Find freq of each number 

public class Important_Program4 {
	
	static void printAllCharFreq(int[] arr) {
		HashMap<Integer,Integer> numFreqMap = new HashMap<>();
		
		for(int num : arr) {
			if(numFreqMap.containsKey(num)) 
				numFreqMap.put(num, numFreqMap.get(num)+1);
			else 
				numFreqMap.put(num, 1);
		}
		System.out.println(numFreqMap);
	}
	
	public static void main(String[] args) {
		int[] input = {1,11,1,33,44,33,33,2,1,11};
		printAllCharFreq(input);
	}
}
