package yogeshNimbalkar;

import java.util.Scanner;

public class A12_FrequencyOfChar {

	void findFrequencyOfChar(String str) {
		int count;
		for(int index = 0; index < str.length(); index++) {
			count = 0;
			for(int innerIndex = 0; innerIndex < str.length(); innerIndex++) {
				if(str.charAt(index) == str.charAt(innerIndex))
					count++;
			}
			System.out.println(str.charAt(index) + " -> " + count);
		}
	}
	
	public static void main(String[] args) {
	A12_FrequencyOfChar findFrequencyOfChar = new A12_FrequencyOfChar();
	Scanner sc = new Scanner(System.in);
	System.out.println("Please enter the string : ");
	String input = sc.next();
	findFrequencyOfChar.findFrequencyOfChar(input);
	sc.close();
	}
}
