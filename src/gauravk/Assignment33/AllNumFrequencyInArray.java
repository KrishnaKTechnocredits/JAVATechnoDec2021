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
public class AllNumFrequencyInArray {

	void analysingFrequencyOfNum(int[] num1) {
		System.out.println("-------Using double loop---------");
		int[] count = new int[num1.length];
		for (int i = 0; i < num1.length; i++) {
			count[i] = 1;
			for (int j = i + 1; j < num1.length; j++) {
				if (num1[i] == num1[j]) {
					count[i]++;
					num1[j] = '0'; // isolating duplicate visited numbers----
				}
			}
		}
		// taking out the single space and visited numbers----
		for (int i = 0; i < count.length; i++) {
			if (num1[i] != ' ' && num1[i] != '0') {
				System.out.println(num1[i] + " --> " + count[i]);
			}
		}
	}

	void analyseFreq(int[] num2) {
	
		System.out.println("------Using LinkedHashMap----------");
		LinkedHashMap<Integer, Integer> hm = new LinkedHashMap<Integer, Integer>();

		for (int c : num2) {
			if (hm.containsKey(c)) {
				hm.put(c, hm.get(c) + 1);
			} else {
				hm.put(c, 1);
			}
		}
		System.out.println(hm);

		for (Map.Entry<Integer, Integer> mapKey : hm.entrySet()) {
			System.out.println(mapKey.getKey() + " --> " + mapKey.getValue());
		}
	}
	
	public static void main(String[] args) {
		// ------Program 7-----------
		AllNumFrequencyInArray acf1 = new AllNumFrequencyInArray();
		int[] intArray1 = {1,8,6,3,40,5,2,3,6,9,8,40};
		System.out.println("******** Program 7 *******\nFinding frequency of numbers in array: " + Arrays.toString(intArray1));
		acf1.analysingFrequencyOfNum(intArray1);
		
		int[] intArray2 = {1,8,6,3,40,5,2,3,6,9,8,40};
		AllNumFrequencyInArray acf2 = new AllNumFrequencyInArray();
		acf2.analyseFreq(intArray2);
	}
}