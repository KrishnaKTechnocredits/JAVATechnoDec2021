package technocredits.collectionDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Example2 {

	double m1() {
		int x = 10;
		return x;
	}

	void printNames(String[] input) {
		List<String> names = Arrays.asList(input);
		for(int index=0;index<names.size();index++) {
			String currentName = names.get(index);
			if(names.indexOf(currentName) == names.lastIndexOf(currentName))
				System.out.println(currentName);
		}
	}
	
	static void printNames1(String[] input) {
		List<String> names = Arrays.asList(input);
		
		ArrayList<String> al = new ArrayList<String>(names);
		al.remove(0);
		System.out.println(al);
	}
	
	public static void main(String[] args) {
		printNames1(new String[] {"Hevin","Amruta","Shweta","Amruta","Pooja", "Hevin"});
	}
}
