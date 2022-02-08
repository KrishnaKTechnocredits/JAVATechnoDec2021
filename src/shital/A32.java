package shital;

import java.util.ArrayList;
import java.util.Arrays;

public class A32 {

	void printAllUniqueName(ArrayList<String> al) {
		System.out.print("Output is : ");
		for (int index = 0; index < al.size(); index++) {
			if (al.indexOf(al.get(index)) != al.lastIndexOf(al.get(index)))
				al.remove(index);
		}
		System.out.println(al);
	}
	
	void printAllElementsWithFreqOne(ArrayList<String> alist) {
		System.out.print("Output : ");
		ArrayList<String> al1 = new ArrayList<String>();
		for (int index = 0; index < alist.size(); index++) {
			if (alist.indexOf(alist.get(index)) == alist.lastIndexOf(alist.get(index)))
				al1.add(alist.get(index));
		}
		System.out.println(al1);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A32 a32=new A32();
		System.out.println("********all names should be printed once**********");
		String[] names = {"Anvit", "Sandip", "Nishika", "Priya", "Sandip", "Priya"};
		ArrayList<String> al = new ArrayList<String>(Arrays.asList(names));
		System.out.println("Input : " + al);
		a32.printAllUniqueName(al);
		
		System.out.println("\n********only name having freq - 1**********");
		String[] input1 = { "Anvit", "Sandip", "Nishika", "Priya", "Sandip", "Priya" };
		ArrayList<String> name = new ArrayList<String>(Arrays.asList(input1));
		System.out.println("Input : " + name);
		a32.printAllElementsWithFreqOne(name);	
	}

}
