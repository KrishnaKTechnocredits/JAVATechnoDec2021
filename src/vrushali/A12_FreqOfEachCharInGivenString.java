package vrushali;

import java.util.Scanner;

public class A12_FreqOfEachCharInGivenString {
	int getCharacterCount(String name, char ch) {
		int count = 0;
		for(int index = 0; index<name.length(); index++) {
			if(name.charAt(index)== ch)
				count++;
		}
		return count;
	}
	
	void countStringChr(String name) {
		for(int index=0;index<name.length();index++) {
			int count = getCharacterCount(name,name.charAt(index));
			System.out.println(name.charAt(index)+ "--" + count);
		}
	}
	
	public static void main(String[] args) {
		A12_FreqOfEachCharInGivenString frequencyOfChar = new A12_FreqOfEachCharInGivenString();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter String to find the occurrence of character");
		String name = scanner.next();
		frequencyOfChar.countStringChr("Technocredits");
	}
	
}
