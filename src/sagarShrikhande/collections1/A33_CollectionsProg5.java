package sagarShrikhande.collections1;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class A33_CollectionsProg5 {
	
	void printCharFreqUsingHashMap(String input) {
		Map<Character, Integer> map = new HashMap();
			for(int index=0; index<input.length(); index++) {
			char ch = input.charAt(index);
			if(map.containsKey(ch))
				map.put(ch, map.get(ch)+1);
			else
				map.put(ch, 1);
		}
		System.out.println("Ouput using HashMap: "+map);
	}
	
	void printCharFreqUsingTreeMap(String input) {
		Map<Character, Integer> map = new TreeMap();
			for(int index=0; index<input.length(); index++) {
			char ch = input.charAt(index);
			if(map.containsKey(ch))
				map.put(ch, map.get(ch)+1);
			else
				map.put(ch, 1);
		}
		System.out.println("Ouput using TreeMap: "+map);
	}
	
	public static void main(String[] args) {
		A33_CollectionsProg5 a33_5 = new A33_CollectionsProg5();
		String input = "aakanksha";
		System.out.println("input string is: "+input);
		a33_5.printCharFreqUsingHashMap(input);
		a33_5.printCharFreqUsingTreeMap(input);
	}
}


/*Program 5: 
Find all character frequency from given name.
Input: name - aakanksha
Output : a -> 4
k -> 2
n -> 1
s -> 1
h -> 1


*/