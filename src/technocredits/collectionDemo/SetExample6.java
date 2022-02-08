package technocredits.collectionDemo;

import java.util.LinkedHashSet;
import java.util.Set;

public class SetExample6 {

	public static void main(String[] args) {
		Set<String> hs = new LinkedHashSet<String>();
		
		hs.add("Techno");
		hs.add(null);
		hs.add("Credits");
		hs.add(null);
		
		System.out.println(hs);
		// Zoom // techno
		
		//[Dharam, Credits, Techno, deepak, gaurav, yogesh, Aashvi]
		//[Techno, Credits, Dharam, yogesh, Aashvi, gaurav, deepak]
	}
}
