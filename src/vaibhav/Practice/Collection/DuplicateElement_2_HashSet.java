package vaibhav.Practice.Collection;

import java.util.ArrayList;
import java.util.HashSet;

public class DuplicateElement_2_HashSet {
	public static void main(String[] args) {
		String[] name = { "Techno", "Credits", "Techno", "Credits", "Techno" };

		HashSet<String> setOfWords = new HashSet<String>();
		ArrayList<String> listOfWords = new ArrayList<String>();
		//HashSet<String> listOfWords = new HashSet<String>();

		for (String word : name) {
			if (!setOfWords.add(word)) { 
				if (!listOfWords.contains(word)) {
					System.out.println(word + " : Duplicate");
					listOfWords.add(word);
				}
			}

		}
	}
}
