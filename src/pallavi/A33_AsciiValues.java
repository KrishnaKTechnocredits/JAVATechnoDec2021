/*Assignment 33:  6th Feb'2022

Program 1: Write a method which will return ascii value of given character.
Hint : Method signature should be int getAsciiOfChar(char ch)

Program 2: Write a method which will return character of given Ascii value.
Hint : Method signature should be char getAsciiOfChar(int asciiValue)



Program 3: write a method which will print Ascii value of A to Z.

Program 4: write a program which will print characters between ascii value 97 to 122.
*/

package pallavi;

import java.util.Scanner;

public class A33_AsciiValues {

	private int getAsciiOfChar(char ch) {
		return (int) ch;

	}

	private char getAsciiOfChar(int i) {

		return (char) i;
	}

	public static void main(String[] args) {
		A33_AsciiValues ascii = new A33_AsciiValues();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter charter of which ASCII value required");
		char ch = sc.nextLine().charAt(0);
		System.out.println("Ascii value of charter '" + ch + "' is: " + ascii.getAsciiOfChar(ch));

		System.out.println("Enter number of which charter value required");
		int i = sc.nextInt();
		System.out.println("Charater for ASCII value " + i + " is: " + ascii.getAsciiOfChar(i));
		sc.close();

		for (char ch2 = 'A'; ch2 <= 'Z'; ch2++) {
			System.out.println("Ascii value of '" + ch2 + "' = " + ascii.getAsciiOfChar(ch2));
		}

		for (int j = 97; j <= 122; j++) {
			System.out.println("Character value of " + j + "= " + ascii.getAsciiOfChar(j));
		}

	}

}
