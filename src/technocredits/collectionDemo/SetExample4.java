package technocredits.collectionDemo;

import java.util.HashSet;
import java.util.Iterator;

public class SetExample4 {

	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<>();
		
		hs.add("Techno");
		hs.add("Credits");
		hs.add("Dharam");
		hs.add("yogesh");
		hs.add("gaurav");
		hs.add("deepak");
		
		System.out.println(hs);
		Iterator<String> itr = hs.iterator();
		
		while(itr.hasNext()) {
			String name = itr.next();
			System.out.println(name + "--" + name.toUpperCase()); // 
		}
		
		/*for(String name : hs) {
			if(name.startsWith("g"))
				hs.remove(name);
		}
		System.out.println(hs);*/
	}
}
