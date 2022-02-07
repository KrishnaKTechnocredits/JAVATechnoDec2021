package yogeshNagar.collectionprogramme;

import java.util.ArrayList;
import java.util.List;

public class A31_GetUniqueAndDuplicateElementFromArrayList {
	
	void getUniqueInegerElementArray(int[] arr) {
		List<Integer> list = new ArrayList<Integer>();
		List<Integer> outList = new ArrayList<Integer>();
		for(int index=0;index<arr.length;index++) {
			list.add(arr[index]);
		}
		for(int lIndex=0;lIndex<list.size();lIndex++) {
			if(list.indexOf(list.get(lIndex)) != list.lastIndexOf(list.get(lIndex))) {
				if(!outList.contains(list.get(lIndex)))
					outList.add(list.get(lIndex));
			}
			else if(list.indexOf(list.get(lIndex))==list.lastIndexOf(list.get(lIndex)))
				outList.add(list.get(lIndex));	
		}
		System.out.println("----Programme1----");
		System.out.println("Input List "+list);
		System.out.println("Output List "+outList);
	}

	void getUniqueStringElementArray(String[] arr) {
		List<String> list = new ArrayList<String>();
		List<String> outList = new ArrayList<String>();
		for(int index=0;index<arr.length;index++) {
			list.add(arr[index]);
		}
		for(int lIndex=0;lIndex<list.size();lIndex++) {
			if(list.indexOf(list.get(lIndex)) != list.lastIndexOf(list.get(lIndex))) {
				if(!outList.contains(list.get(lIndex)))
					outList.add(list.get(lIndex));
			}
			else if(list.indexOf(list.get(lIndex))==list.lastIndexOf(list.get(lIndex)))
				outList.add(list.get(lIndex));	
		}
		System.out.println("----Programme2----");
		System.out.println("Input List "+list);
		System.out.println("Output List "+outList);
	}
	
	void getUniqueElementArray() {
		List list = new ArrayList();
		List outList = new ArrayList();
		list.add("Techno");
		list.add(16);
		list.add("Credits");
		list.add(19);
		list.add("Techno");
		list.add(2);
		list.add(19);
		list.add("Credits");
		list.add(16);
		list.add("TechnoCredits");
		
		for(int lIndex=0;lIndex<list.size();lIndex++) {
			if(list.indexOf(list.get(lIndex)) != list.lastIndexOf(list.get(lIndex))) {
				if(!outList.contains(list.get(lIndex)))
					outList.add(list.get(lIndex));
			}
			else if(list.indexOf(list.get(lIndex))==list.lastIndexOf(list.get(lIndex)))
				outList.add(list.get(lIndex));	
		}
		System.out.println("----Programme3----");
		System.out.println("Input List "+list);
		System.out.println("Output List "+outList);
	}
	public static void main(String[] args) {
		A31_GetUniqueAndDuplicateElementFromArrayList getUnique = new A31_GetUniqueAndDuplicateElementFromArrayList();
		int[] arr = {19, 8, 0, 8, 60, 56, 97, 0, 33, 60, 0};
		getUnique.getUniqueInegerElementArray(arr);
		System.out.println();
		String[] strArr = {"Techno", "Credits", "Techno", "TechnoCredits", "Credits", "TechnoCredits"};
		getUnique.getUniqueStringElementArray(strArr);
		System.out.println();
		getUnique.getUniqueElementArray();
	}

}
