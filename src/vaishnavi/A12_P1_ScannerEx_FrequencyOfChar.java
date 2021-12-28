package vaishnavi;

import java.util.Scanner;

public class A12_P1_ScannerEx_FrequencyOfChar {
	
	int characterOccurances(String input, char ch) {
		int count = 0;
		for (int index = 0; index < input.length(); index++) {
			if (input.charAt(index) == ch)
				count++;
		}
		return count;
	}
	
	void freqOfEachChar(String name){
		for (int index = 0; index < name.length(); index++) {
			char ch = name.charAt(index);
			int count = characterOccurances(name, ch);
			System.out.println(ch + " : " + count);
		}
	}

	public static void main(String[] args) {
		A12_P1_ScannerEx_FrequencyOfChar a12_P1_ScannerEx_FrequencyOfChar = new A12_P1_ScannerEx_FrequencyOfChar();
		Scanner scanner =new Scanner(System.in);
		System.out.println("Enter the name :");
		String name =scanner.next();
		a12_P1_ScannerEx_FrequencyOfChar.freqOfEachChar(name);
		scanner.close();

	}

}
