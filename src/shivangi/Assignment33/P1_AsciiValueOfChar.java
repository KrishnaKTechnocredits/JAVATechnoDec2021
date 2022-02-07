/*
Assignment-33
Program-1: Write a method which will return ascii value of given character.

Hint : Method signature should be int getAsciiOfChar(char ch)
*/

package shivangi.Assignment33;

public class P1_AsciiValueOfChar {
	
	int getAsciiOfChar(char ch) {
		int ascii = ch;
		return ascii;
	}
	
	public static void main(String[] args) {
		P1_AsciiValueOfChar a33_p1 = new P1_AsciiValueOfChar();	
		int asciiValue = a33_p1.getAsciiOfChar('a');
		System.out.println("Ascii value of given char : " + asciiValue);
		asciiValue = a33_p1.getAsciiOfChar('b');
		System.out.println("Ascii value of given char : " + asciiValue);
		
	}
}
