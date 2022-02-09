package pradeep;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class ProgTest5 {

	static int getNumOfMatchPair(int[] socksColor) {
		int count = 0;
		HashMap<Integer, Integer> hmap = new HashMap<>();
		
		for (int index = 0; index < socksColor.length; index++) {
			int key = socksColor[index];
			if (hmap.containsKey(key)) {
				int cnt = hmap.get(key);
				hmap.put(key, cnt + 1);
			} else {
				hmap.put(key, 1);
			}
		}

		// Now we will iterate hashMap
		Set<Integer> keys = hmap.keySet();
		Iterator<Integer> itr = keys.iterator();
		while (itr.hasNext()) {
			Integer key = itr.next();
			count = count + hmap.get(key) / 2;
		}
		return count;
	}

	public static void main(String[] args) {
		int[] input1 = { 9, 10, 20, 20, 10, 10, 30, 50, 10, 20 };
		int[] input2 = { 100, 200, 300, 100, 400, 400, 500, 600 };
		
		System.out.println("Input1 " + Arrays.toString(input1));
		System.out.println("total number of matching pairs of socks " + getNumOfMatchPair(input1));
		
		System.out.println("\nInput2 " + Arrays.toString(input2));
		System.out.println("total number of matching pairs of socks " + getNumOfMatchPair(input2));
	}

}
