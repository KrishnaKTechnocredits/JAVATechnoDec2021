package nehaPandey;

//WAP to return an ArrayList of unique elements from a given input ArrayList 

//Input    : {19, 8, 0, 8, 60, 56, 97, 0, 33, 60, 0}
//Output : {19, 8, 0, 60, 56, 97, 33}
//
//Input    : {"Techno", "Credits", "Techno", "TechnoCredits", "Credits", "TechnoCredits"}
//Output : {"Techno", "Credits", "TechnoCredits"}
//
//Input    : {"Techno", 16, "Credits", 19, "Techno", 2, 19, "Credits", 16, "TechnoCredits"}
//Output : {"Techno", 16, "Credits", 19, 2, "TechnoCredits"}
//
//Hint :
//- create a method with take an input as ArrayList and return an ArrayList
//- use indexOf() & lastIndexOf() to find unique elements

import java.util.ArrayList;

public class A31_Collection_Program {
	void findUniqueElements(ArrayList arrlist) {
		ArrayList arrlist1 = new ArrayList();
		for (int index = 0; index < arrlist.size(); index++) {
			for (int innerIndex = index; innerIndex < arrlist.size(); innerIndex++) {
				if (arrlist.indexOf(arrlist.get(index)) == arrlist.lastIndexOf(arrlist.get(index))) {
					if (!arrlist1.contains(arrlist.get(index)))
						arrlist1.add(arrlist.get(index));

				} else if (!arrlist1.contains(arrlist.get(index)))
					arrlist1.add(arrlist.get(index));
			}
		}
		System.out.println(arrlist1);

	}

	public static void main(String[] args) {
		A31_Collection_Program a31collectionprogram = new A31_Collection_Program();
		ArrayList<Integer> arrlist = new ArrayList<Integer>();
		arrlist.add(19);
		arrlist.add(8);
		arrlist.add(0);
		arrlist.add(60);
		arrlist.add(56);
		arrlist.add(97);
		arrlist.add(0);
		arrlist.add(33);
		arrlist.add(60);
		arrlist.add(0);
		a31collectionprogram.findUniqueElements(arrlist);
		System.out.println();

		ArrayList<String> arrlist1 = new ArrayList<String>();
		arrlist1.add("Techno");
		arrlist1.add("Credits");
		arrlist1.add("Techno");
		arrlist1.add("TechnoCredits");
		arrlist1.add("Credits");
		arrlist1.add("TechnoCredits");
		a31collectionprogram.findUniqueElements(arrlist1);
		System.out.println();

		ArrayList arrlist2 = new ArrayList();
		arrlist2.add("Techno");
		arrlist2.add(16);
		arrlist2.add("Credits");
		arrlist2.add(19);
		arrlist2.add("Techno");
		arrlist2.add(2);
		arrlist2.add(19);
		arrlist2.add("Credits");
		arrlist2.add(16);
		arrlist2.add("TechnoCredits");
		a31collectionprogram.findUniqueElements(arrlist2);

	}

}
