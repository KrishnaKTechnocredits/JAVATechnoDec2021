/*Assignment 32: 5th Feb'2021

1. Write a method which will remove all the occurrences of the name from the list which is passed as a parameter.
     String[] names = {"Anvit", "Sandip", "Nishika", "Priya", "Sandip", "Priya"};
     Anvit Sandip Nishika Priya [all names should be printed once]
     Anvit Nishika [only name having freq - 1]

2. Input :  String [] arr = {"Vaibhav", "Amruta", "Shivangi", "Pooja", "Amruta", "Vaibhav"}
Output : Vaibhav  Amruta Shivangi Pooja
 */
package anjali;

import java.util.ArrayList;
import java.util.Arrays;

import java.util.LinkedHashSet;

import java.util.Set;

public class Anjali_Assignment32 {
	
	void removeNameFromList(String arr[],String nameToDelete) 
	{
		ArrayList<String> inputList = new ArrayList<String>(Arrays.asList(arr));
		//System.out.println(Arrays.asList(arr));
		
		ArrayList<String> listtoDelete = new ArrayList<String>(Arrays.asList(nameToDelete));
		//System.out.println(Arrays.asList(nameToDelete));
		
		inputList.removeAll(listtoDelete);
		
		System.out.println("ArrayList after removal of given name: " + inputList);
	}
	
	
	void printNameOnluOnceInList(String arr[]) 
	{
		
		Set<String> set= new LinkedHashSet<String>(Arrays.asList(arr));
		System.out.println(set);
	}
	
	
	ArrayList<String>  printUniqueName(ArrayList<String> al) 
	{
		ArrayList <String>output = new ArrayList<>();
		for(int index=0;index<al.size();index++) 
		{
			if(al.indexOf(al.get(index))==al.lastIndexOf(al.get(index)))
				output.add(al.get(index));
			   
		}
		return output;
	}
	
	
	

	public static void main(String[] args) {
		Anjali_Assignment32 anjali_Assignment32 = new Anjali_Assignment32();
	     String arr []={"Anvit", "Sandip", "Nishika", "Priya", "Sandip", "Priya"};
		 anjali_Assignment32.removeNameFromList(arr, "Anvit");
	
		 anjali_Assignment32.printNameOnluOnceInList(arr);
	
		 ArrayList<String> arraylist = new ArrayList<String>(Arrays.asList(arr));
		 ArrayList<String> output= anjali_Assignment32.printUniqueName(arraylist);
		 System.out.println(output);
		 
System.out.println("*****************************************");

		 String arr1[]= {"Vaibhav", "Amruta", "Shivangi", "Pooja", "Amruta", "Vaibhav"};
		 anjali_Assignment32.removeNameFromList(arr1, "Amruta");
		 anjali_Assignment32.printNameOnluOnceInList(arr1);
		 ArrayList<String> arraylist1 = new ArrayList<String>(Arrays.asList(arr1));
		 ArrayList<String> output1= anjali_Assignment32.printUniqueName(arraylist1);
		 System.out.println(output1);
	
		 
	}

}
