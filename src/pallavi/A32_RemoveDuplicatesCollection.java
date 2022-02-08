/*Assignment 32: 5th Feb'2021

1. Write a method which will remove all the occurrences of the name from the list which is passed as a parameter.
     String[] names = {"Anvit", "Sandip", "Nishika", "Priya", "Sandip", "Priya"};
     Anvit Sandip Nishika Priya [all names should be printed once]
     Anvit Nishika [only name having freq - 1]

2. Input :  String [] arr = {"Vaibhav", "Amruta", "Shivangi", "Pooja", "Amruta", "Vaibhav"}
Output : Vaibhav  Amruta Shivangi Pooja
*/

package pallavi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;

public class A32_RemoveDuplicatesCollection {

	static void printUnique(String[] names) {
		List<String> inputList = Arrays.asList(names);
		LinkedHashSet<String> input = new LinkedHashSet<String>(inputList);
		System.out.println("All unique names:- " + input);

		System.out.println("Names with frequency 1:- ");
		for (int index = 0; index < inputList.size(); index++) {
			String name = inputList.get(index);
			if (inputList.indexOf(name) == inputList.lastIndexOf(name))
				System.out.print(name + " ");
		}
	}

	static void RemoveName(String[] names, String nameToDelete) {
		ArrayList<String> inputList = new ArrayList<String>(Arrays.asList(names));
		ArrayList<String> listtoDelete = new ArrayList<String>(Arrays.asList(nameToDelete));
		inputList.removeAll(listtoDelete);
		System.out.println();
		System.out.println("List after removal of given name:- " + inputList);
	}

	public static void main(String[] arr) {
		String[] names = { "Anvit", "Sandip", "Nishika", "Priya", "Sandip", "Priya" };
		System.out.println("Input:- " + Arrays.toString(names));
		printUnique(names);
		RemoveName(names, "Sandip");

		System.out.println("-------------------------------------------------------------");
		String[] names2 = { "Vaibhav", "Amruta", "Shivangi", "Pooja", "Amruta", "Vaibhav" };
		System.out.println("Input:- " + Arrays.toString(names2));
		printUnique(names2);
		RemoveName(names2, "Pooja");
	}

}
