package technocredits.collectionDemo;

import java.util.ArrayList;
//Write a method which will remove all the occurences of the name from the list which is passed as a parameter.
import java.util.Arrays;

public class Example6 {

	void removeNameFromList(ArrayList<String> al, String name) {
		int originSize = al.size();
		while(al.contains(name)) {
			int tempIndex = al.indexOf(name);
			al.remove(tempIndex);
		}
		
		while(al.indexOf(name) != -1) {
			int tempIndex = al.indexOf(name);
			al.remove(tempIndex);
		}
		
		System.out.println("Freq of " + name + " is " + (originSize-al.size()));
		
		
		for(int index=0;index<al.size();index++) {
			if(al.get(index).equals(name)) {
				al.remove(index);
			}
		}
		System.out.println(al);
	}
	
	void removeNameFromListUsingRemoveAll(ArrayList<String> al, String name) {
		/*String name1 = "Pooja";
		String name2 = "Rajguru";
		String arr[] = {name1, name2};
		*/
		ArrayList<String> listOfElementToBeDeleted = new ArrayList<String>(Arrays.asList(name));
		al.removeAll(listOfElementToBeDeleted);
		System.out.println(al);
	}
	
	public static void main(String[] args) {
		String[] arr = {"Yogesh", "Techno","Yogesh","Aashvi", "Credits", "Yogesh"};
		ArrayList<String> listOfNames = new ArrayList<String>(Arrays.asList(arr));
		new Example6().removeNameFromList(listOfNames, "Yogesh");
	}
}
