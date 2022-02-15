package gauravk.Assignment.Palindrome;

/*
5.	Write code to check if a String is a palindrome or not?
i/p  : mamma,  o/p : not palindrome
i/p  : nitin,  o/p : palindrome

6.	Write code to check if a number is palindrome or not?
i/p  : 12345,  o/p : not palindrome
i/p  : 12321,  o/p : palindrome
*/
public class PalindromeV1 {

	void palindrome(String str) {
		// boolean result=true;
		if (str.length() % 2 == 0) {
			StringBuffer s1 = new StringBuffer(str.substring(0, (str.length() / 2)));
			String firstHalf = new String(s1);
			StringBuffer s2 = new StringBuffer(str.substring((str.length() / 2), (str.length())));
			System.out.println(s1);
			System.out.println(s2);
			String reversedString = "";
			for (int i = s2.length() - 1; i >= 0; i--) {
				reversedString += String.valueOf(s2.charAt(i));
			}
			if (firstHalf.equals(reversedString))
				System.out.println(str + " is Palindrome.");
			else
				System.out.println(str + " is NOT Palindrome.");
		} else {
			StringBuffer s1 = new StringBuffer(str.substring(0, (str.length() / 2)));
			String firstHalf = new String(s1);
			StringBuffer s2 = new StringBuffer(str.substring((str.length() / 2) + 1, (str.length())));
			System.out.println(s1);
			System.out.println(s2);
			String reversedString = "";
			for (int i = s2.length() - 1; i >= 0; i--) {
				reversedString += String.valueOf(s2.charAt(i));
			}
			if (firstHalf.equals(reversedString))
				System.out.println(str + " is Palindrome.");
			else
				System.out.println(str + " is NOT Palindrome.");
			// for(int i=0, j)
		}
		// return result;
	}

	void palindrome(int num) {
		// boolean result=true;
		String str = String.valueOf(num);
		palindrome(str);

		// return result;
	}

	public static void main(String[] args) {
		PalindromeV1 p = new PalindromeV1();
		p.palindrome("Helo");
		p.palindrome("ollo");
		p.palindrome("Hello");
		p.palindrome("olllo");
		p.palindrome(110011);
		p.palindrome(1105011);
		p.palindrome(10821);
		p.palindrome(1021);
	}
}