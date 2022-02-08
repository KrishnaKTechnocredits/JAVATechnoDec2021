package jagdish;

import java.util.ArrayList;
import java.util.Arrays;

public class A31_Assignment {
	
	void findUniqueElemnt(ArrayList input) {
		ArrayList output=new ArrayList();
		for(int index=0; index<input.size(); index++) {
			if(input.indexOf(input.get(index)) == input.lastIndexOf(input.get(index))) {
				output.add(input.get(index));
			}
			else {
				if(!output.contains(input.get(index))) {
					output.add(input.get(index));
				}
			}
		}
		System.out.println("Output: "+output);
		System.out.println();
	}
	public static void main(String[] args) {
		ArrayList list = new ArrayList(Arrays.asList(19, 8, 0, 8, 60, 56, 97, 0, 33, 60, 0));
		ArrayList list1 = new ArrayList(Arrays.asList("Techno", "Credits", "Techno", "TechnoCredits", "Credits", "TechnoCredits"));
		ArrayList list2 = new ArrayList(Arrays.asList("Techno", 16, "Credits", 19, "Techno", 2, 19, "Credits", 16, "TechnoCredits"));

		A31_Assignment uniqueelement = new A31_Assignment();
		System.out.println("Input: "+list);
		uniqueelement.findUniqueElemnt(list);
		System.out.println("Input: "+list1);
		uniqueelement.findUniqueElemnt(list1);
		System.out.println("Input: "+list2);
		uniqueelement.findUniqueElemnt(list2);
	}
}
