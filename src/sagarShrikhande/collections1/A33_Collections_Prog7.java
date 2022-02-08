package sagarShrikhande.collections1;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class A33_Collections_Prog7 {
	
	void printNumFreqUsingHashMap(int[] input) {
		Map<Integer, Integer> map = new HashMap();
			for(int num: input) {
			if(map.containsKey(num))
				map.put(num, map.get(num)+1);
			else
				map.put(num, 1);
		}
		System.out.println("Ouput using HashMap: "+map);
	}
	
	void printNumFreqUsingTreeMap(int[] input) {
		Map<Integer, Integer> map = new TreeMap();
			for(int num: input) {
			if(map.containsKey(num))
				map.put(num, map.get(num)+1);
			else
				map.put(num, 1);
		}
		System.out.println("Ouput using TreeMap: "+map);
	}
	
	public static void main(String[] args) {
		A33_Collections_Prog7 a33_7 = new A33_Collections_Prog7();
		int[] input = {1,8,6,3,4,5,2,3,6,9,8,4};
		a33_7.printNumFreqUsingHashMap(input);
	}

}


/*

Program 7: 
Return the frequency of each numbers from given array.
input: [1,8,6,3,4,5,2,3,6,9,8,4]
*/