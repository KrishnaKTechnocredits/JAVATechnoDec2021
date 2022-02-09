package anvit;

import java.util.ArrayList;

public class A32_Remove_All_Occurance_Of_Names {
	
	void getUniqueElements(ArrayList<String> input) {
		ArrayList<String> al = new ArrayList<String>();
		for (int i = 0; i < input.size(); i++) {
			if (input.indexOf(input.get(i)) == input.lastIndexOf(input.get(i))) 
				al.add(input.get(i));
			 else if (!al.contains(input.get(i)))
				al.add(input.get(i));
		}
		System.out.println(al);
	}
	
	void getUniqueElementsWithFreqOne(ArrayList<String> input) {
		ArrayList<String> al = new ArrayList<String>();
		for (int i = 0; i < input.size(); i++) {
			if (input.indexOf(input.get(i)) == input.lastIndexOf(input.get(i))) 
				al.add(input.get(i));
		}
		System.out.println(al);
	}
	
	public static void main(String[] args) {
		A32_Remove_All_Occurance_Of_Names a32 = new A32_Remove_All_Occurance_Of_Names();
		ArrayList<String> al = new ArrayList<String>();
		al.add("Anvit");
		al.add("Sandip");
		al.add("Nishika");
		al.add("Priya");
		al.add("Sandip");
		al.add("Priya");
		a32.getUniqueElements(al);
		System.out.println();
		a32.getUniqueElementsWithFreqOne(al);
		System.out.println();
		
		ArrayList<String> al2 = new ArrayList<String>();
		al2.add("Vaibhav");
		al2.add("Amruta");
		al2.add("Shivangi");
		al2.add("Pooja");
		al2.add("Amruta");
		al2.add("Vaibhav");
		a32.getUniqueElements(al2);

	}
}
