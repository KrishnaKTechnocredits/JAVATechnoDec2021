/* Assignment - 12 : 26th Dec'2021

 3. find the first non repeating character from given string. [program-3]
   input : technocredits
   output : h
4. find the first repeating character from given string. [program-3]
   input : shivangi
   output : i
5. write a method to return the reverse string. [program-3]
 */

package pallavi;

import java.util.Scanner;

public class A12_ScannerProg3 {

	int findCountOfChar(String input, char c) {
		int count = 0;

		for (int i = 0; i < input.length(); i++) {
			if (input.charAt(i) == c) {
				count++;
			}
		}
		return count;

	}

	void getNonRepetingChar(String input) {
		int count = 0;
		
		for (int index = 0; index < input.length(); index++) {
			count = findCountOfChar(input, input.charAt(index));
			if (count == 1) {
				System.out.println("First non repeating char is:" + input.charAt(index));
				break;	
			}
		}
		if (count > 1)
			System.out.println("There is no non-repeating character in string");
	}

	void getRepetingChar(String input) {
		int count = 0;

		for (int index = 0; index < input.length(); index++) {
			count = findCountOfChar(input, input.charAt(index));
			if (count > 1) {
				System.out.println("First repeating char is:" + input.charAt(index));
				break;
			}
		}
		if (count == 1)
			System.out.println("There is no repeating character in string");
	}

	void getReverseString(String input) {
		System.out.println("Reverse string is:");
		for (int i = input.length() - 1; i >= 0; i--) {
			System.out.print(input.charAt(i));
		}
	}

	public static void main(String[] arr) {

		A12_ScannerProg3 a12_ScannerProg3 = new A12_ScannerProg3();
		Scanner scanner1 = new Scanner(System.in);
		System.out.println("Please enter the input string-");
		String input = scanner1.nextLine();
		a12_ScannerProg3.getRepetingChar(input);
		a12_ScannerProg3.getNonRepetingChar(input);
		a12_ScannerProg3.getReverseString(input);
		scanner1.close();
	}

}
