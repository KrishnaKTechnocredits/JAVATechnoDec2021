package yogeshNimbalkar;

import java.util.Scanner;

//Print ASCII value of given character
public class A33_P1_AsciiValueOfChar {

	int getAsciiOfChar(Character ch) {
		int value = ch;
		return value;
	}
	
	public static void main(String[] args) {
		A33_P1_AsciiValueOfChar program1 = new A33_P1_AsciiValueOfChar();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a character to check the Ascii value :");
		char ch = sc.next().toCharArray()[0];
		System.out.println("Asscii Value of " + ch + " is : " + program1.getAsciiOfChar(ch));
		sc.close();
	}
}
