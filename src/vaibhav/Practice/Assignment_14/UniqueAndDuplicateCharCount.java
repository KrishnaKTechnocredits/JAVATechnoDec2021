/* Assignment - 14 : 29th Dec'2021
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

package vaibhav.Practice.Assignment_14;

public class UniqueAndDuplicateCharCount {

	int getUniqueCharCount(String str) {
		int uniqueCharCount = 0;
		char ch;
		for (int index = 0; index < str.length(); index++) {
			ch = str.charAt(index);
			if (str.indexOf(ch) == str.lastIndexOf(ch)) {
				if (index == str.indexOf(ch)) {
					uniqueCharCount++;
				}
			}
		}
		return uniqueCharCount;
	}

	int getDuplicateCharCount(String str) {
		int duplicateCharCount = 0;
		char ch;
		for (int index = 0; index < str.length(); index++) {
			ch = str.charAt(index);
			if (str.indexOf(ch) != str.lastIndexOf(ch)) {
				if (index == str.indexOf(ch)) {
					duplicateCharCount++;
				}
			}
		}
		return duplicateCharCount;
	}

	void printResult(String str) {
		int uniqueCharCount = getUniqueCharCount(str);
		int duplicateCharCount = getDuplicateCharCount(str);

		if (duplicateCharCount > uniqueCharCount)
			System.out.println("For Input String '"+str+"' output is " + " --> " + "Java");
		else
			System.out.println("For Input String '"+str+"' output is " + " --> " + "Selenium");
	}

	public static void main(String[] args) {
		UniqueAndDuplicateCharCount uniqueAndDuplicateCharCount = new UniqueAndDuplicateCharCount();
		String inputString1 = "technocredits";
		String inputString2 = "abcdabc";
		uniqueAndDuplicateCharCount.printResult(inputString1);
		uniqueAndDuplicateCharCount.printResult(inputString2);
	}
}
