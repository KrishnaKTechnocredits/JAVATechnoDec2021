/*Assignment 31: 4th Feb'2022  WAP to return an ArrayList of unique elements from a given input ArrayList  
Input    : {19, 8, 0, 8, 60, 56, 97, 0, 33, 60, 0} 
Output : {19, 8, 0, 60, 56, 97, 33}  

Input    : {"Techno", "Credits", "Techno", "TechnoCredits", "Credits", "TechnoCredits"} 
Output : {"Techno", "Credits", "TechnoCredits"}  

Input    : {"Techno", 16, "Credits", 19, "Techno", 2, 19, "Credits", 16, "TechnoCredits"} 
Output : {"Techno", 16, "Credits", 19, 2, "TechnoCredits"}  

Hint : - 
create a method with take an input as ArrayList and return an ArrayList - 
		use indexOf() & lastIndexOf() to find unique elements
*/
package deepak;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class A31_ArrayListOperations {

	ArrayList<Integer> getUniqueIntegers(ArrayList<Integer> input) {
		ArrayList<Integer> outputList = new ArrayList<>();
		for (int index = 0; index < input.size(); index++) {
			if (input.indexOf(input.get(index)) == input.lastIndexOf(input.get(index))) {
				outputList.add(input.get(index));
			} else if (!outputList.contains(input.get(index))) {
				outputList.add(input.get(index));
			}
		}
		System.out.print("Output Arraylist1: ");
		return outputList;
	}

	ArrayList<String> getUniqueStrings(ArrayList<String> input) {
		ArrayList<String> outputList = new ArrayList<>();
		for (int index = 0; index < input.size(); index++) {
			String currentString = input.get(index);
			if (input.indexOf(currentString) == input.lastIndexOf(currentString)) {
				outputList.add(currentString);
			} else if (!outputList.contains(currentString)) {
				outputList.add(currentString);
			}
		}
		System.out.print("Output Arraylist2: ");
		return outputList;
	}

	ArrayList<Object> getUniqueObjects(ArrayList<Object> input) {
		ArrayList<Object> outputList = new ArrayList<>();
		for (int index = 0; index < input.size(); index++) {
			Object currentObject = input.get(index);
			if (input.indexOf(currentObject) == input.lastIndexOf(currentObject)) {
				outputList.add(currentObject);
			} else if (!outputList.contains(currentObject)) {
				outputList.add(currentObject);
			}
		}
		System.out.print("Output Arraylist3: ");
		return outputList;
	}

	public static void main(String[] args) {
		A31_ArrayListOperations arrayList = new A31_ArrayListOperations();
		ArrayList<Integer> input1 = new ArrayList<Integer>();
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
		System.out.println("Input ArrayList1 : " + input1);
		System.out.println(arrayList.getUniqueIntegers(input1));

		ArrayList<String> input2 = new ArrayList<>();
		input2.add("Techno");
		input2.add("Credits");
		input2.add("Techno");
		input2.add("TechnoCredits");
		input2.add("Credits");
		input2.add("TechnoCredits");
		System.out.println();
		System.out.println("Input ArrayList2 : " + input2);
		System.out.println(arrayList.getUniqueStrings(input2));

		ArrayList<Object> input3 = new ArrayList<>();
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
		System.out.println("Input ArrayList3 : " + input3);
		System.out.println(arrayList.getUniqueObjects(input3));

	}
}
