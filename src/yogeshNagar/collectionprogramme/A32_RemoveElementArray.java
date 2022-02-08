package yogeshNagar.collectionprogramme;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;

public class A32_RemoveElementArray {
	
	void getAllNamesPrintedOnce(String[] names) {
		ArrayList<String> list = new ArrayList<>(Arrays.asList(names));
		ArrayList<String> outList = new ArrayList<>();
		for(int index=0;index<list.size();index++) {
			if(list.indexOf(list.get(index)) != list.lastIndexOf(list.get(index))) {
				if(!outList.contains(list.get(index))) 
					outList.add(list.get(index));
			}
		     else if(list.indexOf(list.get(index)) == list.lastIndexOf(list.get(index)))
				outList.add(list.get(index));
		}
		System.out.println("Input Array --> "+Arrays.toString(names));
		System.out.println("Output Array --> "+outList);
	}
	
	void getOnlyUniqueNamesFromArray(String[] names) {
		int count=0;
		String uniqueName = "";
		for(int index=0;index<names.length;index++) {
			for(int innerIndex=0;innerIndex<names.length;innerIndex++) {
				if(names[index]==names[innerIndex]) {
					count++;
				}
			}
			if(count==1) {
				uniqueName = uniqueName + names[index]+" ";
			}
			count=0;
		}		
		System.out.println("Input Array --> "+Arrays.toString(names));
		System.out.println("Output Array --> "+Arrays.asList(uniqueName.trim().split(" ")));
	}
	
	void getUniqueNamesFromArray(String[] names) {
		LinkedHashSet<String> setNames = new LinkedHashSet<String>(Arrays.asList(names));
		System.out.println("Input Array --> " + Arrays.toString(names));
		System.out.println("Output Array --> "+ setNames);
	}
		
	public static void main(String[] args) {
		A32_RemoveElementArray uniqueName = new A32_RemoveElementArray();
		String[] names = {"Anvit", "Sandip", "Nishika", "Priya", "Sandip", "Priya"};
		System.out.println("----Programme 1 ----");
		uniqueName.getAllNamesPrintedOnce(names);	
		System.out.println();
		uniqueName.getOnlyUniqueNamesFromArray(names);
		System.out.println();
		System.out.println("----Programme 2 ----");
		String[] namesList =  {"Vaibhav", "Amruta", "Shivangi", "Pooja", "Amruta", "Vaibhav"};
		uniqueName.getUniqueNamesFromArray(namesList);	
		
	}

}
