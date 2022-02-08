package technocredits.collectionDemo;

import java.util.HashSet;

// Set : Set doesn't allow duplicates
// HashSet : 1) doesn't allow duplicates
//           2) insertion order wont be maintained

// LinkedHashSet : 1) doesn't allow duplicates
//                 2) insertion order will be maintained

//Note : There are no methods in Set interface which works on Index.
// add(index, object), remove(index), indexOf(object)

public class SetExample1 {

	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<String>();
		hs.add("Maulik");
		System.out.println(hs.add("Pooja")); // true
		hs.add("Shweta");
		System.out.println(hs.add("pooja"));// false
		
		System.out.println(hs.size()); //3 //4 //RE
		System.out.println(hs); //3
		
		hs.remove("pooja");
		System.out.println(hs);
		
		for(String name : hs) {
			if(name.length() > 5)
				System.out.println(name);
		}
		
		// Iterator : Fail Safe
	}
}
