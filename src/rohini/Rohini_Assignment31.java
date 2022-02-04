package rohini;

import java.util.ArrayList;
import java.util.Arrays;

/*
Assignment 31 : 4th Feb'2022
WAP to return an ArrayList of unique elements from a given input ArrayList 
*/

public class Rohini_Assignment31 {
    
	 ArrayList<Object> FindUniqueNum(ArrayList <Object> list) {
		ArrayList <Object> newList = new ArrayList<Object>();
		for(int index=0;index<list.size();index++)
		{
			if(list.indexOf(list.get(index))==list.lastIndexOf(list.get(index)))
				newList.add(list .get(index));
			else if(!newList.contains(list.get(index)))
			  newList.add(list.get(index));
		}
		return newList;
		
	}
	
	public static void main(String[] args) {
		Rohini_Assignment31 arr = new Rohini_Assignment31();
		ArrayList<Object> list = new ArrayList<Object>(Arrays.asList(19, 8, 0, 8, 60, 56, 97, 0, 33, 60, 0)); 
		System.out.println("Input : "+list+"\n"+"Output "+arr.FindUniqueNum(list));
		ArrayList<Object> list1 = new ArrayList<Object>(Arrays.asList("Techno", "Credits", "Techno", "TechnoCredits", "Credits", "TechnoCredits")); 
		System.out.println("Input : "+list1+"\n"+"Output "+arr.FindUniqueNum(list1));
		ArrayList<Object> list2 = new ArrayList<Object>(Arrays.asList("Techno", 16, "Credits", 19, "Techno", 2, 19, "Credits", 16, "TechnoCredits")); 
		System.out.println("Input : "+list2+"\n"+"Output "+arr.FindUniqueNum(list2));
	}
}
