package sagarShrikhande.collections1;

import java.util.ArrayList;
import java.util.Arrays;

public class A32_CollectionOps {

	void printElementsListUsingString(String[] names) {
		String temp = "";
		for (int index = 0; index < names.length; index++) {
			if (!temp.contains(names[index]))
				temp = temp + names[index] + " ";
		}
		System.out.println("List of all Elements in list single entry using String[]: " + temp.trim());
	}

	void printUniqueElementsUsingString(String[] names) {
		String temp = "";
		for (int index = 0; index < names.length - 1; index++) {
			int count = 0;
			for (int innerIndex = 0; innerIndex < names.length; innerIndex++) {
				if (names[index].equals(names[innerIndex]))
					count++;
			}
			if (count == 1)
				temp = temp + names[index] + " ";
		}
		System.out.println("Unique Elements found using String: [" + temp.trim() + "]");
	}

	void printElementsListUsingArrayList(String[] names) {
		ArrayList<String> al = new ArrayList<String>(Arrays.asList(names));
		for (int index = 0; index < al.size(); index++) {
			if (al.indexOf(al.get(index)) != (al.lastIndexOf(al.get(index)))) {
				al.remove(al.get(index));
			}
		}
		System.out.println("List of all Elements in list single entry using ArrayList: " + al);
	}

	void printUniqueElementsUsingArrayList(String[] names) {
		ArrayList<String> al = new ArrayList<String>(Arrays.asList(names));

		for (int index = 0; index < al.size(); index++) {
			if (al.indexOf(al.get(index)) != (al.lastIndexOf(al.get(index)))) {
				int temp = al.lastIndexOf(al.get(index));
				al.remove(al.get(index));
				al.remove(al.get(temp - 1));
			}
		}
		System.out.println(al);
	}

	public static void main(String[] args) {
		A32_CollectionOps a32 = new A32_CollectionOps();
		String[] names = { "Anvit", "Sandip", "Nishika", "Priya", "Sandip", "Priya" };
		a32.printElementsListUsingString(names);
		a32.printElementsListUsingArrayList(names);
		a32.printUniqueElementsUsingString(names);
		a32.printUniqueElementsUsingArrayList(names);
	}
}

/*
 * Assignment 32: 5th Feb'2021
 * 
 * 1. Write a method which will remove all the occurrences of the name from the
 * list which is passed as a parameter. String[] names = {"Anvit", "Sandip",
 * "Nishika", "Priya", "Sandip", "Priya"}; Anvit Sandip Nishika Priya [all names
 * should be printed once] Anvit Nishika [only name having freq - 1]
 * 
 * 2. Input : String [] arr = {"Vaibhav", "Amruta", "Shivangi", "Pooja",
 * "Amruta", "Vaibhav"} Output : Vaibhav Amruta Shivangi Pooja
 * 
 */