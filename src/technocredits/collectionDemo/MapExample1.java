package technocredits.collectionDemo;

import java.util.HashMap;

// MAP : stores key-value pair
       // map of unique keys, duplicate keys are not allowed

// HashMap : it wont maintain insertion order
// V put(Object key, Object value)
// int size()
// V get(Object key)
// boolean containsKey(Object key)
// Set<K> keySet() 

public class MapExample1 {

	public static void main(String[] args) {
		HashMap<Integer,String> rnoNameMap = new HashMap<>(); 
		String temp = "";
		String temp1 = rnoNameMap.put(1,"Techno");
		rnoNameMap.put(10, "Credits");
		rnoNameMap.put(3, "Megha");
		temp = rnoNameMap.put(1, "Maulik");
		temp = rnoNameMap.put(1, temp);
		rnoNameMap.put(33, "Megha");
		rnoNameMap.put(null, "Shweta");
		rnoNameMap.put(null, "Deepak");
		
		System.out.println(rnoNameMap.size());
		System.out.println(rnoNameMap);
		System.out.println(temp); // "Techno"
		
		String value = rnoNameMap.get(3);
		System.out.println(value); // Megha
		
		System.out.println(rnoNameMap.containsKey(33));
		System.out.println(rnoNameMap.containsValue("Megh"));
		
		String str = "Vrushali";
		System.out.println(str.contains("rus")); // true
		
	}
}
