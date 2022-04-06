/*Programming Test - 13 : 25th May'2021

2. Return all the words having more than two vowels from given array.
input: ["aashay","sandesh","madhavi","ankit","ami","priyanka"]
output: ["aashay","madhavi","priyanka"]

public ArrayList<String> getVowels(String words[]){
	//write your logic
}*/

package vaibhav.Practice.Programming_Test.Test_13;

import java.util.ArrayList;
import java.util.Arrays;

public class WordOperation {

	boolean isValidWord(String name) {
		int count = 0;
		char[] chArr = name.toCharArray();

		for (char ch : chArr) {
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
				count++;
		}

		if (count > 2)
			return true;
		else
			return false;
	}

	ArrayList<String> getVowels(String words[]) {
		ArrayList<String> output = new ArrayList<String>();

		for (String name : words) {
			if (isValidWord(name))
				output.add(name);
		}
		return output;
	}

	public static void main(String[] args) {
		String[] input = { "aashay", "sandesh", "madhavi", "ankit", "ami", "priyanka" };

		WordOperation wordOperation = new WordOperation();
		ArrayList<String> expectedOutput = wordOperation.getVowels(input);

		System.out.println("Input Array		: " + Arrays.toString(input));
		System.out.println("Expected output		: " + expectedOutput);
	}

}
