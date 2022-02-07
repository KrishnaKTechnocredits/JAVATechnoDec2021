package nasir;

import java.util.LinkedHashMap;
import java.util.Map;

public class A33_Collection {
	int getAsciiOfChar(char ch) {
		int output = ch;
		return output;
	}
	char getCharofAscii(int num) {
		char ch = (char) num;
		return ch;
	}
	void findAsciiValueOfGivenChar(char start, char end) {
		for (int index = start; index <= end; index++) {
			int ans = index;
			System.out.print(ans + " ");
		}
		System.out.println();
	}
	void getCharofGivenValue(int start, int end) {
		for (int index = start; index <= end; index++) {
			char ans = (char) index;
			System.out.print(ans + " ");
		}
		System.out.println();
	}
	void findFreqOfGivenName(String name) {
		LinkedHashMap<Character, Integer> mapping = new LinkedHashMap<>();
		for (int index = 0; index < name.length(); index++) {
			char ans = name.charAt(index);
			if (mapping.containsKey(ans)) {
				int count = mapping.get(ans);
				mapping.put(ans, count + 1);
			} else {
				mapping.put(ans, 1);
			}
		}
		System.out.println(mapping);
	}
	void findFreqOfAllCharOfEachWord(String[] input) {
		for (int index = 0; index < input.length; index++) {
			Map<Character, Integer> mapping = new LinkedHashMap<>();
			String ans = input[index];
			for (int j = 0; j < ans.length(); j++) {
				char ch = ans.charAt(j);
				if (mapping.containsKey(ch)) {
					int cnt = mapping.get(ch);
					mapping.put(ch, cnt + 1);
				} else {
					mapping.put(ch, 1);
				}
			}
			System.out.println("Character Frequency of word " + ":" + ans + mapping);
		}
	}
	void getFreqOfEachNumber(int[] num) {
		int ans = 0;
		for (int index = 0; index < num.length; index++) {
			Map<Integer, Integer> mapping = new LinkedHashMap<>();
			ans = num[index];
			for (int j = 0; j < num.length; j++) {
				int output = num[j];
				if (mapping.containsKey(output)) {
					int cnt = mapping.get(output);
					mapping.put(output, cnt + 1);
				} else {
					mapping.put(output, 1);
				}
			}
			System.out.println("Frequency of each number " + ":" + mapping);
			break;
		}
	}
	public static void main(String[] args) {
		A33_Collection assignemnt33 = new A33_Collection();
		System.out.println("Program 1 :- to find the Ascii value of given character");
		int ans = assignemnt33.getAsciiOfChar('b');
		System.out.println("Output " + " : " + "Ascii value of character is " + ans);
		System.out.println("Program 2 :- to find the  character of given ascii value");
		char ans1 = assignemnt33.getCharofAscii(65);
		System.out.println("Output " + " : " + "Character of given Ascii value is " + ans1);
		System.out.println("Proram 3 :- to find the Ascii value of given range from A to Z");
		assignemnt33.findAsciiValueOfGivenChar('A', 'Z');
		System.out.println("Program 4 :- to get the charcter of given value range from 97 to 122");
		assignemnt33.getCharofGivenValue(97, 122);
		System.out.println("Program 5 :- to find the frequency of each character from given name");
		assignemnt33.findFreqOfGivenName("aakanksha");
		System.out.println("Program 6 :- to find frequnecy of all characher from each given name");
		String[] input = { "raj", "aarya", "aavruti", "shruti", "raj", "aarya" };
		assignemnt33.findFreqOfAllCharOfEachWord(input);
		System.out.println("Program 7 :- to find the frequency of each number");
		int[] number = { 1, 8, 6, 3, 4, 5, 2, 3, 6, 9, 8, 4 };
		assignemnt33.getFreqOfEachNumber(number);
	}
}
