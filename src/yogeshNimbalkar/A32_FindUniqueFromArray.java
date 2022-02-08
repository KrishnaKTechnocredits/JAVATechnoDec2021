package yogeshNimbalkar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;

public class A32_FindUniqueFromArray {

	void getAllNamesPrintedOnce(String[] names) {
		ArrayList<String> al = new ArrayList<String>(Arrays.asList(names));
		ArrayList<String> uniqueElement = new ArrayList<>();
		for(int index=0; index<al.size(); index++) {
			if(al.indexOf(al.get(index)) == al.lastIndexOf(al.get(index))) {
				uniqueElement.add(al.get(index));
			}else {
				if(!uniqueElement.contains(al.get(index)))
					uniqueElement.add(al.get(index));
			}
		}
		System.out.println(uniqueElement);
	}
	
	void getOnlyUniqueNames(String[] names) {
		String uniqueNames = "";
		for(int index=0; index<names.length; index++) {
			int count = 0;
			for(int innerIndex=0; innerIndex<names.length; innerIndex++) {
				if(names[index].equals(names[innerIndex]))
					count++;
			}
			if(count == 1) {
				uniqueNames += names[index] + " ";
			}
		}
		System.out.println(uniqueNames.trim());
	}
	
	void getUniqueNameFromArray(String[] names) {
		LinkedHashSet<String> lhNames = new LinkedHashSet<>(Arrays.asList(names));
		System.out.println(lhNames);
	}
	
	public static void main(String[] args) {
		String[] names = {"Anvit", "Sandip", "Nishika", "Priya", "Sandip", "Priya"};
		A32_FindUniqueFromArray program1 = new A32_FindUniqueFromArray();
		program1.getAllNamesPrintedOnce(names);
		program1.getOnlyUniqueNames(names);
		
		String[] namesList =  {"Vaibhav", "Amruta", "Shivangi", "Pooja", "Amruta", "Vaibhav"};
		program1.getUniqueNameFromArray(namesList);
	}
}
