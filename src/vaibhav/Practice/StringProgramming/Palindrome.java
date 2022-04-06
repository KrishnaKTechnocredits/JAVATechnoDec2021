/*
WAP to check given stirng is Palindrome or not?

*/

package vaibhav.Practice.StringProgramming;

public class Palindrome {

	void stringPalindrome(String str) {
		String temp = "";
		for (int index = str.length()-1; index >=0; index--) {
			temp += str.charAt(index);
		}
		if (temp.equals(str))
			System.out.println("Given string \"" + str + "\" is Palindrome");
		else
			System.out.println("Given string \"" + str + "\" is NOT Palindrome");
	}

	public static void main(String[] args) {
		Palindrome palindrome = new Palindrome();
		palindrome.stringPalindrome("nitin");
		palindrome.stringPalindrome("vaibhav");
	}
}
