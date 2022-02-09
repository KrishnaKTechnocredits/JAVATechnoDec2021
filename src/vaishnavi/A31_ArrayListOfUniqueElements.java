package vaishnavi;

import java.util.ArrayList;
import java.util.Arrays;

public class A31_ArrayListOfUniqueElements {
	
	void findUnique(ArrayList aList) {
		System.out.print("Output : ");
		ArrayList al1 = new ArrayList();
		for (int index = 0; index < aList.size(); index++) {
			for (int index1 = index; index1 < aList.size(); index1++) {
				if (aList.indexOf(aList.get(index)) == aList.lastIndexOf(aList.get(index))) {
					if (!al1.contains(aList.get(index)))
						al1.add(aList.get(index));
				} else if (!al1.contains(aList.get(index)))
					al1.add(aList.get(index));
			}
		}
		System.out.println(al1);
	}

	public static void main(String[] args) {
		A31_ArrayListOfUniqueElements a31_ArrayListOfUniqueElements = new A31_ArrayListOfUniqueElements();
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(19);
		al.add(8);
		al.add(0);
		al.add(60);
		al.add(56);
		al.add(97);
		al.add(0);
		al.add(33);
		al.add(60);
		al.add(0);
		System.out.print("Input : ");
		System.out.println(al);
		a31_ArrayListOfUniqueElements.findUnique(al);
		System.out.println();
		ArrayList<String> al1 = new ArrayList<String>();
		al1.add("Techno");
		al1.add("Credits");
		al1.add("Techno");
		al1.add("TechnoCredits");
		al1.add("Credits");
		al1.add("TechnoCredits");
		System.out.print("Input : ");
		System.out.println(al1);
		a31_ArrayListOfUniqueElements.findUnique(al1);
		System.out.println();
		ArrayList al2 = new ArrayList();
		al2.add("Techno");
		al2.add(16);
		al2.add("Credits");
		al2.add(2);
		al2.add(19);
		al2.add("Credits");
		al2.add(16);
		al2.add("TechnoCredits");
		System.out.print("Input : ");
		System.out.println(al2);
		a31_ArrayListOfUniqueElements.findUnique(al2);
	}
}