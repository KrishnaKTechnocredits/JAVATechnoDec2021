package hevin;

import java.util.ArrayList;

public class A31_RemoveDuplicates {

	void removeDuplicateElements(ArrayList<Object> al) {
		
		for (int index = 0; index < al.size(); index++) {

			for (int innerindex = index + 1; innerindex < al.size(); innerindex++) {
				if (al.get(index).equals(al.get(innerindex))) {
					al.remove(innerindex);
				}
			}
		}
		System.out.print("Output :");
		System.out.println(al);
		System.out.println();

	}

	public static void main(String[] args) {
		A31_RemoveDuplicates obj1 = new A31_RemoveDuplicates();

		ArrayList<Object> al = new ArrayList<Object>();

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
		obj1.removeDuplicateElements(al);
		
		ArrayList<Object> al1 = new ArrayList<Object>();
		al1.add("Techno");
		al1.add("Credits");
		al1.add("Techno");
		al1.add("TechnoCredits");
		al1.add("Credits");
		al1.add("TechnoCredits");
		System.out.print("Input : ");
		System.out.println(al1);
		obj1.removeDuplicateElements(al1);
		
		ArrayList<Object> al2 = new ArrayList<Object>();
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
		obj1.removeDuplicateElements(al2);
	}
}
