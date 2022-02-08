package gauravk.Assignment33;

/*
Assignment 33:  6th Feb'2022

Program 1: Wri/te a method which will return ascii value of given character.
Hint : Method signature should be int getAsciiOfChar(char ch)

Program 2: Write a method which will return character of given Ascii value.
Hint : Method signature should be char getAsciiOfChar(int asciiValue)

Program 3: write a method which will print Ascii value of A to Z.

Program 4: write a program which will print characters between ascii value 97 to 122.

Program 5: Find all character frequency from given name.
Input: name - aakanksha
Output : a -> 4
k -> 2
n -> 1
s -> 1
h -> 1

Program 6: 
Find all character frequency from each name given in String array.
Input : Array -> {"raj", "aarya", "aavruti", "shruti","raj", "aarya"}

Program 7: 
Return the frequency of each numbers from given array.
input: [1,8,6,3,4,5,2,3,6,9,8,4]
*/
public class Char2AsciiOfA2Z {

	int getAsciiOfChar(char character) {
		return (int) character;
	}

	void analysingA2Z(char startChar, char endChar) {
		for (char i = startChar; i <= endChar; i++) {
			System.out.println("Ascii value of " + i + " is " + getAsciiOfChar(i));
		}
	}

	public static void main(String[] args) {
		// char character = 'B';
		new Char2AsciiOfA2Z().analysingA2Z('A', 'Z');
	}
}