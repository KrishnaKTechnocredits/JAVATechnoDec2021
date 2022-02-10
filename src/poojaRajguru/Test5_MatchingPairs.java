package poojaRajguru;

import java.util.HashMap;
import java.util.Map;

public class Test5_MatchingPairs {
	int count = 0;
	int findPair(int[] arr) {
		Map<Integer, Integer> intMap = new HashMap();
		for (int num : arr)
			if (intMap.containsKey(num))
				intMap.put(num, intMap.get(num) + 1);
			else
				intMap.put(num, 1);
		System.out.println(intMap);
		for (int pairCount : intMap.values()) {
			count += pairCount / 2;
		}
		return count;
	}
	public static void main(String[] args) {
		int[] arr = { 9, 10, 20, 20, 10, 10, 30, 50, 10, 20 };
		System.out.println("Pairs are : " + new Test5_MatchingPairs().findPair(arr));
		int[] arr2 = { 100, 200, 300, 100, 400, 400, 500, 600 };
		System.out.println("Pairs are : " + new Test5_MatchingPairs().findPair(arr2));
	}
}