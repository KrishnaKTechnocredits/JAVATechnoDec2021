/*Program 1: Write a method which will return ascii value of given character. 
	Hint : Method signature should be int getAsciiOfChar(char ch)  
Program 2: Write a method which will return character of given Ascii value. 
	Hint : Method signature should be char getAsciiOfChar(int asciiValue)  
Program 3: write a method which will print Ascii value of A to Z.  
Program 4: write a program which will print characters between ascii value 97 to 122.*/

package deepak;

public class A33_P1toP4_AsciiOperations {

	int getAsciiValue(char ch) {
		int value = ch;
		return value;
	}

	char getchar(int num) {
		char value = (char) num;
		return value;
	}

	void printASCII() {
		for (int index = 65; index < 91; index++) {
			char ch = (char) index;
			System.out.println(ch + " - " + index);
		}
	}
	
	void printCHARs() {
		for (int index = 97; index < 123; index++) {
			char ch = (char) index;
			System.out.println(index + " - " + ch);	
		}
	}

	public static void main(String[] args) {
		A33_P1toP4_AsciiOperations ascii = new A33_P1toP4_AsciiOperations();
		System.out.println("ASCII value of D is: " + ascii.getAsciiValue('D'));
		System.out.println("Character value of given ASCII is: " + ascii.getchar(68));
		System.out.println("All the ASCII values from A-Z: ");
		ascii.printASCII();
		System.out.println();
		System.out.println("All the Characters from 97-122: ");
		ascii.printCHARs();
	}

}
