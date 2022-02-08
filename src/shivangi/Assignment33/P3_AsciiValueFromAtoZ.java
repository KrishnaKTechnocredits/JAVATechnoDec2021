/*
Assignment-33 -
Program 3: write a method which will print Ascii value of A to Z.
*/
package shivangi.Assignment33;

public class P3_AsciiValueFromAtoZ {
	
	void printAsciiValFromAtoZ() {
		
		for(char ch='A'; ch<='Z'; ch++) {
			int ascii = ch;
			System.out.println("Ascii value of "+ch+" : " + ascii);
		}
	}
	
	public static void main(String[] args) {
		P3_AsciiValueFromAtoZ p3 = new P3_AsciiValueFromAtoZ();
		p3.printAsciiValFromAtoZ();
	}
}
