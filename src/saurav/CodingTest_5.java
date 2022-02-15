package saurav;

import java.util.HashMap;
import java.util.Map;

public class CodingTest_5 {

	static int getPairOfNum(int[] numArray) {
		int count = 0;
		Map<Integer, Integer> map = new HashMap<>();
		for (int num : numArray) {
			if (map.containsKey(num)) {
				map.put(num, map.get(num) + 1);
			} else {
				map.put(num, 1);
			}
		}
		for (int pairCount : map.values()) {
			count = count + pairCount / 2;
		}
		System.out.println(count);
		return count;
	}

	public static void main(String[] args) {
		int numArray1[] = { 9, 10, 20, 20, 10, 10, 30, 50, 10, 20 };
		int numArray2[] = { 100, 200, 300, 100, 400, 400, 500, 600 };
		System.out.print("pairs in first array = ");
		CodingTest_5.getPairOfNum(numArray1);
		System.out.print("pairs in second array = ");
		CodingTest_5.getPairOfNum(numArray2);
	}
}
