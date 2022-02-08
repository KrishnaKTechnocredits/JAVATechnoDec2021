package megha;

import java.util.ArrayList;

public class Megha_Assignment31 {

	void findUnique(ArrayList al) {
		System.out.print("Output : ");
		ArrayList al1 = new ArrayList();
		for (int index = 0; index < al.size(); index++) {
			for (int index1 = index; index1 < al.size(); index1++) {
				if (al.indexOf(al.get(index)) == al.lastIndexOf(al.get(index))) {
					if (!al1.contains(al.get(index)))
						al1.add(al.get(index));
				} else if (!al1.contains(al.get(index)))
					al1.add(al.get(index));
			}
		}
		System.out.println(al1);
	}

	public static void main(String[] args) {
		Megha_Assignment31 megha_Assignment31 = new Megha_Assignment31();
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
		megha_Assignment31.findUnique(al);
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
		megha_Assignment31.findUnique(al1);
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
		megha_Assignment31.findUnique(al2);
	}

}
