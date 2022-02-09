package vaishnavi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class A32_LinkedHashSet {
	void namesPrintedOnce(String[] names) {
		ArrayList<String> list = new ArrayList<>(Arrays.asList(names));
		ArrayList<String> list1 = new ArrayList<>();
		ArrayList<String> list2 = new ArrayList<>();
		for (int index = 0; index < list.size(); index++) {
			if (!(list.indexOf(list.get(index)) == list.lastIndexOf(list.get(index)))) {
				if (!list1.contains(list.get(index)))
					list1.add(list.get(index));
			} else if (list.indexOf(list.get(index)) == list.lastIndexOf(list.get(index))) {
				list1.add(list.get(index));
			}
			if (list.indexOf(list.get(index)) == list.lastIndexOf(list.get(index)))
				list2.add(list.get(index));
		}
		System.out.println("Input array1 --> " + Arrays.toString(names));
		System.out.println("Output array2 --> " + list1);
		System.out.println("Names having frequency one --> " + list2);
	}

	void getUniqueNamesFromArray(String[] names) {
		HashSet<String> setNames = new LinkedHashSet<String>(Arrays.asList(names));
		System.out.println("Input array1 -->" + Arrays.toString(names));
		System.out.println("Output arrray2 --> " + setNames);
	}

	public static void main(String[] args) {
		A32_LinkedHashSet a32_LinkedHashSet = new A32_LinkedHashSet();
		String[] inputArray = { "Anvit", "Sandip", "Nishika", "Priya", "Sandip", "Priya" };
		a32_LinkedHashSet.namesPrintedOnce(inputArray);
		
		System.out.println("--------------------------------------------------------------");
		
		String[] input1 = { "Vaibhav", "Amruta", "Shivangi", "Pooja", "Amruta", "Vaibhav" };
		a32_LinkedHashSet.namesPrintedOnce(input1);
		
		System.out.println("--------------------------------------------------------");
	}
}

