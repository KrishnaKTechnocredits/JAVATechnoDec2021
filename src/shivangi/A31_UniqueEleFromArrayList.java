/*
Assignment 31 : 4th Feb'2022

WAP to return an ArrayList of unique elements from a given input ArrayList(Add element only single time and 
then return)
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
package shivangi;

import java.util.ArrayList;

import java.util.Arrays;

public class A31_UniqueEleFromArrayList {
	
	ArrayList getUniqueElement(ArrayList al) {
		ArrayList outputUniqueList = new ArrayList();
		for(int index=0; index<al.size(); index++) {
			Object obj = al.get(index);
			
			if (al.indexOf(obj) == al.lastIndexOf(obj)) {
				outputUniqueList.add(obj);
			}	
			if (!outputUniqueList.contains(obj)) {
				outputUniqueList.add(obj);
			}
			
			/*if(!outputUniqueList.contains(obj)) {
				outputUniqueList.add(obj);
			}*/
		}
		return outputUniqueList;
	}
	
	public static void main(String[] args) {
		A31_UniqueEleFromArrayList a31 = new A31_UniqueEleFromArrayList();
		ArrayList al = new ArrayList();
		al.add(19);
		al.add(8);
		al.add(0);
		al.add(8);
		al.add(60);
		al.add(56);
		al.add(97);
		al.add(0);
		al.add(33);
		al.add(60);
		al.add(0);
		System.out.println("Input : " + al);
		ArrayList outputlist = a31.getUniqueElement(al);
		System.out.println("Output: " + outputlist);
		System.out.println();
		
		al = new ArrayList(Arrays.asList("Techno", "Credits", "Techno", "TechnoCredits", "Credits", "TechnoCredits"));
		System.out.println("input : " + al);
		outputlist = a31.getUniqueElement(al);
		System.out.println(outputlist);
		System.out.println();
		
		al = new ArrayList(Arrays.asList("Techno", 16, "Credits", 19, "Techno", 2, 19, "Credits", 16, "TechnoCredits"));
		System.out.println("input : " + al);
		outputlist = a31.getUniqueElement(al);
		System.out.println(outputlist);
		
		
	}
}
