package megha;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Megha_Assignment33 {

	int getAsciiOfChar(char ch) {
		int ascii = ch;
		return ascii;
	}

	char getCharFromNum(int num) {
		char ch = (char) num;
		return ch;
	}

	void printAsciiForUpperAlphabets() {
		System.out.println("Ascii Value of A-Z : ");
		for (char ch = 'A'; ch <= 'Z'; ch++) {
			int ascii = ch;
			System.out.println(ch + " : " + ascii);
		}
	}

	void printAlphabetsForGivenAscii() {
		System.out.println("Alphabets for Ascii Values from 97-122 : ");
		for (int num = 97; num <= 122; num++) {
			char ch = (char) num;
			System.out.println(num + " : " + ch);
		}
	}

	void printCharFreqFromGivenName(String name) {
		System.out.println("Character frequency in " + name + " : ");
		Map<Character, Integer> input = new HashMap();
		for (int index = 0; index < name.length(); index++) {
			char ch = name.charAt(index);
			if (input.containsKey(ch))
				input.put(ch, input.get(ch) + 1);
			else
				input.put(ch, 1);

		}
		System.out.println("Output : " + input);
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
		System.out.println("Output : " + input);

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
		Megha_Assignment33 megha_Assignment = new Megha_Assignment33();
		System.out.println("Program 1: ");
		System.out.println("Ascii value of the given Character is : " + megha_Assignment.getAsciiOfChar('M'));
		System.out.println();
		System.out.println("Program 2: ");
		System.out.println("Character for the given Ascii vaue is : " + megha_Assignment.getCharFromNum(109));
		System.out.println();
		System.out.println("Program 3: ");
		megha_Assignment.printAsciiForUpperAlphabets();
		System.out.println();
		System.out.println("Program 4: ");
		megha_Assignment.printAlphabetsForGivenAscii();
		System.out.println();
		System.out.println("Program 5: ");
		megha_Assignment.printCharFreqFromGivenName("aakanksha");
		System.out.println();
		System.out.println("Program 6: ");
		String[] nameList = { "raj", "aarya", "aavruti", "shruti", "raj", "aarya" };
		System.out.println("Frequency of names in given array : ");
		megha_Assignment.printWordFreqofGivenArray(nameList);
		System.out.println();
		System.out.println("Program 7: ");
		int[] numList = { 1, 8, 6, 3, 4, 5, 2, 3, 6, 9, 8, 4 };
		System.out.println("Frequency of numbers in given array : ");
		megha_Assignment.printFreqofNum(numList);
	}
}
