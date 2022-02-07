package krishna.Assignment_32;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class Assignment_32_printUnique {
	void getAllNamesPrintedOnce(String[] value) {
		ArrayList<String> list = new ArrayList<>(Arrays.asList(value));
		ArrayList<String> newList = new ArrayList<>();
		ArrayList<String> newList1 = new ArrayList<>();
		for (int index = 0; index < list.size(); index++) {
			if (!(list.indexOf(list.get(index)) == list.lastIndexOf(list.get(index)))) {
				if (!newList.contains(list.get(index)))
					newList.add(list.get(index));
			} else if (list.indexOf(list.get(index)) == list.lastIndexOf(list.get(index))) {
				newList.add(list.get(index));
			}
			if (list.indexOf(list.get(index)) == list.lastIndexOf(list.get(index)))
				newList1.add(list.get(index));
		}
		System.out.println("Input Data1 --> " + Arrays.toString(value));
		System.out.println("Output Data1 --> " + newList);
		System.out.println("Unique Output --> " + newList1);
	}

	void getUniqueNamesFromArray(String[] input) {
		HashSet<String> setNames = new LinkedHashSet<String>(Arrays.asList(input));
		System.out.println("Input Data2 ----> " + Arrays.toString(input));
		System.out.println("Output Data2 ----> " + setNames);
	}

	public static void main(String[] args) {
		Assignment_32_printUnique ass = new Assignment_32_printUnique();
		String[] input = { "Anvit", "Sandip", "Nishika", "Priya", "Sandip", "Priya" };
		ass.getAllNamesPrintedOnce(input);
		System.out.println("--------------------------------------------------------------");
		String[] input1 = { "Vaibhav", "Amruta", "Shivangi", "Pooja", "Amruta", "Vaibhav" };
		ass.getUniqueNamesFromArray(input1);
		System.out.println("--------------------------------------------------------");
	}
}
