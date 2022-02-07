package yogeshNagar.collectionprogramme;

import java.util.LinkedHashMap;

public class A33_CollectionPractice {
	
	void getAsciiOfChar(char ch) {
		int asciiValue = ch;
		System.out.println("Given charcter is "+ch);
		System.out.println("Ascii Value is "+asciiValue);		
	}
	
	void getCharOfAscii(int integerValue) {
		char ch = (char)integerValue;
		System.out.println("Given Integer is "+integerValue);
		System.out.println("Charcter Value is "+ch);
	}
	
	void getAsciiValueAlphabates() {
		for(char ch='A';ch<='Z';ch++) {
			int asciiValue = ch;
			System.out.println(ch+" --> "+asciiValue);
		}
	}
	
	void getAlphabatesGivenAcsciiValue() {
		for(int index=97;index<=122;index++) {
			char ch = (char)index;
			System.out.println(ch+" --> "+index);
		}
	}
	
	void getCharFrequencyName(String str) {
		char[] charArray = str.toCharArray();
		LinkedHashMap<Character,Integer> map = new LinkedHashMap<Character,Integer>();
		for(char ch:charArray) {
			if(map.containsKey(ch))
				map.put(ch, map.get(ch)+1);
			else
				map.put(ch,1);			
		}
		System.out.println(map);
	}
	
	void getCharFrequencyForEachCharWordArray(String[] strArray) {	
		for(int index=0;index<strArray.length;index++) {
			System.out.println("Word from Array is "+strArray[index]);
			getCharFrequencyName(strArray[index]);
		}		
	}
	
	void getNumberFrequencyFromIntegerArray(int[] array) {
		LinkedHashMap<Integer,Integer> map = new LinkedHashMap<Integer,Integer>();
		for(int num:array) {
			if(map.containsKey(num))
				map.put(num, map.get(num)+1);		
			else
				map.put(num, 1);
			}	
		System.out.println(map);
	}
	
	public static void main(String[] args) {
		A33_CollectionPractice objCollPrac= new A33_CollectionPractice();
		System.out.println("----Programme 1----");
		objCollPrac.getAsciiOfChar('r');
		System.out.println();
		System.out.println("----Programme 2----");
		objCollPrac.getCharOfAscii(117);
		System.out.println();
		System.out.println("----Programme 3----");
		objCollPrac.getAsciiValueAlphabates();
		System.out.println();
		System.out.println("----Programme 4----");
		objCollPrac.getAlphabatesGivenAcsciiValue();
		System.out.println();
		System.out.println("----Programme 5----");
		objCollPrac.getCharFrequencyName("aakanksha");
		System.out.println();
		System.out.println("----Programme 6----");
		String[] strArray = {"raj", "aarya", "aavruti", "shruti","raj", "aarya"};
		objCollPrac.getCharFrequencyForEachCharWordArray(strArray);
		System.out.println();
		System.out.println("----Programme 7----");
		int[] array = {1,8,6,3,4,5,2,3,6,9,8,4};
		objCollPrac.getNumberFrequencyFromIntegerArray(array);
	}

}
