package tanu;

//import java.util.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

class Assignment33 {
	void getAsciiOfSingleChar(char ch) {
		int x = ch;
		System.out.println("Ascii value of  " + ch + "   is-->> " + x);
	}
	void printCharFromAscii(int x) {
		char ch = (char) x;
		System.out.println(x + " is Ascii value of  " + ch);
	}
	void printAsciiValueOfAlbhabets(char ch) {
		int x = ch;
		System.out.println("Ascii value of  " + ch + "   is-->> " + x);
	}
	void printAllCharVlaueFromAscii(int x) {
		char ch = (char) x;
		System.out.println(x + " is Ascii value of  " + ch);
	}
	void findAllCharacterFrequency(String Name) {
		LinkedHashMap<Character, Integer> charfreq = new LinkedHashMap<Character, Integer>();
		for (int index = 0; index < Name.length(); index++) {
			char ch = Name.charAt(index);
			if (charfreq.containsKey(ch)) {
				charfreq.put(ch, charfreq.get(ch) + 1);
			} else {
				charfreq.put(ch, 1);
			}
		}
		System.out.println(charfreq);
	}
	void findAllCharacterFrequencyFromEachName(String[] ArrayNames) {
		LinkedHashMap<String, Integer> charfreq = new LinkedHashMap<String, Integer>();
		for (int index = 0; index < ArrayNames.length; index++) {
			String str = ArrayNames[index];
			if (charfreq.containsKey(str)) {
				charfreq.put(str, charfreq.get(str) + 1);
			} else {
				charfreq.put(str, 1);
			}
		}
		System.out.println(charfreq);
	}
	void findAllDigitFrequency(Integer[] Number) {
		LinkedHashMap<Integer, Integer> numFreq = new LinkedHashMap<Integer, Integer>();
		for (int index = 0; index < Number.length; index++) {
			int num = Number[index];
			if (numFreq.containsKey(num)) {
				numFreq.put(num, numFreq.get(num) + 1);
			} else {
				numFreq.put(num, 1);
			}
		}
		System.out.println(numFreq);
	}
	public static void main(String[] arg) {
		Assignment33 assignment = new Assignment33();
		assignment.getAsciiOfSingleChar('S');
		assignment.printCharFromAscii(83);
		for (char ch = 'A'; ch < 'Z'; ch++) {
			assignment.printAsciiValueOfAlbhabets(ch);
		}
		for (int index = 97; index <= 122; index++) {
			assignment.printAllCharVlaueFromAscii(index);
		}
		assignment.findAllCharacterFrequency("aakanksha");
		String[] userinput = { "raj", "aarya", "aavruti", "shruti", "raj", "aarya" };
		assignment.findAllCharacterFrequencyFromEachName(userinput);
		Integer[] userinput1 = { 1, 8, 6, 3, 4, 5, 2, 3, 6, 9, 8, 4 };
		assignment.findAllDigitFrequency(userinput1);
	}

}
