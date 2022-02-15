/*Assignment 31 : 4th Feb'2022

WAP to return an ArrayList of unique elements from a given ArrayList 
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

package vaibhav.Assignment_31;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UniqueElementArrayList {

	// The method is defined using the generics concept to support all types of data
	// types

	static <T> ArrayList<T> getArrayList(T[] inputObj) {
		List<T> list = Arrays.asList(inputObj);
		ArrayList<T> arrayList = new ArrayList<>(list);
		return arrayList;
	}

	// The method is defined using the generics concept to support all types of data
	// types
	static <T> ArrayList<T> uniqueElement(ArrayList<T> al) {

		ArrayList<T> outputList = new ArrayList<>();

		for (T element : al) {
			if ((al.indexOf(element) == al.lastIndexOf(element)) || (!outputList.contains(element))) {
				outputList.add(element);
			}
		}
		return outputList;
	}

	public static void main(String[] args) {
		// UniqueElementArrayList uniqueElementArrayList = new UniqueElementArrayList();
		Integer[] arr1 = { 19, 8, 0, 8, 60, 56, 97, 0, 33, 60, 0 };
		String[] arr2 = { "Techno", "Credits", "Techno", "TechnoCredits", "Credits", "TechnoCredits" };
		Object[] arr3 = { "Techno", 16, "Credits", 19, "Techno", 2, 19, "Credits", 16, "TechnoCredits" };

		System.out.println("Input Array : " + Arrays.toString(arr1));
		System.out.println("Outpur Array with unique elements : " + uniqueElement(getArrayList(arr1)));
		System.out.println();
		System.out.println("Input Array : " + Arrays.toString(arr2));
		System.out.println("Outpur Array with unique elements : " + uniqueElement(getArrayList(arr2)));
		System.out.println();
		System.out.println("Input Array : " + Arrays.toString(arr3));
		System.out.println("Outpur Array with unique elements : " + uniqueElement(getArrayList(arr3)));

	}

}
