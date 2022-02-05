package rohini;

import java.util.ArrayList;
import java.util.Arrays;

/*
 Assignment 32: 5th Feb'2021

1. Write a method which will remove all the occurrences of the name from the list which is passed as a parameter.
     String[] names = {"Anvit", "Sandip", "Nishika", "Priya", "Sandip", "Priya"};
     Anvit Sandip Nishika Priya [all names should be printed once]
     Anvit Nishika [only name having freq - 1]

2. Input :  String [] arr = {"Vaibhav", "Amruta", "Shivangi", "Pooja", "Amruta", "Vaibhav"}
Output : Vaibhav  Amruta Shivangi Pooja

 */

public class Rohini_Assignment32 {

	int count=0;
	public void removeOccurenceStri(ArrayList<Object> al) {

		ArrayList<Object> al1 = new ArrayList<Object>();
		for(int i=0;i<al.size();i++) {
			//System.out.println(al);
			if(al.indexOf(al.get(i))==al.lastIndexOf(al.get(i))) 
				al1.add(al.get(i));
		}
		//al1.retainAll(al);

		System.out.println("Only names having frquency 1 : "+al1);

		for(int i=0;i<al.size();i++) {
			if(al.indexOf(al.get(i))!=al.lastIndexOf(al.get(i))) 
				al.remove(al.get(i));
		}
		System.out.println("All names atleast once  : "+al);


	}



	public static void main(String[] args) {
		Rohini_Assignment32 obj = new Rohini_Assignment32();
		ArrayList<Object> al = new ArrayList<Object>(Arrays.asList("Anvit", "Sandip", "Nishika", "Priya", "Sandip", "Priya"));
		System.out.println("list 1*********** ");

		obj.removeOccurenceStri(al);

		System.out.println(" ");
		System.out.println("list 2*********** ");
		ArrayList<Object> ar = new ArrayList<Object>(Arrays.asList("Vaibhav", "Amruta", "Shivangi", "Pooja", "Amruta", "Vaibhav"));
		obj.removeOccurenceStri(ar);

	}
}
