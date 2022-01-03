/*Assignment - 14: 29th Dec'2021
In a given string, print "Java" if duplicate characters are more than unique characters, else print "Selenium".
Take string from user.

input : technocredits
output : Selenium

Explanation : 
In technocredits, duplicate characters are t,e,c (character count = 3) , unique characters hnordis (character count = 7)
Here, unique character count > duplicate character count.
you should print Selenium.

input : abcdabc
output : Java*/

package deepak;

public class A14_StringMethods2 {

	void getCharCount(String input) {
		int duplicateCount = 0;
		int uniqueCount = 0;
		String temp = "";
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (!temp.contains(ch + "")) {
				if (input.indexOf(ch) != input.lastIndexOf(ch)) {
					duplicateCount++;
					temp = temp + ch;
				} else {
					uniqueCount++;
				}
			}
		}
		if (duplicateCount > uniqueCount)
			System.out.println("Java");
		else
			System.out.println("Selenium");
	}

	public static void main(String[] args) {
		A14_StringMethods2 stringMethods2 = new A14_StringMethods2();
		stringMethods2.getCharCount("technocredits");
		stringMethods2.getCharCount("abcdabc");
	}

}
