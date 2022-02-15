/*Assignment 32: 5th Feb'2021

1. Write a method which will remove all the occurrences of the name from the list which is passed as a parameter.
     String[] names = {"Anvit", "Sandip", "Nishika", "Priya", "Sandip", "Priya"};
     Anvit Sandip Nishika Priya [all names should be printed once]
     Anvit Nishika [only name having freq - 1]
     
     - without collection
     - with collection
*/

package vaibhav.Assignment_32;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Program1_NamesWithFrequencyOne {

	String getNamesWithFrequencyOne(String[] input) {
		String temp = "";

		for (int index = 0; index < input.length; index++) {
			int count = 0;
			for (int innerIndex = 0; innerIndex < input.length; innerIndex++) {
				if (input[index].equals(input[innerIndex])) {
					count++;
				}
			}
			if (count == 1)
				temp += input[index] + " ";
		}
		return temp.trim();
	}

	ArrayList<String> getNamesWithFrequencyOne_ArrayList(String[] input) {

		List<String> list = Arrays.asList(input);
		ArrayList<String> al = new ArrayList<String>(list);

		ArrayList<String> output = new ArrayList<String>();

		for (String name : al) {
			if (al.indexOf(name) == al.lastIndexOf(name)) {
				output.add(name);
			}
		}
		return output;
	}

	public static void main(String[] args) {
		Program1_NamesWithFrequencyOne program1_NamesWithFrequencyOne = new Program1_NamesWithFrequencyOne();
		String[] names = { "Anvit", "Sandip", "Nishika", "Priya", "Sandip", "Priya" };
		System.out.println("Input Arrays of name 					: " + Arrays.toString(names));
		String expectedOutput1 = program1_NamesWithFrequencyOne.getNamesWithFrequencyOne(names);
		System.out.println("Expected output of Strings with word frequency of one without collection	: " + expectedOutput1);
		program1_NamesWithFrequencyOne.getNamesWithFrequencyOne_ArrayList(names);
		ArrayList<String> expectedOutput2 = program1_NamesWithFrequencyOne.getNamesWithFrequencyOne_ArrayList(names);
		System.out.println("Expected output of Strings with word frequency of one with collection		: " + expectedOutput2);
	}
}
