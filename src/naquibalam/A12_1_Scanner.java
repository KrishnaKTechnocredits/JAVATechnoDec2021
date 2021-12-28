package naquibalam;

import java.util.Scanner;

public class A12_1_Scanner {
	
	void getFrequencyEachChar() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter the String for which you want to get frequency of each character");
		String stringToUse = scanner.next();
		for (int i=0; i <= stringToUse.length()-1; i++) {
			int charFreq = 0 ;
			for (int j=0; j <= stringToUse.length()-1; j++) {
				if (stringToUse.charAt(i) == stringToUse.charAt(j)) {
					charFreq++;
				}
			}
			System.out.println("Frequency of character - '" + stringToUse.charAt(i) + "' in the string '" + stringToUse + "' is '" + charFreq + "'");
		}
	}

	public static void main(String[] args) {
		A12_1_Scanner a12_1_Scanner = new A12_1_Scanner();
		a12_1_Scanner.getFrequencyEachChar();
	}
}
