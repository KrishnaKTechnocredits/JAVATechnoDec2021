package swati;

import java.util.HashMap;
import java.util.Map;

public class Test5 {

	HashMap<Integer, Integer> totalSock(int[] num) {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < num.length; i++) {
			int key = num[i];
			if (map.containsKey(key)) {
				int value = map.get(key);
				map.put(key, value + 1);
			} else {
				map.put(num[i], 1);
			}
		}
		System.out.println(map);
		return map;
	}

	void findTotalPair(HashMap<Integer, Integer> map) {
		int count = 0;
		for (Map.Entry<Integer, Integer> set : map.entrySet()) {
			// System.out.println(set.getKey() + " and " +set.getValue());
			int value = set.getValue() / 2;
			if (value > 0) {
				count = count + value;
			}
		}
		System.out.println("Total no of pairs " + count);
	}

	public static void main(String[] args) {
		Test5 t5 = new Test5();
		// Input 1
		int[] arr = { 9, 10, 20, 20, 10, 10, 30, 50, 10, 20 };
		HashMap<Integer, Integer> map = t5.totalSock(arr);
		t5.findTotalPair(map);
		// input 2
		int[] arr1 = { 100, 200, 300, 100, 400, 400, 500, 600 };
		HashMap<Integer, Integer> map1 = t5.totalSock(arr1);
		t5.findTotalPair(map1);

	}

}
