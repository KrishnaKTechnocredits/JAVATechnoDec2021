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
package anjali;

import java.util.ArrayList;


public class Anjali_Assignment31 {
	
    ArrayList <Object> onlyUniqueElements(ArrayList <Object> arraylist) 
	{
	    ArrayList <Object>output = new ArrayList<Object>();
		for(int index=0;index<arraylist.size();index++) 
		{
			Object obj=arraylist.get(index);
			if(arraylist.indexOf(obj)==arraylist.lastIndexOf(obj))
			output.add(obj);
			else if(!output.contains(obj))
			output.add(obj);
		}
		return output;
	}
    
    public static void main(String[] args) {
		Anjali_Assignment31 anjali_Assignment31= new Anjali_Assignment31();
	    ArrayList <Object>  input1= new ArrayList<Object>();		  
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
		System.out.println("Input array: "+input1);
		ArrayList <Object> output1 =anjali_Assignment31.onlyUniqueElements(input1);
		System.out.println("The unique elemets are:"+output1);
		System.out.println("**********************************************************************************************");
		ArrayList <Object>  input2= new ArrayList<Object>();
		input2.add("Techno");
		input2.add("Credits");
		input2.add("Techno");
		input2.add("TechnoCredits");
		input2.add("Credits");
		input2.add("TechnoCredits");
		System.out.println("Input array: "+input2);
		ArrayList <Object> output2=anjali_Assignment31.onlyUniqueElements(input2);
		System.out.println("The unique elemets are:"+output2);
		System.out.println("**************************************************************************************************");
		ArrayList <Object>  input3= new ArrayList<Object>();
		input3.add("Techno");
		input3.add(16);
		input3.add("Credits");
		input3.add(19);
		input3.add("Techno");
		input3.add(2);
		input3.add( 19);
		input3.add("Credits");
		input3.add(16);
		input3.add("TechnoCredits");
		System.out.println("Input array: "+input3);
		ArrayList <Object> output3=anjali_Assignment31.onlyUniqueElements(input3);
		System.out.println("The unique elemets are:"+output3);
		
		

	}

}
