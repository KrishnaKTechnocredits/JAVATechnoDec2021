package technocredits.collectionDemo;

import java.util.HashMap;

// Find freq of each character [done]
// Find freq of each word [done]
// Find freq of each number 

public class Important_Program3 {
	
	static void printAllCharFreq(int[] arr) {
		HashMap<Integer,Integer> numFreqMap = new HashMap<>();
		
		for(int index=0;index<arr.length;index++) {
			int num = arr[index];
			
			if(numFreqMap.containsKey(num)) {
				int cnt = numFreqMap.get(num);
				numFreqMap.put(num, cnt+1);
			}else {
				numFreqMap.put(num, 1);
			}
		}
		System.out.println(numFreqMap);
	}
	
	public static void main(String[] args) {
		int[] input = {1,11,1,33,44,33,33,2,1,11};
		printAllCharFreq(input);
	}
}
