package gauravk.Assignment33;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/*
Assignment 33:  6th Feb'2022

Program 1: Wri/te a method which will return ascii value of given character.
Hint : Method signature should be int getAsciiOfChar(char ch)

Program 2: Write a method which will return character of given Ascii value.
Hint : Method signature should be char getAsciiOfChar(int asciiValue)

Program 3: write a method which will print Ascii value of A to Z.

Program 4: write a program which will print characters between ascii value 97 to 122.

Program 5: Find all character frequency from given name.
Input: name - aakanksha
Output : a -> 4
k -> 2
n -> 1
s -> 1
h -> 1

Program 6: 
Find all character frequency from each name given in String array.
Input : Array -> {"raj", "aarya", "aavruti", "shruti","raj", "aarya"}

Program 7: 
Return the frequency of each numbers from given array.
input: [1,8,6,3,4,5,2,3,6,9,8,4]
*/
public class AllCharFrequency {

	void analysingFrequencyOfChar(String str) {
		System.out.println("-------Using characterArray and double loop---------");
		char[] ch = str.toCharArray();
		int[] count = new int[str.length()];
		for (int i = 0; i < ch.length; i++) {
			count[i] = 1;
			for (int j = i + 1; j < ch.length; j++) {
				if (ch[i] == ch[j]) {
					count[i]++;
					ch[j] = '0'; // isolating duplicate visited characters----
				}
			}
		}
		// taking out the single space and visited characters----
		for (int i = 0; i < count.length; i++) {
			if (ch[i] != ' ' && ch[i] != '0') {
				System.out.println(ch[i] + " --> " + count[i]);
			}
		}
	}

	void analyseFreq(String str) {
		System.out.println("------Using LinkedHashMap----------");
		LinkedHashMap<Character, Integer> hm = new LinkedHashMap<Character, Integer>();

		// taking out the single spaces from sentence-------
		String[] str1 = str.split(" ");
		String unifiedString = "";
		for (String s : str1) {
			unifiedString += s;
		}
		
		// -----------------
		char[] charArr = unifiedString.toCharArray();
		for (char c : charArr) {
			if (hm.containsKey(c)) {
				hm.put(c, hm.get(c) + 1);
			} else {
				hm.put(c, 1);
			}
		}

		for (Map.Entry<Character, Integer> mapKey : hm.entrySet()) {
			System.out.println(mapKey.getKey() + " --> " + mapKey.getValue());
		}
	}
	
	void analyseArray(String[] str) {
		for(String s1 : str) {
			analysingFrequencyOfChar(s1);
		}
		
		System.out.println("*****Using LinkedHashMap*****");
		
		for(String s2 : str) {
			analyseFreq(s2);
		}
	}
	
	public static void main(String[] args) {
		AllCharFrequency acf = new AllCharFrequency();

		// -------Program 5-----------
		String input = "Picture Perfect Plasma tv";
		// "aakanksha";
		System.out.println("****** Program 5 ********\nFinding frequency of all characters in word: " + input);
		acf.analysingFrequencyOfChar(input);
		acf.analyseFreq(input);

		// ------Program 6-----------
		String[] stArray = { "raj", "aarya", "aavruti", "shruti", "raj", "aarya" };
		System.out.println("******** Program 6 *******\nFinding frequency of all characters in array: " + Arrays.asList(stArray).toString());
		acf.analyseArray(stArray);
	}
}