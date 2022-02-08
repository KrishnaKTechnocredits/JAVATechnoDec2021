package technocredits.collectionDemo;

import java.util.ArrayList;

public class Example7 {

	void printElement(ArrayList<Character> al) {
		
		for(int index=0;index<al.size();index++) {
			char ch = al.get(index);
			if(Character.isUpperCase(ch))
				System.out.println(ch + "-"+ index);
		}
	}
	
	void printElementUsingEnhanceForLoop(ArrayList<Character> al) {
		int index = 0;
		for(char ch : al) {
			if(Character.isUpperCase(ch))
				System.out.println(ch + "-" + index);
			index++;
		}
	}
}
