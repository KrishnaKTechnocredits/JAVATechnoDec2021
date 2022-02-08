package technocredits.collectionDemo;

import java.util.ArrayList;
import java.util.Iterator;

public class SetExample5 {

	public static void main(String[] args) {
		//LinkedHashSet<String> hs = new LinkedHashSet<>();
		ArrayList<String> hs = new ArrayList<>();
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
			if(name.startsWith("d"))
				itr.remove();
		}
		System.out.println(hs);
		
		/*for(String name : hs) {
			if(name.startsWith("g"))
				hs.remove(name);
		}
		System.out.println(hs);*/
	}
}
