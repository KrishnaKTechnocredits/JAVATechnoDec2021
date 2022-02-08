package technocredits.collectionDemo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class IterateMap {

	static void iterateMethodToIterateValues(HashMap<String,String> input) {
		
		for(String value : input.values()) {
			System.out.println(value);
		}
	}
	
	static void iterateMethod1(HashMap<String,String> input) {
		Set<String> keys = input.keySet();
		
		for(String key : keys) {
			if(key.length() > 5)
				System.out.println(key + "-" + input.get(key));
		}
	}
	
	static void iterateMethod2(HashMap<String,String> input) {
		Set<Map.Entry<String, String>> setOfEntry = input.entrySet();
		
		for(Map.Entry<String, String> entry : setOfEntry) {
			System.out.println(entry.getKey() + "--" + entry.getValue());
		}
	}
	
	static void iterateMethod3(HashMap<String,String> input) {
		Set<String> keys = input.keySet();
		Iterator<String> itr = keys.iterator();
		
		while(itr.hasNext()) {
			String key = itr.next();
			System.out.println(key + "--" + input.get(key));
		}
	}
	
	public static void main(String[] args) {
		HashMap<String, String> mapOfNames = new HashMap<String, String>();
		mapOfNames.put("Maulik","Kanani");
		mapOfNames.put("Harsh", "Vegada");
		mapOfNames.put("Pooja", "Rajguru");
		mapOfNames.put("Sandip", "Patil");
		mapOfNames.put("Megha", "Shah");
		
		iterateMethodToIterateValues(mapOfNames);	
	}
}
