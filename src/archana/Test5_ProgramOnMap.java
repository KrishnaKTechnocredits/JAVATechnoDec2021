package archana;

import java.util.HashMap;
import java.util.Map;

public class Test5_ProgramOnMap {
	int cnt = 0;

	int keyPair(int[] arr) {
		HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();

		for (int num : arr) {
			if (hashMap.containsKey(num)) {
				// System.out.println(hashMap.containsKey(num));
				hashMap.put(num, hashMap.get(num) + 1);
			} else {
				hashMap.put(num, 1);
			}

		}
		System.out.println(hashMap);
		cnt = 0;
		for (int value : hashMap.values()) {
			cnt = cnt + value / 2;
		}
		return cnt;
	}

	public static void main(String[] args) {
		Test5_ProgramOnMap test5 = new Test5_ProgramOnMap();
		int[] arr = { 9, 10, 20, 20, 10, 10, 30, 50, 10, 20 };
		System.out.println("Pair : " + test5.keyPair(arr));
		System.out.println();
		int[] arr1 = { 100, 200, 300, 100, 400, 400, 500, 600 };
		System.out.println("Pair : " + test5.keyPair(arr1));
	}

}
