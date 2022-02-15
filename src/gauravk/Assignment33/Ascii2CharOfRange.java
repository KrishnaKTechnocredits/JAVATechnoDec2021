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
public class Ascii2CharOfRange {

	char getCharOfAscii(int givenAscii) {
		return (char) givenAscii;
	}

	void analysingAscii(int startAscii, int endAscii) {
		for (int i = startAscii; i <= endAscii; i++) {
			System.out.println("Character value of " + i + " is " + getCharOfAscii(i));
		}
	}

	public static void main(String[] args) {
		// char character = 'B';
		new Ascii2CharOfRange().analysingAscii(97, 122);
	}
}