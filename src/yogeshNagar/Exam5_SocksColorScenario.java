package yogeshNagar;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/*Given an array of integers representing the color of each sock, determine how many pairs of socks with matching colors there are. Return the total number of matching pairs of socks that a person can have

Example:

Input :  9 10 20 20 10 10 30 50 10 20

Output : 3

Input : 100 200 300 100 400 400 500 600

Output : 2

Hint : Use HashMap*/
public class Exam5_SocksColorScenario {
	void getPairSocks(int[] arr) {
		HashMap<Integer,Integer> hashMap = new HashMap<Integer,Integer>();
		for(int num:arr) {
			if(hashMap.containsKey(num)) {
				hashMap.put(num, hashMap.get(num)+1);
			}else
				hashMap.put(num, 1);
		}
		Set<Integer> arrKey = hashMap.keySet();
		Iterator<Integer> itr = arrKey.iterator();
		int count=0;
		while(itr.hasNext()) {
			Integer mapKey = itr.next();
			count+=hashMap.get(mapKey)/2;
		}
		System.out.println("Pair count is "+count);
	}
	
	public static void main(String[] args) {
		Exam5_SocksColorScenario socksColo = new Exam5_SocksColorScenario();
		int[] arr= {9,10, 20, 20, 10, 10, 30, 50, 10, 20};
		socksColo.getPairSocks(arr);
		int[] arr1 = {100, 200, 300, 100, 400, 400, 500, 600};
		socksColo.getPairSocks(arr1);
	}

}
