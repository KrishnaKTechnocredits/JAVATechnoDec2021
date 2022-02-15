package monikaArkade;

import java.util.ArrayList;
import java.util.Arrays;

public class Assignment31_FindUniqueElements {
	 ArrayList<Object> uniqueElement(ArrayList<Object> input){
		ArrayList<Object> arr = new ArrayList<Object>();
		for(int index=0;index<input.size();index++) {
			if(input.indexOf(input.get(index))==input.lastIndexOf(input.get(index))) {
				arr.add(input.get(index));
			}
			else if(!arr.contains(input.get(index)))
				arr.add(input.get(index));
		}
		return arr;
	}
	public static void main(String[] args) {
		Assignment31_FindUniqueElements unique = new Assignment31_FindUniqueElements();
		ArrayList<Object> input1 = new ArrayList<Object>(Arrays.asList(19, 8, 0, 8, 60, 56, 97, 0, 33, 60, 0));
		System.out.println(unique.uniqueElement(input1));
		ArrayList<Object> input2 = new ArrayList<Object>(Arrays.asList("Techno", "Credits", "Techno", "TechnoCredits", "Credits", "TechnoCredits"));
		System.out.println(unique.uniqueElement(input2));
		ArrayList<Object> input3 = new ArrayList<Object>(Arrays.asList("Techno", 16, "Credits", 19, "Techno", 2, 19, "Credits", 16, "TechnoCredits"));
		System.out.println(unique.uniqueElement(input3));
	}
}
