package sagarShrikhande.collections1;

public class A33_AsciiPrograms_1_To_4 {
	
	int getAsciiValueOfChar(char ch) {
		return ch;
	}
	
	char getCharFromAsciiValue(int i) {
		return (char) i;
	}
	
	void printAllTheASCIIValues() {
		for(int index ='A'; index <= 'Z'; index++) {
			System.out.println((char) index +"-->"+index);
		}
	}
	
	void printAllTheASCIIValuesInGivenRange() {
		for(int index =97; index <= 122; index++) {
			System.out.println(index +"-->"+(char)index);
		}
	}
	
	public static void main(String[] args) {
		A33_AsciiPrograms_1_To_4 a33_1 = new A33_AsciiPrograms_1_To_4();
		System.out.println(a33_1.getAsciiValueOfChar('s'));
		System.out.println(a33_1.getCharFromAsciiValue(65));
		a33_1.printAllTheASCIIValues();
		a33_1.printAllTheASCIIValuesInGivenRange();
	}
	
}

/*
 * Program 1: Wri/te a method which will return ascii value of given character.
Hint : Method signature should be int getAsciiOfChar(char ch)

Program 2: Write a method which will return character of given Ascii value.
Hint : Method signature should be char getAsciiOfChar(int asciiValue)

Program 3: write a method which will print Ascii value of A to Z.

Program 4: write a program which will print characters between ascii value 97 to 122.

*/
