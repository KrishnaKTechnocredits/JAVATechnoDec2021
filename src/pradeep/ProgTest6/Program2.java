//Find maximum word length from a given statement.
package pradeep.ProgTest6;

import java.util.HashMap;

public class Program2 {

	static void printMaxWordLength(String input) {
		int max = 0;
		String word = "";
		String[] arr = input.split(" ");
		HashMap<String, Integer> hMap = new HashMap<>();
		
		for (int index = 0; index < arr.length; index++) {
			String str = arr[index];
			hMap.put(str, str.length());
			if (max < hMap.get(str)) {
				max = hMap.get(str);
				word = str;
			}
		}
		System.out.println("Maximum word is: " + word);

	}

	public static void main(String[] args) {
		String input = "good morning technocredits hi hello";
		printMaxWordLength(input);
	}

}
