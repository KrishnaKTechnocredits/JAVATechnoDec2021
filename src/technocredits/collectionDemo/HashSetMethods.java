package technocredits.collectionDemo;

import java.util.HashSet;

public class HashSetMethods {

	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<>();
		
		hs.add("Techno");
		hs.add("Credits");
		
		System.out.println(hs.contains("Credits"));
		
		System.out.println(hs.isEmpty()); // false
		
		System.out.println(hs.size()); // 2
		
		hs.remove("Techno");
		
		System.out.println(hs); // 1
		
		hs.clear();
		
		System.out.println(hs);
		
		System.out.println(hs.isEmpty());
	}
}
