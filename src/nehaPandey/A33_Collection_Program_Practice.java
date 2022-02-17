package nehaPandey;

import java.util.LinkedHashMap;

public class A33_Collection_Program_Practice {

//	Program 1: Wri/te a method which will return ascii value of given character.
//			Hint : Method signature should be int getAsciiOfChar(char ch)

	int getAsciiOfChar(char ch) {
		int asciiValue = ch;
		return asciiValue;

	}

//	Program 2: Write a method which will return character of given Ascii value.
//			Hint : Method signature should be char getAsciiOfChar(int asciiValue)

	char getCharOfAscii(int asciiValue) {
		char ch = (char) asciiValue;
		return ch;
	}

//	Program 3: write a method which will print Ascii value of A to Z.

	void getAsciiValueOfAtoZ() {
		for (char ch = 'A'; ch <= 'Z'; ch++) {
			int asciiValue = ch;
			System.out.println(ch + " -> " + asciiValue);
		}
	}

//	Program 4: write a program which will print characters between ascii value 97 to 122.

	void getCharacterBetweenAsciiValue97to122() {
		for (int index = 97; index <= 122; index++) {
			char ch = (char) index;
			System.out.println(ch + " -> " + index);
		}
	}

//	Program 5: 
//		Find all character frequency from given name.
//		Input: name - aakanksha
//		Output : a -> 4
//		k -> 2
//		n -> 1
//		s -> 1
//		h -> 1

	void getAllCharacterFrequencyFromGivenName(String input) {
		char[] arr = input.toCharArray();
		LinkedHashMap<Character, Integer> map = new LinkedHashMap<Character, Integer>();
		for (char ch : arr) {
			if (map.containsKey(ch))
				map.put(ch, map.get(ch) + 1);
			else
				map.put(ch, 1);
		}
		System.out.println(map);
	}

//	Program 6: 
//		Find all character frequency from each name given in String array.
//		Input : Array -> {"raj", "aarya", "aavruti", "shruti","raj", "aarya"}

	void getAllCharacterFrequencyFromEachNameGivenInStringArray(String[] strArr) {
		for (int index = 0; index < strArr.length; index++) {
			System.out.println("Word from array is " + strArr[index]);
			getAllCharacterFrequencyFromGivenName(strArr[index]);

		}

	}

//	Program 7: 
//		Return the frequency of each numbers from given array.
//		input: [1,8,6,3,4,5,2,3,6,9,8,4]

	void frequencyOfEachNumbersFromGivenArray(int[] arr) {
		LinkedHashMap<Integer, Integer> map = new LinkedHashMap<Integer, Integer>();
		for (int num : arr) {
			if (map.containsKey(num))
				map.put(num, map.get(num) + 1);
			else
				map.put(num, 1);
		}
		System.out.println(map);

	}

	public static void main(String[] args) {
		A33_Collection_Program_Practice a33 = new A33_Collection_Program_Practice();
		System.out.println("Program : 1 ");
		System.out.println();
		int value = (a33.getAsciiOfChar('N'));
		System.out.println("Ascii Value is " + value);
		System.out.println();
		System.out.println("Program : 2 ");
		System.out.println();
		char ch = (a33.getCharOfAscii(167));
		System.out.println("Character value is " + ch);
		System.out.println();
		System.out.println("Program : 3 ");
		System.out.println();
		a33.getAsciiValueOfAtoZ();
		System.out.println();
		System.out.println("Program : 4 ");
		System.out.println();
		a33.getCharacterBetweenAsciiValue97to122();
		System.out.println();
		System.out.println("Program : 5 ");
		System.out.println();
		a33.getAllCharacterFrequencyFromGivenName("aakanksha");
		System.out.println();
		System.out.println("Program : 6 ");
		System.out.println();
		String[] input = { "raj", "aarya", "aavruti", "shruti", "raj", "aarya" };
		a33.getAllCharacterFrequencyFromEachNameGivenInStringArray(input);
		System.out.println();
		System.out.println("Program : 7 ");
		System.out.println();
		int[] arr = { 1, 8, 6, 3, 4, 5, 2, 3, 6, 9, 8, 4 };
		a33.frequencyOfEachNumbersFromGivenArray(arr);

	}

}
