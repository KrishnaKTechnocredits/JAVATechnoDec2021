package nehaPandey;

//1. Write a method which will remove all the occurrences of the name from the list which is passed as a parameter.
//String[] names = {"Anvit", "Sandip", "Nishika", "Priya", "Sandip", "Priya"};
//Anvit Sandip Nishika Priya [all names should be printed once]
//Anvit Nishika [only name having freq - 1]
//
//2. Input :  String [] arr = {"Vaibhav", "Amruta", "Shivangi", "Pooja", "Amruta", "Vaibhav"}
//Output : Vaibhav  Amruta Shivangi Pooja

import java.util.ArrayList;
import java.util.Arrays;

public class A32_Collection_Program {
	void printAllUniqueElements(ArrayList<String> arrlist) {
		for (int index = 0; index < arrlist.size(); index++) {
			if (arrlist.indexOf(arrlist.get(index)) != arrlist.lastIndexOf(arrlist.get(index)))
				arrlist.remove(index);

		}
		System.out.println(arrlist);

	}

	void printAllElementsWithFrequencyOne(ArrayList<String> al) {
		ArrayList<String> al1 = new ArrayList<String>();
		int index1 = 0;
		for (int index = 0; index < al.size(); index++) {
			if (al.indexOf(al.get(index)) == al.lastIndexOf(al.get(index)))
				al1.add(index1++, al.get(index));
		}
		System.out.println(al1);

	}

	public static void main(String[] args) {
		A32_Collection_Program a32 = new A32_Collection_Program();
		System.out.println("Program : 1 ");
		System.out.println();
		System.out.println("Output:1 ");
		String[] names = { "Anvit", "Sandip", "Nishika", "Priya", "Sandip", "Priya" };
		ArrayList<String> arrlist = new ArrayList<String>(Arrays.asList(names));
		a32.printAllUniqueElements(arrlist);
		System.out.println();
		System.out.println("Output:2 ");
		String[] names2 = { "Vaibhav", "Amruta", "Shivangi", "Pooja", "Amruta", "Vaibhav" };
		ArrayList<String> arrlist1 = new ArrayList<String>(Arrays.asList(names2));
		a32.printAllUniqueElements(arrlist1);
		System.out.println();
		System.out.println("Program : 2 ");
		System.out.println();
		String[] input = { "Anvit", "Sandip", "Nishika", "Priya", "Sandip", "Priya" };
		ArrayList<String> al = new ArrayList<String>(Arrays.asList(input));
		a32.printAllElementsWithFrequencyOne(al);

	}

}
