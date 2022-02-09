package swati.Swati_Assignment33;

import java.util.LinkedHashMap;

public class Assign7 {
	LinkedHashMap<Integer, Integer> findFreq(int[] arr) {
		LinkedHashMap<Integer, Integer> map = new LinkedHashMap<Integer, Integer>();
		for (int i = 0; i < arr.length; i++) {
			int num = arr[i];
			if (map.containsKey(num)) {
				int value = map.get(num);
				map.put(num, value + 1);
			} else {
				map.put(num, 1);
			}
		}
		System.out.println(map);
		return map;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num = { 1, 8, 6, 3, 4, 5, 2, 3, 6, 9, 8, 4 };
		Assign7 a7 = new Assign7();
		a7.findFreq(num);
	}

}
