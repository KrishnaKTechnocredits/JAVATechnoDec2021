package hevin;

import java.util.LinkedHashMap;

public class A33_FindFrequency {
	
	static void printAllCharFreq(String name) {
		LinkedHashMap<Character, Integer> output = new LinkedHashMap<>();
		for(int i = 0; i < name.length(); i++) {
			char ch = name.charAt(i);
			if (output.containsKey(ch)) {
				int count = output.get(ch);
				output.put(ch, count + 1);
			}else {
				output.put(ch, 1);
			}
		}
		System.out.println(output);
	}
	
	static void printAllWordsFreq(String[] name) {
		LinkedHashMap<Character, Integer> output = new LinkedHashMap<>();
		LinkedHashMap<String, Integer> output1 = new LinkedHashMap<>();
		
		StringBuffer sb = new StringBuffer();
		for(int i = 0; i < name.length; i++) {
			sb.append(name[i]);
		}
		String str = sb.toString(); //Convert array into string for count of all char
		//System.out.println(str);
		
		for(int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (output.containsKey(ch)) {
				int count = output.get(ch);
				output.put(ch, count + 1);
			}else {
				output.put(ch, 1);
			}
		}
		System.out.println(output);
		
		//For Words Frequency
		for(int i = 0; i < name.length; i++) {
			String ch = name[i];
			if (output1.containsKey(ch)) {
				int count = output1.get(ch);
				output1.put(ch, count + 1);
			}else {
				output1.put(ch, 1);
			}
		}
		System.out.println();
		System.out.println("All Words Frequency From Given String Array");
		System.out.println(output1);
	}
	
	static void printAllDigitsFreq(int[] num) {
		LinkedHashMap<Integer, Integer> output = new LinkedHashMap<>();
		for(int i = 0; i < num.length; i++) {
			int input = num[i];
			if (output.containsKey(input)) {
				int count = output.get(input);
				output.put(input, count + 1);
			}else {
				output.put(input, 1);
			}
		}
		System.out.println(output);
	}
	
	public static void main(String[] args) {
		System.out.println("Character Frequency From Given Name :");
		printAllCharFreq("aakanksha");
		System.out.println();
		System.out.println("All Characters Frequency From Each Name Given in String[]");
		String[] name = {"raj", "aarya" , "aavruti", "shruti", "raj", "aarya"};
		printAllWordsFreq(name);
		System.out.println();
		System.out.println("All Digits Frequency From Given int[] ");
		int[] numbers = {1,8,6,3,4,5,2,3,6,9,8,4};
		printAllDigitsFreq(numbers);
		
		
	}

}
