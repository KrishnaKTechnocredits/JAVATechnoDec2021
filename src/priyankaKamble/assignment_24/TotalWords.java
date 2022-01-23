package priyankaKamble.assignment_24;

import java.util.Arrays;
import java.util.Scanner;

/*1. WAP to find out total words in a given string & print each word with its length
Input    : Hi Hello
Output : Total 2 words
              Hi --> 2
              Hello --> 5
*/
public class TotalWords {
	String[] output;

	void findWordcount(String input) {
		input.trim();
		output = input.split(" ");
		// System.out.println("check" + Arrays.toString(output));
		System.out.println("Total words present in input String  => " + output.length);
		int wordLength = 0;
		for (int index = 0; index < output.length; index++) {
			wordLength = output[index].length();
			System.out.println("lenghth of " + output[index] + " = " + wordLength);
		}
	}

	public static void main(String[] args) {
		TotalWords totalWords = new TotalWords();
		String input = "Sound Going TechnoCredits";
		System.out.println("Input String = > ' " + input + " '\n");
		// System.out.println("Total words = " + totalWords.findWordcount(input));
		totalWords.findWordcount(input);
	}
}
