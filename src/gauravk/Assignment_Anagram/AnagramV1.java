package gauravk.Assignment_Anagram;

import java.util.Arrays;

public class AnagramV1 {

	boolean anagramChecks(String s1, String s2) {
		if (s1.length() != s2.length())
			return false;
		char[] c1 = s1.toCharArray();
		char[] c2 = s2.toCharArray();
		Arrays.sort(c1);
		Arrays.sort(c2);
		return Arrays.equals(c1, c2);
	}

	public static void main(String[] args) {
		String a = "act", b = "cat", c = "bat";
		AnagramV1 a1 = new AnagramV1();
		System.out.print("The words " + a + " & " + b + " are anagram?\n");
		System.out.println(a1.anagramChecks(a, b));
		System.out.print("The words " + b + " & " + c + " are anagram?\n");
		System.out.println(a1.anagramChecks(b, c));
	}
}
