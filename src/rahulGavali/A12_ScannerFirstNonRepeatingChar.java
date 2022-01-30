package rahulGavali;

/*Assignment - 
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

import java.util.Scanner;

public class A12_ScannerFirstNonRepeatingChar {

	void firstNonRepeatingChar(String input) {

		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (input.indexOf(ch) == input.lastIndexOf(ch)) {
				System.out.println(ch + " is the first non repeating character in the given string.");
				System.out.println();
				break;
			}
		}
	}

	void inputFromUser() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Program 3: Enter the string to get the first non repeating of the string: ");
		String input2 = sc.next();
		firstNonRepeatingChar(input2);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A12_ScannerFirstNonRepeatingChar scannerClass = new A12_ScannerFirstNonRepeatingChar();
		scannerClass.inputFromUser();
	}
}