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

public class A12_ScannerReverseString {

	void reverseString(String input) {
		for (int index = input.length() - 1; index >= 0; index--) {
			System.out.print(input.charAt(index));
		}
	}

	void inputFromUser() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Program 5: Enter the string to get the reverse of the string: ");
		String input4 = sc.next();
		reverseString(input4);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A12_ScannerReverseString scannerClass = new A12_ScannerReverseString();
		scannerClass.inputFromUser();
	}
}
