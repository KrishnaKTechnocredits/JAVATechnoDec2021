/*
Assignment-33
Program 4: write a program which will print characters between ascii value 97 to 122.
*/

package shivangi.Assignment33;

public class P4_CharBasedOnAscii {
	
void printCharBasedOnAsciiFromAtoZ() {
		
		for(int ascii=97; ascii<=122; ascii++) {
			char ch = (char)ascii;      // Here needed typecasting because int takes 4 byte and char takes 2 byte
			  							// so we are trying to fit 4 byte into 2 byte, that is not possible
			System.out.println("Character of "+ascii+" : " + ch);
		}
	}
	
	public static void main(String[] args) {
		P4_CharBasedOnAscii p4 = new P4_CharBasedOnAscii();
		p4.printCharBasedOnAsciiFromAtoZ();
	}
	
}
