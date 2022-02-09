package anvit;

import java.util.ArrayList;

public class A31_UniqueElements_ArrayList {
	
	ArrayList getUniqueElements(ArrayList input) {
		ArrayList al = new ArrayList<>();
		for (int i = 0; i < input.size(); i++) {
			if (input.indexOf(input.get(i)) == input.lastIndexOf(input.get(i))) 
				al.add(input.get(i));
			 else if (!al.contains(input.get(i)))
				al.add(input.get(i));
		}
		return al;
	}
	

	public static void main(String[] args) {
		A31_UniqueElements_ArrayList arrayList = new A31_UniqueElements_ArrayList();
		ArrayList input1 = new ArrayList();
		input1.add(19);
		input1.add(8);
		input1.add(0);
		input1.add(8);
		input1.add(60);
		input1.add(56);
		input1.add(97);
		input1.add(0);
		input1.add(33);
		input1.add(60);
		input1.add(0);
		System.out.println(arrayList.getUniqueElements(input1));

		ArrayList input2 = new ArrayList();
		input2.add("Techno");
		input2.add("Credits");
		input2.add("Techno");
		input2.add("TechnoCredits");
		input2.add("Credits");
		input2.add("TechnoCredits");
		System.out.println();
		System.out.println(arrayList.getUniqueElements(input2));

		ArrayList input3 = new ArrayList();
		input3.add("Techno");
		input3.add(16);
		input3.add("Credits");
		input3.add(19);
		input3.add("Techno");
		input3.add(2);
		input3.add(19);
		input3.add("Credits");
		input3.add(16);
		input3.add("Technocredits");
		System.out.println();
		System.out.println(arrayList.getUniqueElements(input3));

	}
}
