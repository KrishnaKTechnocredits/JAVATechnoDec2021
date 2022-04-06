/* Assignment 24 : 16th Jan 2022

1. WAP to find out total words in a given string & print each word with its length
Input    : Hi Hello
Output : Total 2 words
              Hi --> 2
              Hello --> 5
*/

package vaibhav.Practice.Assignment_24;

import java.util.Arrays;

public class Program1_WordCount {

	void totalWordCount(String str) {
		String[] output = str.split(" ");
		System.out.println("Input String	: " + str);
		System.out.println("Total " + output.length + " words");
		for (int index = 0; index < output.length; index++) {
			System.out.println(output[index] + " --> " + output[index].length());
		}
	}

	public static void main(String[] args) {
		Program1_WordCount wordCount = new Program1_WordCount();
		String inputString = "Hi Hello";
		wordCount.totalWordCount(inputString);
	}
}
