package gauravk.Assignment.Palindrome;

public class PalindromeV2 {

	void palindrome(String str) {
		String reversedString = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			reversedString += str.charAt(i);
		}
		if (str.equals(reversedString)) {
			System.out.println(str + " is Palindrome.");
		} else
			System.out.println(str + " is NOT Palindrome.");
	}

	void palindrome(int num) {
		int reverseNum = 0, mod = 0;
		for (int i = num; i > 0; i /= 10) {
			mod = i % 10;
			reverseNum = reverseNum * 10 + mod;
		}
		if (num - reverseNum == 0) {
			System.out.println(num + " is Palindrome.");
		} else
			System.out.println(num + " is NOT Palindrome.");
	}

	public static void main(String[] args) {
		PalindromeV2 p = new PalindromeV2();
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
