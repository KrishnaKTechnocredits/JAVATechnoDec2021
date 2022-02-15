package shital;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class A33 {

	void getAsciiOfChar(char ch) {
		System.out.println("Given Character is : "+ch);
		int ascii=ch;
		System.out.println("Ascii value is :"+ascii);
	}
	
	char getCharFromNum(int num) {
		System.out.println("Given Ascii value is : "+num);
		char ch = (char) num;
		return ch;
	}
	
	void getAsciiFromAtoZ() {
		for(char ch='A';ch<='Z';ch++) {
			int ascii=ch;
			System.out.println(ch+" - "+ascii);
		}
	}
	
	void printCharaFromGivenAscii() {
		for(int index=97;index<=122;index++) {
			char ch=(char)index;
			System.out.println(index+" - "+ch);
		}
	}
	
	void  printCharFreqFromGivenName(String name) {
		System.out.println("Given Name is : " + name);
		Map<Character, Integer> input = new HashMap();
		for (int index = 0; index < name.length(); index++) {
			char ch = name.charAt(index);
			if (input.containsKey(ch))
				input.put(ch, input.get(ch) + 1);
			else
				input.put(ch, 1);
		}
		System.out.println("Character Frequency is : " + input);
	}
	
	void printWordFreqofGivenArray(String[] nameList) {
		Map<String, Integer> input = new TreeMap();
		for (int index = 0; index < nameList.length; index++) {
			String name = nameList[index];
			if (input.containsKey(name))
				input.put(name, input.get(name) + 1);
			else
				input.put(name, 1);
		}
		System.out.println("character frequency is : " + input);
	}
	
	void printFreqofNum(int[] numList) {
		Map<Integer, Integer> input = new TreeMap();
		for (int index = 0; index < numList.length; index++) {
			int num = numList[index];
			if (input.containsKey(num))
				input.put(num, input.get(num) + 1);
			else
				input.put(num, 1);
		}
		System.out.println("Output : " + input);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	A33 a33 =new A33();
	System.out.println("*********Program 1: return ascii value of given character*********");
	a33.getAsciiOfChar('s');
	
	System.out.println("\n*********Program 2: return character of given Ascii value*********");
	System.out.println("Character is : " + a33.getCharFromNum(121));
	
	System.out.println("\n*********Program 3: Ascii value from A to Z *********");
	a33.getAsciiFromAtoZ();
	
	System.out.println("\n*********Program 4: print characters between ascii value 97 to 122 *********");
	a33.printCharaFromGivenAscii();
	
	System.out.println("\n*********Program 5: Find all character frequency from given name *********");
	a33.printCharFreqFromGivenName("aakanksha");
	
	System.out.println("\n*********Program 6: Find all character frequency from each name *********");
	String[] arr = { "raj", "aarya", "aavruti", "shruti", "raj", "aarya" };
	ArrayList<String> name = new ArrayList<String>(Arrays.asList(arr));
	System.out.println("Input is : "+name);
	a33.printWordFreqofGivenArray(arr);
	
	
	System.out.println("\n*********Program 7: Return the frequency of each numbers *********");
	int[] numList = { 1, 8, 6, 3, 4, 5, 2, 3, 6, 9, 8, 4 };
	ArrayList<Integer> input = new ArrayList<>();
	for (int num: numList) {
		input.add(num);
    }
	System.out.println("Input is : "+input);
	a33.printFreqofNum(numList);
	}
}
