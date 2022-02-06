package krishna.Assignment_31;

import java.util.ArrayList;
import java.util.Arrays;

public class Assignment_31Collection {
	ArrayList<Object> findUnique(ArrayList<Object> input) {
		ArrayList<Object> arr = new ArrayList<Object>();
		for (int i = 0; i < input.size(); i++) {
			if (input.indexOf(input.get(i)) == input.lastIndexOf(input.get(i))) {
				arr.add(input.get(i));
			} else if (!arr.contains(input.get(i)))
				arr.add(input.get(i));
		}
		return arr;
	}

	public static void main(String[] args) {
		Assignment_31Collection ass = new Assignment_31Collection();
		ArrayList<Object> input = new ArrayList<Object>(Arrays.asList(19, 8, 0, 8, 60, 56, 97, 0, 33, 60, 0));
		System.out.println(ass.findUnique(input));
		ArrayList<Object> arr1 = new ArrayList<Object>(Arrays.asList("Techno", "Credits", "Techno", "TechnoCredits", "Credits", "TechnoCredits"));
		System.out.println(ass.findUnique(arr1));
		ArrayList<Object> arr2 = new ArrayList<Object>(Arrays.asList("Techno", 16, "Credits", 19, "Techno", 2, 19, "Credits", 16, "TechnoCredits"));
		System.out.println(ass.findUnique(arr2));
	}
}
