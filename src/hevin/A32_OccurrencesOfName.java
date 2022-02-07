package hevin;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;

public class A32_OccurrencesOfName {
	
	void printAllNamesOnce(String[] names) {
		ArrayList<String> list = new ArrayList<>(Arrays.asList(names));
		ArrayList<String> output = new ArrayList<>();
		
		for(int index = 0; index < list.size(); index++) {
			if(list.indexOf(list.get(index)) != list.lastIndexOf(list.get(index))) {
				if(!output.contains(list.get(index))) 
					output.add(list.get(index));
			}
		     else if(list.indexOf(list.get(index)) == list.lastIndexOf(list.get(index)))
				output.add(list.get(index));
		}
		System.out.println("Input  --> "+Arrays.toString(names));
		System.out.println("Output --> "+output);
	}

	void printOnlyUniqueNames(String[] names) {
		int count=0;
		String unique = "";
		
		for(int index = 0; index < names.length; index++) {
			for(int innerIndex = 0; innerIndex < names.length; innerIndex++) {
				if(names[index] == names[innerIndex]) {
					count++;
				}
			}
			if(count == 1) {
				unique = unique + names[index]+" ";
			}
			count = 0;
		}		
		System.out.println("Input  --> "+ Arrays.toString(names));
		System.out.println("Output --> "+ Arrays.asList(unique.trim().split(" ")));
	}

	void getUniqueNamesUsingSet(String[] names) {
		LinkedHashSet<String> list = new LinkedHashSet<String>(Arrays.asList(names));
		System.out.println("Input  --> " + Arrays.toString(names));
		System.out.println("Output --> "+ list);
	}

	public static void main(String[] args) {
		
		A32_OccurrencesOfName uniqueName = new A32_OccurrencesOfName();
		String[] names = {"Anvit", "Sandip", "Nishika", "Priya", "Sandip", "Priya"};
		uniqueName.printAllNamesOnce(names);	
		System.out.println();
		uniqueName.printOnlyUniqueNames(names);
		System.out.println();
		System.out.println("[Printed Using LinkedHashSet]");
		String[] list =  {"Vaibhav", "Amruta", "Shivangi", "Pooja", "Amruta", "Vaibhav"};
		uniqueName.getUniqueNamesUsingSet(list);	

	}

}
