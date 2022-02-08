package technocredits.collectionDemo;

import java.util.ArrayList;
import java.util.List;


// Array -> length is a property
// String -> length() is a method
// Collections framework -> size() is a method

// String[] names = {"Anvit", "Sandip", "Nishika", "Priya", "Sandip", "Priya"};
// Anvit Sandip Nishika Priya [all names should be printed once]
// Anvit Nishika [only name having freq - 1]
public class Example1 {

	static void printNames(ArrayList<String> names) {
		for(int index=0;index<names.size();index++) {
			String currentName = names.get(index);
			if(names.indexOf(currentName) == names.lastIndexOf(currentName))
				System.out.println(currentName);
		}
	}
	
	static void printUniqueNames() {
		String[] names = {"Anvit", "Sandip", "Nishika", "Priya", "Sandip", "Priya"};
		
		for(int index=0;index<names.length;index++) {
			String currentName = names[index];
			int count=0;
			for(int innerIndex=0;innerIndex<names.length;innerIndex++) {
				if(currentName.equals(names[innerIndex]))
					count++;
			}
			if(count == 1)
				System.out.println(currentName);
		}
	}
	
	public static void main(String[] args) {
		
		ArrayList<String> listOfNames = new ArrayList<String>();
		
		listOfNames.add("Anvit");
		listOfNames.add("Sandip");
		listOfNames.add("Nishika");
		listOfNames.add("Priya");
		listOfNames.add("Sandip");
		listOfNames.add("Priya");
		
		//printNames(listOfNames);
		printUniqueNames();
		/*System.out.println(listOfNames.toString());
		System.out.println(listOfNames.size());
		//System.out.println(listOfNames.get(0));
*/	}
}
