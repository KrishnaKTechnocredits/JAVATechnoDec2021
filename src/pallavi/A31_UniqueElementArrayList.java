/*Assignment 31 : 4th Feb'2022

WAP to return an ArrayList of unique elements from a given input ArrayList 
Input    : {19, 8, 0, 8, 60, 56, 97, 0, 33, 60, 0}
Output : {19, 8, 0, 60, 56, 97, 33}

Input    : {"Techno", "Credits", "Techno", "TechnoCredits", "Credits", "TechnoCredits"}
Output : {"Techno", "Credits", "TechnoCredits"}

Input    : {"Techno", 16, "Credits", 19, "Techno", 2, 19, "Credits", 16, "TechnoCredits"}
Output : {"Techno", 16, "Credits", 19, 2, "TechnoCredits"}

Hint :
- create a method with take an input as ArrayList and return an ArrayList
- use indexOf() & lastIndexOf() to find unique elements
*/

package pallavi;

import java.util.ArrayList;
import java.util.Arrays;

public class A31_UniqueElementArrayList {

	ArrayList findUniqueElements(ArrayList input) {
		ArrayList output = new ArrayList();
		for (int index = 0; index < input.size(); index++) {
			if (input.indexOf(input.get(index)) == input.lastIndexOf(input.get(index)))
				output.add(input.get(index));
			if (!output.contains(input.get(index)))
				output.add(input.get(index));
		}
		return output;
	}

	public static void main(String[] arr) {
		A31_UniqueElementArrayList a31_arraylist = new A31_UniqueElementArrayList();

		ArrayList<Integer> input1 = new ArrayList<Integer>(Arrays.asList(19, 8, 0, 8, 60, 56, 97, 0, 33, 60, 0));
		System.out.println("Input1:- " + input1);
		System.out.println("Output1 :- " + a31_arraylist.findUniqueElements(input1));

		ArrayList<String> input2 = new ArrayList<String>(Arrays.asList("Techno", "Credits", "Techno", "TechnoCredits", "Credits", "TechnoCredits"));
		System.out.println("Input1:- " + input2);
		System.out.println("Output1 :- " + a31_arraylist.findUniqueElements(input2));

		ArrayList input3 = new ArrayList(Arrays.asList("Techno", 16, "Credits", 19, "Techno", 2, 19, "Credits", 16, "TechnoCredits"));
		System.out.println("Input1:- " + input3);
		System.out.println("Output1 :- " + a31_arraylist.findUniqueElements(input3));

	}
}
