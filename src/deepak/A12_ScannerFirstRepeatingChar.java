/*Assignment - 12: 26th Dec'2021
Write 4 different programs to satisfy below requirements, please take input from user using Scanner class. 
1. print freq of each character in given String. [Program-1]
2. find max prime number from given range. [range : 2 to 100, ans ; 97] [Program-2]
3. find the first non repeating character from given string. [program-3]
   input : technocredits
   output : h
4. find the first repeating character from given string. [program-3]
   input : shivangi
   output : i
5. write a method to return the reverse string. [program-3]
6. Reverse number [program - 4]
*/
package deepak;

import java.util.Scanner;

public class A12_ScannerFirstRepeatingChar {

	void firstRepeatingChar(String input) {
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (input.indexOf(ch) != input.lastIndexOf(ch)) {
				System.out.println(ch + " is the first repeating character in the given string.");
				System.out.println();
				break;
			}
		}
	}

	void inputFromUser() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Program 4: Enter the string to get the first repeating of the string: ");
		String input3 = sc.next();
		firstRepeatingChar(input3);
	}

	public static void main(String[] args) {
		A12_ScannerFirstRepeatingChar scannerClass = new A12_ScannerFirstRepeatingChar();
		scannerClass.inputFromUser();
	}
}
