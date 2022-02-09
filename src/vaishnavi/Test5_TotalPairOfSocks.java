package vaishnavi;

import java.util.HashMap;

public class Test5_TotalPairOfSocks {

	int findTotalPairsOfSocks(int[] arr) {
		HashMap<Integer, Integer> map = new HashMap();
		for(int index = 0; index<arr.length;index++) {
			int num = arr[index];
			if(map.containsKey(num)) {
				int cnt = map.get(num);
				map.put(num, cnt+1);
			}
			else
				map.put(num, 1);
		}
		int count = 0;
		for (int value : map.values()) {
			count = count + (value /2);
		}
		System.out.println("Output is " + map);
		return count;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test5_TotalPairOfSocks test5_TotalPairOfSocks = new Test5_TotalPairOfSocks();
		int[] inputArray1 = {9, 10, 20, 20, 10, 10, 30, 50, 10, 20};
		System.out.println("Total pair of socks is " + test5_TotalPairOfSocks.findTotalPairsOfSocks(inputArray1));
		
		System.out.println();
		
		int[] inputArray2 = {100, 200, 300, 100, 400, 400, 500, 600};
		System.out.println("Total pair of socks is " + test5_TotalPairOfSocks.findTotalPairsOfSocks(inputArray2));
		
	}

}
