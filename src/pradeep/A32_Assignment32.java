package pradeep;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;

public class A32_Assignment32 {

	// Program 1: This method removes all occurrence of given name from list
	static void removeAllOccurrence(ArrayList<String> al, String name) {
		// Convert String name into List
		List<String> list = Arrays.asList(name);
		al.removeAll(list);// In remove all we can pass only collection object
		System.out.println("After removing " + name + " Array List : " + al);
	}

	// Program 2: This method removes duplicates using LinkedHashSet
	static void removeDuplicates(String[] arr) {
		List<String> list = Arrays.asList(arr);
		LinkedHashSet<String> hs = new LinkedHashSet<>(list);
		System.out.println(hs);
	}

	public static void main(String[] args) {

		// Initialize all elements of ArrayList in a single line;
		ArrayList<String> al = new ArrayList(Arrays.asList("Vaibhav", "Amruta", "Shivangi", "Pooja", "Amruta", "Vaibhav"));
		System.out.println("Program 1 \n Array List: " + al);
		removeAllOccurrence(al, "Amruta");

		String[] arr = { "Vaibhav", "Amruta", "Shivangi", "Pooja", "Amruta", "Vaibhav" };
		System.out.println("Program 2 \n Input Array: " + Arrays.toString(arr));
		removeDuplicates(arr);
	}
}
