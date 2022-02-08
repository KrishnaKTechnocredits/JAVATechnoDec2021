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
package shwetaDharmadhikari.assignment31_Arraylist;
import java.util.*;
public class FindUniqueElements {
	
	void findUniElements(ArrayList input) {
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
		}System.out.println("Output: "+output);
		System.out.println();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list = new ArrayList(Arrays.asList(19, 8, 0, 8, 60, 56, 97, 0, 33, 60, 0));
		ArrayList list1 = new ArrayList(Arrays.asList("Techno", "Credits", "Techno", "TechnoCredits", "Credits", "TechnoCredits"));
		ArrayList list2 = new ArrayList(Arrays.asList("Techno", 16, "Credits", 19, "Techno", 2, 19, "Credits", 16, "TechnoCredits"));
		
		FindUniqueElements findUniqueElements = new FindUniqueElements();
		System.out.println("Input: "+list);
		findUniqueElements.findUniElements(list);
		System.out.println("Input: "+list1);
		findUniqueElements.findUniElements(list1);
		System.out.println("Input: "+list2);
		findUniqueElements.findUniElements(list2);
		
		
	}

}
