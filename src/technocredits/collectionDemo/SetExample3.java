package technocredits.collectionDemo;

import java.util.HashSet;
import java.util.Iterator;

public class SetExample3 {

	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<>();
		
		hs.add("Techno");
		hs.add("Credits");
		hs.add("Dharam");
		hs.add("yogesh");
		hs.add("gaurav");
		
		System.out.println(hs);
		Iterator<String> itr = hs.iterator();
		
		if(itr.hasNext())
			System.out.println(itr.next());
		
		
		while(itr.hasNext()) {
			//Object obj = itr.next();
			//String name = (String)obj;
			System.out.println(itr.next()); // 
		}
		
		/*for(String name : hs) {
			if(name.startsWith("g"))
				hs.remove(name);
		}
		System.out.println(hs);*/
	}
}
