package monikaArkade;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class Assignment32_RemoveAllOccuranceOfName {
	void removeFromList(String[] arr, String nameToDelete) {
		ArrayList<String> inputList = new ArrayList<String>(Arrays.asList(arr));

		ArrayList<String> listToDelete = new ArrayList<String>(Arrays.asList(nameToDelete));
		inputList.removeAll(listToDelete);
		System.out.println("Output: " + inputList);
	}

	void printNameOnce(String[] arr) {
		Set<String> set = new LinkedHashSet<String>(Arrays.asList(arr));
		System.out.println(set);
	}

	ArrayList<String> printName(ArrayList<String> name) {
		ArrayList<String> output = new ArrayList<String>();
		for (int index = 0; index < name.size(); index++) {

			if (name.indexOf(name.get(index)) == name.lastIndexOf(name.get(index)))
				output.add(name.get(index));
		}
		return output;
	}

	public static void main(String[] args) {
		Assignment32_RemoveAllOccuranceOfName assign32 = new Assignment32_RemoveAllOccuranceOfName();
		String arr[] = { "Anvit", "Sandip", "Nishika", "Priya", "Sandip", "Priya" };
		assign32.removeFromList(arr, "Anvit");
		assign32.printNameOnce(arr);

		ArrayList<String> arraylist = new ArrayList<String>(Arrays.asList(arr));
		ArrayList<String> output = assign32.printName(arraylist);
		System.out.println(output);

		System.out.println("\nName Having Frequency 1");

		String arr1[] = { "Vaibhav", "Amruta", "Shivangi", "Pooja", "Amruta", "Vaibhav" };
		assign32.printNameOnce(arr1);

	}

}
