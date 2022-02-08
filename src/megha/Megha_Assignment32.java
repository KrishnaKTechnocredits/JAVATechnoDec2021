package megha;

import java.util.ArrayList;
import java.util.Arrays;

public class Megha_Assignment32 {

	void printAllUniqueElements(ArrayList<String> al) {
		System.out.print("Output : ");
		for (int index = 0; index < al.size(); index++) {
			if (al.indexOf(al.get(index)) != al.lastIndexOf(al.get(index)))
				al.remove(index);
		}
		System.out.println(al);
	}

	void printAllElementsWithFreqOne(ArrayList<String> al) {
		System.out.print("Output : ");
		ArrayList<String> al1 = new ArrayList<String>();
		int index1 = 0;
		for (int index = 0; index < al.size(); index++) {
			if (al.indexOf(al.get(index)) == al.lastIndexOf(al.get(index)))
				al1.add(index1++, al.get(index));
		}
		System.out.println(al1);
	}

	public static void main(String[] args) {
		Megha_Assignment32 megha_Assignment = new Megha_Assignment32();
		System.out.println("Program 1 :");
		String[] input = { "Anvit", "Sandip", "Nishika", "Priya", "Sandip", "Priya" };
		ArrayList<String> al = new ArrayList<String>(Arrays.asList(input));
		System.out.println("Input : " + al);
		megha_Assignment.printAllUniqueElements(al);
		System.out.println();
		System.out.println("Program 2 :");
		String[] input1 = { "Anvit", "Sandip", "Nishika", "Priya", "Sandip", "Priya" };
		ArrayList<String> al1 = new ArrayList<String>(Arrays.asList(input1));
		System.out.println("Input : " + al1);
		megha_Assignment.printAllElementsWithFreqOne(al1);

	}

}
