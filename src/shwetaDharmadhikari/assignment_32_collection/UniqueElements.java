/*
 * Assignment 32: 5th Feb'2021

1. Write a method which will remove all the occurrences of the name from the list which is passed as a parameter.
     String[] names = {"Anvit", "Sandip", "Nishika", "Priya", "Sandip", "Priya"};
     Anvit Sandip Nishika Priya [all names should be printed once]
     Anvit Nishika [only name having freq - 1]
 */
package shwetaDharmadhikari.assignment_32_collection;

import java.util.*;

public class UniqueElements {

	void printSingleOccuranceFromNameUsingArraylist(String[] names) {
		ArrayList<String> al = new ArrayList<String>(Arrays.asList(names));

		for (int index = 0; index < al.size(); index++) {
			String word = al.get(index);
			if (al.indexOf(word) != al.lastIndexOf(word)) {
				al.remove(al.get(index));
			}
		}
		System.out.println("Single Occurance of names from String : " + al);
	}

	void removeDuplicates(ArrayList<String> alist) {
		System.out.print("Remove duplicates name :");
		ArrayList<String> al1 = new ArrayList<String>();
		for (int index = 0; index < alist.size(); index++) {
			if (alist.indexOf(alist.get(index)) == alist.lastIndexOf(alist.get(index)))
				al1.add(alist.get(index));
		}
		System.out.println(al1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] input = { "Anvit", "Sandip", "Nishika", "Priya", "Sandip", "Priya" };
		UniqueElements uniqueElements = new UniqueElements();
		uniqueElements.printSingleOccuranceFromNameUsingArraylist(input);
		ArrayList<String> al = new ArrayList<String>(Arrays.asList(input));
		uniqueElements.removeDuplicates(al);
	}
}
