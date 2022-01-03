/*Assignment - 14 : 29th Dec'2021
In a given string, print "Java" if duplicate characters are more than unique characters, else print "Selenium".
Take string from user.

input : technocredits
output : Selenium

Explanation : 
In technocredits, duplicate characters are t,e,c (character count = 3) , unique characters hnordis (character count = 7)
Here, unique character count > duplicate character count.
you should print Selenium.

input : abcdabc
output : Java
*/

package pallavi;

import java.util.Scanner;

public class A14_DuplicateWithcontains {

	void getcount(String str) {
		char ch;
		int dupCount = 0;
		int uniqueCount = 0;
		String processedString = "";

		for (int index = 0; index < str.length(); index++) {
			ch = str.charAt(index);
			if (str.indexOf(ch) == str.lastIndexOf(ch))
				uniqueCount++;
			else if (!processedString.contains(ch + ""))
				dupCount++;
			processedString = processedString + ch;
		}
		if (uniqueCount > dupCount)
			System.out.println("Selenium");
		else
			System.out.println("Java");
	}

	public static void main(String[] arr) {
		A14_DuplicateWithcontains a14_DuplicateWithcontains = new A14_DuplicateWithcontains();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter input string-");
		String input = scanner.nextLine();
		a14_DuplicateWithcontains.getcount(input);
		scanner.close();
	}

}
