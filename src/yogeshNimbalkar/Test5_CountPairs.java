package yogeshNimbalkar;

import java.util.HashMap;
import java.util.Set;

public class Test5_CountPairs {

	int countPair(int[] arr) {
		HashMap<Integer, Integer> listOfPairs = new HashMap<>();
		int count = 0;
		for(int index=0; index<arr.length; index++) {
			int num = arr[index];
			if(listOfPairs.containsKey(num)) {
				int cnt = listOfPairs.get(num);
				listOfPairs.put(num, cnt +1);
			}else {
				listOfPairs.put(num, 1);
			}
		}
		Set<Integer> keys = listOfPairs.keySet();
		for(Integer key : keys)
			count = count + (listOfPairs.get(key) / 2);
		return count;
	}
	
	public static void main(String[] args) {
		int[] input = {9, 10, 20, 20, 10, 10, 30, 50, 10, 20};
		Test5_CountPairs test5 = new Test5_CountPairs();
		System.out.println("Number of Pairs : " + test5.countPair(input));
	}
}
