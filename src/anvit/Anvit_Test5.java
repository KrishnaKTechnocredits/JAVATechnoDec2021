package anvit;

import java.util.HashMap;
import java.util.Map;

public class Anvit_Test5 {

	int cnt = 0;

	int countPairs(int[] arr) {
		Map<Integer, Integer> hashmap = new HashMap();

		for (int num : arr)
			if (hashmap.containsKey(num))
				hashmap.put(num, hashmap.get(num) + 1);
			else
				hashmap.put(num, 1);

		System.out.println(hashmap);

		for (int value : hashmap.values()) {
			cnt += value / 2;
		}
		return cnt;
	}

	public static void main(String[] args) {
		int[] arr = { 9, 10, 20, 20, 10, 10, 30, 50, 10, 20 };
		System.out.println("Output : " + new Anvit_Test5().countPairs(arr));
		System.out.println();
		int[] arr1 = { 100, 200, 300, 100, 400, 400, 500, 600 };
		System.out.println("Output : " + new Anvit_Test5().countPairs(arr1));
	}
}
