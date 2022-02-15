package megha;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Megha_Test5 {

	int cnt = 0;

	int countPairs(int[] arr) {
		Map<Integer, Integer> hmap = new HashMap();
		
		for (int num : arr)
			if (hmap.containsKey(num))
				hmap.put(num, hmap.get(num) + 1);
			else
				hmap.put(num, 1);

		System.out.println(hmap);

		for (int value : hmap.values()) {
			cnt += value / 2;
		}
		return cnt;
	}

	public static void main(String[] args) {
		int[] arr = { 9, 10, 20, 20, 10, 10, 30, 50, 10, 20 };
		System.out.println("Output1 : " + new Megha_Test5().countPairs(arr));
		System.out.println();
		int[] arr1 = { 100, 200, 300, 100, 400, 400, 500, 600 };
		System.out.println("Output2 : " + new Megha_Test5().countPairs(arr1));
	}
}
