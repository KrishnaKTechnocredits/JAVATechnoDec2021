/*	Assignment - 14 : 29th Dec'2021
In a given string, print "Java" if duplicate characters are more than unique characters, else print "Selenium".
Take string from user.

input : technocredits
output : Selenium

Explanation : 
In technocredits, duplicate characters are t,e,c (character count = 3) , unique characters hnordis (character count = 7)
Here, unique character count > duplicate character count.
you should print Selenium.

input : abcdabc
output : Java  */

package amruta.Assignment_10to14;

class Assign14 {

	int duplicateCount = 0;
	int uniqueCount = 0;

	int printDuplicateChar(String input) {

		String str = input.toLowerCase();

		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			int count = 0;
			if (str.indexOf(ch) == index) {

				for (int innerindex = 0; innerindex < str.length(); innerindex++) {
					if (str.charAt(innerindex) == ch)
						count++;
				}
			}
			if (count > 1) {
				duplicateCount++;
			}
		}
		return duplicateCount;
	}

	int printUniqueChar(String input) {

		String str = input.toLowerCase();

		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (str.indexOf(ch) == str.lastIndexOf(ch)) {
				uniqueCount++;
			}
		}
		return uniqueCount;
	}

	public static void main(String[] args) {
		Assign14 assign = new Assign14();
		Assign14 assign1 = new Assign14();

		int dupcount = assign.printDuplicateChar("teCHnoCrEdItS");
		System.out.println("Duplicate char count is -> " + dupcount);
		int uniqueCnt = assign.printUniqueChar("teCHnoCrEdItS");
		System.out.println("Unique char count is -> " + uniqueCnt);

		if (dupcount > uniqueCnt)
			System.out.println("Output : ------------ JAVA ------------");
		else
			System.out.println("Output : ------------ SELENIUM ------------\n");

		int dupcount1 = assign1.printDuplicateChar("abcdabc");
		System.out.println("Duplicate char count is -> " + dupcount1);
		int uniqueCnt1 = assign1.printUniqueChar("abcdabc");
		System.out.println("Unique char count is -> " + uniqueCnt1);

		if (dupcount1 > uniqueCnt1)
			System.out.println("Output : ------------ JAVA ------------");
		else
			System.out.println("Output : ------------ SELENIUM ------------");
	}
}