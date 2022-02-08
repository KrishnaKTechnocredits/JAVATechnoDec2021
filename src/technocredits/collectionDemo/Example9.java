package technocredits.collectionDemo;

import java.util.ArrayList;
import java.util.Collections;

public class Example9 {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("Techno");
		al.add("Techn");
		al.add("Vrushali");
		al.add("Credits");
		
		System.out.println(al);
		Collections.sort(al);
		System.out.println(al);
		
		al.replaceAll(e -> e.toLowerCase());
		System.out.println(al);
	}
}
