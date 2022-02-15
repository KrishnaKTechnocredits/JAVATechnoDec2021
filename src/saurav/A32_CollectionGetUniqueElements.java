
package saurav;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class A32_CollectionGetUniqueElements {

	void singleOccuredElement(ArrayList<String> input) {
		ArrayList<String> al1 = new ArrayList<String>();
		for (int index = 0; index < input.size(); index++) {
			if (input.indexOf(input.get(index)) == input.lastIndexOf(input.get(index))) {
				al1.add(input.get(index));
			}
		}
		System.out.println("elements which are occured once = " + al1);
	}

	void getElementWithFrequencyOne(String[] arr1) {
		Set<String> fq = new LinkedHashSet<String>(Arrays.asList(arr1));
		System.out.println("all elements once = " + fq);
	}

	public static void main(String[] args) {

		String[] arr1 = { "Anvit", "Sandip", "Nishika", "Priya", "Sandip", "Priya" };
		A32_CollectionGetUniqueElements assignment32 = new A32_CollectionGetUniqueElements();
		ArrayList<String> al = new ArrayList<String>(Arrays.asList(arr1));
		assignment32.singleOccuredElement(al);
		System.out.println();
		ArrayList<String> alw = new ArrayList<String>(Arrays.asList(arr1));
		assignment32.getElementWithFrequencyOne(arr1);
	}
}
