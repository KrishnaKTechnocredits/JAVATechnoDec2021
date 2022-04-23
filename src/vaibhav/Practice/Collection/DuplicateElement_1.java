package vaibhav.Practice.Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DuplicateElement_1 {

	private static ArrayList<String> replaceWord(ArrayList<String> wordList, String word) {
		while (wordList.contains(word)) {
			int index = wordList.indexOf(word);
			wordList.set(index, "*");
		}
		return wordList;
	}

	public static void main(String[] args) {
		String[] name = { "Techno", "Credits", "Techno", "Credits", "Techno" };

		List<String> list1 = Arrays.asList(name);
		ArrayList<String> list = new ArrayList<String>(list1);

		for (String word : list) {
			if (list.indexOf(word) != list.lastIndexOf(word) && !word.equals("*")) {
				System.out.println(word + " : " + "Duplicate");
				replaceWord(list, word);
			}
		}
	}
}
