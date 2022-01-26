/*In a given string, print "Java" if duplicate characters are more than unique characters, else print "Selenium".
Take string from user.

input : technocredits
output : Selenium
 */

package vrushali;

public class A14_CompareDuplicateChar {

	int getDuplicateChar(String input) {
		int duplicateCharCount = 0;
		char ch = ' ';

		for(int index = 0; index<= input.length()-1; index++) {
			ch = input.charAt(index);
			if(input.indexOf(ch)!=input.lastIndexOf(ch)) {
				if (index == input.indexOf(ch)) {
					duplicateCharCount++;
				}
			}
		}
		return duplicateCharCount;
	}

	int getUniqueChar(String input) {
		int uniqueCharCount = 0;
		char ch = ' ';

		for(int index = 0; index<= input.length()-1; index++) {
			ch = input.charAt(index);
			if(input.indexOf(ch)== input.lastIndexOf(ch))
				uniqueCharCount++;
		}
		return uniqueCharCount;
	}

	void compareDuplicateCharWithUniqueChar(String str) {
		int uniqueCharCount = getUniqueChar(str);
		int duplicateCharCount = getDuplicateChar(str);

		if (duplicateCharCount > uniqueCharCount)
			System.out.println("For Input String '"+str+"' output is " + " --> " + "Java");
		else
			System.out.println("For Input String '"+str+"' output is " + " --> " + "Selenium");
	}

	public static void main(String[] args) {
		A14_CompareDuplicateChar compareDuplicateChar = new A14_CompareDuplicateChar();
		String str1 = "technocredits";
		String str2 = "abcdabc";
		compareDuplicateChar.compareDuplicateCharWithUniqueChar(str1);
		compareDuplicateChar.compareDuplicateCharWithUniqueChar(str2);
	}
}
