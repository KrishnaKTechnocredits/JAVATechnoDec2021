package technocredits.collectionDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;

// Set : Set doesn't allow duplicates
// HashSet : 1) doesn't allow duplicates
//           2) insertion order wont be maintained

// LinkedHashSet : 1) doesn't allow duplicates
//                 2) insertion order will be maintained

//Note : There are no methods in Set interface which works on Index.
// add(index, object), remove(index), indexOf(object)

//String[] arr = {"vaibhav", "amruta", "shivangi", "pooja", "amruta", "vaibhav"};
// vaibhav, amruta, shivangi, pooja
// using Set 
public class SetExample2 {

	public static void main(String[] args) {
		String[] arr = {"vaibhav", "amruta", "shivangi", "pooja", "amruta", "vaibhav"};
		
		/*for(String name : arr) {
			// output.add(name);
		}*/
		LinkedHashSet<String> output = new LinkedHashSet<String>(Arrays.asList(arr));
		System.out.println(output);
		
		LinkedHashSet<String> hs = new LinkedHashSet<String>();
		hs.add("Maulik");
		hs.add("Anjali"); // true
		hs.add("Shweta");
		hs.add("Anjali");
		hs.add("Pooja"); 
		
		System.out.println(hs);
		
		ArrayList<String> al = new ArrayList<String>(hs);
		System.out.println(al.get(0));
		System.out.println(al.get(al.size()-1));
		
		LinkedHashSet<String> hs1 = new LinkedHashSet<String>(al);
		
		
		
		// Iterator : Fail Safe
	}
}
