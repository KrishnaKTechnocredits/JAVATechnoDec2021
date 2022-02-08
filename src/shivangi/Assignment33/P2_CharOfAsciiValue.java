/*
Assignment-33
Program 2: Write a method which will return character of given Ascii value.
Hint : Method signature should be char getCharOfAscii(int asciiValue)
*/
package shivangi.Assignment33;

public class P2_CharOfAsciiValue {
	
	char getCharOfGivenAscii(int ascii) {
		char ch = (char)ascii;    // Here needed typecasting because int takes 4 byte and char takes 2 byte so 
								  // we are trying to fit 4 byte into 2 byte, that is not possible
		return ch;
	}
	
	void  printAsciiOfChar2ndapprorach() {
		char ch = 100;            // Compiler thought we need to store value as ascii 100 and it's allowed 
								  //(will print character of ascii 100 that is small d)
		System.out.println(ch);
	}
	
	public static void main(String[] args) {
		P2_CharOfAsciiValue p2 = new P2_CharOfAsciiValue();
		char characterOfAscii = p2.getCharOfGivenAscii(97);
		System.out.println("Charcter of Ascii value : " + characterOfAscii);
		characterOfAscii = p2.getCharOfGivenAscii(99);
		System.out.println("Charcter of Ascii value : " + characterOfAscii);
		p2.printAsciiOfChar2ndapprorach();
	}
}
