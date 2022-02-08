package sagarShrikhande.collections;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListUnique {

	ArrayList findUniqueElementInArrayList(ArrayList al) {
		for (int index = 0; index < al.size(); index++) {
			if (al.indexOf(al.get(index)) != (al.lastIndexOf(al.get(index)))) {
				al.remove(al.get(index));
			}
		}
		return al;
	}

	public static void main(String[] args) {
		ArrayListUnique a1 = new ArrayListUnique();
		ArrayList al = new ArrayList(Arrays.asList(19, 8, 0, 8, 60, 56, 97, 0, 33, 60, 0));
		System.out.println("input : " + al);
		ArrayList list = a1.findUniqueElementInArrayList(al);
		System.out.println("output : " + list);

		al = new ArrayList(Arrays.asList("Techno", "Credits", "Techno", "TechnoCredits", "Credits", "TechnoCredits"));
		System.out.println("input : " + al);
		list = a1.findUniqueElementInArrayList(al);
		System.out.println("output : " + list);

		al = new ArrayList(Arrays.asList("Techno", 16, "Credits", 19, "Techno", 2, 19, "Credits", 16, "TechnoCredits"));
		System.out.println("input : " + al);
		list = a1.findUniqueElementInArrayList(al);
		System.out.println("output : " + list);
	}

}

/*
 * Assignment 31 : 4th Feb'2022
 * 
 * WAP to return an ArrayList of unique elements from a given input ArrayList
 * Input : {19, 8, 0, 8, 60, 56, 97, 0, 33, 60, 0} Output : {19, 8, 0, 60, 56,
 * 97, 33}
 * 
 * Input : {"Techno", "Credits", "Techno", "TechnoCredits", "Credits",
 * "TechnoCredits"} Output : {"Techno", "Credits", "TechnoCredits"}
 * 
 * Input : {"Techno", 16, "Credits", 19, "Techno", 2, 19, "Credits", 16,
 * "TechnoCredits"} Output : {"Techno", 16, "Credits", 19, 2, "TechnoCredits"}
 * 
 * Hint : - create a method with take an input as ArrayList and return an
 * ArrayList - use indexOf() & lastIndexOf() to find unique elements
 * 
 */