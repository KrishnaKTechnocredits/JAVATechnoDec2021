package naquibalam;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class A33_Programs {

	int getASCIIFromCharacter(char input) {
		int ouputASCII=(int)input;
		return ouputASCII;
	}

	char getCharacterFromASCII(int input) {
		char outputChar=(char)input;
		return outputChar;
	}
	
	Map<Character, Integer> getCharFrequencyFromString(String input) {
		Map<Character,Integer> linkedHashMap = new LinkedHashMap<>();
		int count = 0;
		for(int i=0; i < input.length(); i++) {
			char eachChar = input.charAt(i);
			if(linkedHashMap.containsKey(eachChar)) {
				count = linkedHashMap.get(eachChar);
				linkedHashMap.put(eachChar, count+1);
			}
			else {
				linkedHashMap.put(eachChar, 1);
			}
		}
		return linkedHashMap;
	}

	Map<String, Integer> getFreqOfEacheachWordInArray(String[] input) {
		Map<String,Integer> treeMap = new TreeMap<>();
		for(int i = 0; i < input.length; i++) {
			String eachString = input[i];
			if(treeMap.containsKey(eachString)) {
				treeMap.put(eachString, treeMap.get(eachString) + 1);
			}
			else {
				treeMap.put(eachString, 1);
			}
		}	
		return treeMap;
	}

	Map<Integer, Integer> getFrequencyOfNumbers(int[] input) {
		Map<Integer,Integer> treeMap = new TreeMap<Integer,Integer>();
		for(int i = 0; i < input.length; i++) {
			int eachNumber = input[i];
			if(treeMap.containsKey(eachNumber)) {
				treeMap.put(eachNumber, treeMap.get(eachNumber) + 1);
			}
			else {
				treeMap.put(eachNumber, 1);
			}
		}
		return treeMap;
	}
	
	void getAToZASCIIValue() {
		for(char alphabet = 'A'; alphabet<='Z'; alphabet++) {
			System.out.println("ASCII value for character of " + alphabet + " is : " + getASCIIFromCharacter(alphabet));
		}
	}

	void getCharFromASCIIRange() {
		for(int valueASCII = 97; valueASCII <= 122; valueASCII++)
		System.out.println("Character for ASCII value of " + valueASCII + " is : " + getCharacterFromASCII(valueASCII));
	}

	public static void main(String[] args) {
		A33_Programs a33_Programs = new A33_Programs();
		System.out.println("-------------------------------------------------------------------------------------");
		char input1 = 'N';
		System.out.println("Program 1 - Get the ASCII value of a given Character");
		System.out.println("Input : " + input1);
		System.out.println("Output : " + a33_Programs.getASCIIFromCharacter(input1));
		System.out.println("-------------------------------------------------------------------------------------");
		int input2 = 97;
		System.out.println("Program 2 - Get the Character for given ASCII value");
		System.out.println("Input : " + input2);
		System.out.println("Output : " + a33_Programs.getCharacterFromASCII(input2));
		System.out.println("-------------------------------------------------------------------------------------");
		System.out.println("Program 3 - Get ASCII value of alphabets from A to Z ");
		a33_Programs.getAToZASCIIValue();
		System.out.println("-------------------------------------------------------------------------------------");
		System.out.println("Program 4 - Get Character value of ASCII value from 97 to 122 range ");
		a33_Programs.getCharFromASCIIRange();
		System.out.println("-------------------------------------------------------------------------------------");
		String input3 = "aakanksha";
		System.out.println("Program 5 - Get frequency of each Character from given String");
		System.out.println("Input : " + input3);
		System.out.println("Output : " + a33_Programs.getCharFrequencyFromString(input3));
		System.out.println("-------------------------------------------------------------------------------------");
		String[] input4 = {"raj", "aarya", "aavruti", "shruti","raj", "aarya"};
		System.out.println("Program 6 - Get frequency of each word from given array");
		System.out.println("Input : " + Arrays.toString(input4));
		System.out.println("Output : " + a33_Programs.getFreqOfEacheachWordInArray(input4));
		System.out.println("-------------------------------------------------------------------------------------");
		int[] input5 = {1,8,6,3,4,5,2,3,6,9,8,4};
		System.out.println("Program 7 - Get frequency of each number from given array");
		System.out.println("Input : " + Arrays.toString(input5));
		System.out.println("Output : " + a33_Programs.getFrequencyOfNumbers(input5));
		}
}
