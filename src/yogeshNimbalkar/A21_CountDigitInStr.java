package yogeshNimbalkar;

import java.util.Scanner;

public class A21_CountDigitInStr {

	String getDigitString(String str) {
		String temp ="";
		for(int index=0; index<str.length(); index++) {
			char ch = str.charAt(index);
			if(Character.isDigit(ch))
				temp += ch;
		}
		return temp;
	}
	
	public static void main(String[] args) {
		A21_CountDigitInStr countDigit = new A21_CountDigitInStr();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a string : ");
		String input = scanner.next();
		System.out.println("Resultant string :" + countDigit.getDigitString(input));
		scanner.close();
	}
}
