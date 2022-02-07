package sagarShrikhande.collections1;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class A33_Collections_Prog6 {

	void printStringFreqUsingHashMap(String[] input) {
		Map<String, Integer> map = new HashMap();
			for(int index=0; index<input.length; index++) {
			String str = input[index];
			if(map.containsKey(str))
				map.put(str, map.get(str)+1);
			else
				map.put(str, 1);
		}
		System.out.println("Ouput using HashMap: "+map);
	}
	
	void printStringFreqUsingTreeMap(String[] input) {
		Map<String, Integer> map = new TreeMap();
			for(String str: input) {
			if(map.containsKey(str))
				map.put(str, map.get(str)+1);
			else
				map.put(str, 1);
		}
		System.out.println("Ouput using TreeMap: "+map);
	}
	
	public static void main(String[] args) {
		A33_Collections_Prog6 a33_6 = new A33_Collections_Prog6();
		String[] input = {"raj", "aarya", "aavruti", "shruti","raj", "aarya"};
		a33_6.printStringFreqUsingHashMap(input);
		a33_6.printStringFreqUsingTreeMap(input);
	}
}

/*Program 6: 
Find all character frequency from each name given in String array.
Input : Array -> {"raj", "aarya", "aavruti", "shruti","raj", "aarya"}

*/
