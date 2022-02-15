package krishna;

import java.util.Arrays;
import java.util.LinkedHashMap;

public class FindPairs_Test5 {
	int getPair(LinkedHashMap<Integer, Integer> found) {
		int pairFound = 0;
		for (int i : found.values())
			pairFound += i / 2;
		return pairFound;
	}
	
	int getCount(int[] color) {
		LinkedHashMap<Integer, Integer> provide = new LinkedHashMap<Integer, Integer>();
		for (int i = 0; i < color.length; i++) {
			int cnt = 1;
			if (provide.containsKey(color[i])) {
				cnt = provide.get(color[i]);
				provide.put(color[i], cnt + 1);
			} else
				provide.put(color[i], cnt);
		}
		return getPair(provide);
	}

	

	public static void main(String[] args) {
		FindPairs_Test5 tst = new FindPairs_Test5();

		int[] color = { 9, 10, 20, 20, 10, 10, 30, 50, 10, 20 };
		System.out.println("  Data1:- " + Arrays.toString(color));
		System.out.println("  Matching Color O/P ===>  " + tst.getCount(color));

		int[] color2 = { 100, 200, 300, 100, 400, 400, 500, 600 };
		System.out.println("--------------------------------------------------------");
		System.out.println("  Data2:- " + Arrays.toString(color2));
		System.out.println("  Matching Color O/P ===>  " + tst.getCount(color2));
	}
}
