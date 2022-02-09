package hevin;

import java.util.Arrays;
import java.util.HashMap;

public class Test5 {

	int getPairs(int[] input) {
		int pairsCount = 0;
		
		HashMap<Integer, Integer> pair = new HashMap<Integer, Integer>();
		
		for(int num : input) {
			if (pair.containsKey(num)) {
				pair.put(num, (pair.get(num))+1);
			} else {
				pair.put(num, 1);
			}
		}
		for (int count : pair.values()) {
			pairsCount += count/2;
		}
		return pairsCount;
	}

	public static void main(String[] args) {
		Test5 test5 = new Test5();
		
		int[] pairs1 = {9, 10, 20, 20, 10, 10, 30, 50, 10, 20};
		int[] pairs2 = {100, 200, 300, 100, 400, 400, 500, 600};
		
		System.out.println("Input - " + Arrays.toString(pairs1));
		System.out.println("Total pairs - " + test5.getPairs(pairs1));
		System.out.println();
		System.out.println("Input - " + Arrays.toString(pairs2));
		System.out.println("Total pairs - " + test5.getPairs(pairs2));
	}
}

