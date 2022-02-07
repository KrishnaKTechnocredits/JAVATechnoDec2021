package rohini;

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
output : Java*/

public class Rohini_Assignment14 {

	int DCount = 0, UCount = 0;

	public void findduplicatechar(String str) {
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (str.indexOf(ch) != str.lastIndexOf(ch))
				DCount++;
			else
				UCount++;

		}
		if (DCount > UCount)
			System.out.println("Java");
		else
			System.out.println("Selenium");
	}

	public static void main(String[] args) {
		Rohini_Assignment14 rohinias14 = new Rohini_Assignment14();
		rohinias14.findduplicatechar("Rohini");
	}

}
