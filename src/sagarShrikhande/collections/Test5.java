package sagarShrikhande.collections;

import java.util.HashMap;
import java.util.Map;

public class Test5 {

	int getNumOfPair(int[] input) {
		Map<Integer, Integer> map = new HashMap();
		for (int num : input) {
			if (map.containsKey(num))
				map.put(num, map.get(num) + 1);
			else
				map.put(num, 1);
		}
		int count = 0;
		for (int value : map.values()) {
			count = count + (value / 2);
		}
		System.out.println("Ouput using HashMap: " + map);
		return count;
	}

	public static void main(String[] args) {
		Test5 test5 = new Test5();
		int[] input = { 9, 10, 20, 20, 10, 10, 30, 50, 10, 20 };
		System.out.println("Pair of Sock "+test5.getNumOfPair(input));
		int[] input2 = { 100, 200, 300, 100, 400, 400, 500, 600 };
		System.out.println("Pair of Sock "+test5.getNumOfPair(input2));
	}
}

/*
 * Given an array of integers representing the color of each sock, determine how
 * many pairs of socks with matching colors there are. Return the total number
 * of matching pairs of socks that a person can have
 * 
 * Example:
 * 
 * Input : 9 10 20 20 10 10 30 50 10 20
 * 
 * Output : 3
 * 
 * Input : {100, 200, 300, 100, 400, 400, 500, 600}
 * 
 * Output : 2
 * 
 * Hint : Use HashMap
 */