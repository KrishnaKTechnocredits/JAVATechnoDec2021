package pradeep;

public class A33_Assignment33_1 {

	// Program 1 : This method returns ASCII of given character
	static int getAsciiOfChar(char ch) {
		int ascii = ch;
		return ascii;
	}

	// Program 2 : This method returns character of given ASCII value
	static char getCharOfAscii(int ascii) {
		char ch = (char) ascii;
		return ch;
	}
	
	//Program 3 : This method will print ASCII value A to Z;
	static void printAscii(char start, char end) {
		for(char index=start; index<=end; index++) {
			int ascii = getAsciiOfChar(index);
			System.out.println(index + "-->" + ascii);
		}
	}
	
	//Program 4 : This method will print character for Ascii value in a given range
	static void printChar(int start, int end) {
		for(int index=start; index<=end; index++) {
			char ch = getCharOfAscii(index);
			System.out.println(index + "-->" + ch);
		}
	}

	public static void main(String[] args) {
		
		printAscii('A', 'Z');
		printChar(97, 122);
	}
}
