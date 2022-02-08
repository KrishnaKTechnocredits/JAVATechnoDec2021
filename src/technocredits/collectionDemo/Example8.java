package technocredits.collectionDemo;

import java.util.ArrayList;

// Whenever we go to modify the list and array inside the enhance for loop, it will generate ConcurrentModificationException.

public class Example8 {

	void processData() {
		ArrayList<String> al = new ArrayList<String>();
		al.add("Rohini");
		al.add("Sandip");
		al.add("Saurav");
		al.add("Technocredits");
		al.add("Aakanksha");
		
		for(int index=0; index<al.size(); index++) {
			String name = al.get(index);
			if(name.length() < 7) {
				al.remove(name);
				index--;
			}
		}
		System.out.println(al);
		
		// fail fast
		/*for(String name : al) { // 5
			if(name.length() < 7) {
				al.remove(name); // 6
				System.out.println(al);
			}
		}*/
		
		// Fail - Safe
		
	}
	
	public static void main(String[] args) {
		new Example8().processData();
	}
}
