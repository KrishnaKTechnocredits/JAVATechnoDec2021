package gauravk.Assignment_Anagram;

import java.util.ArrayList;
import java.util.*;

class AnagramV2 {

	void anagramChecksV2(String s1, String s2) {
		if (s1.length() != s2.length())
			System.out.println("Not Anagram");
		else {
			ArrayList<String> als1 = storingInArrayList(s1);
			ArrayList<String> als2 = storingInArrayList(s2);
			System.out.println(als1.equals(als2));
		}
	}

	ArrayList<String> storingInArrayList(String str) {
		ArrayList<String> als = new ArrayList<String>();
		String[] c = str.split("");
		for (int i = 0; i < c.length; i++) {
			als.add(i, c[i]);
		}
		Collections.sort(als);
		return als;
	}

	public static void main(String[] args) {
		String a = "act";
		String b = "cat";
		String c = "bat";
		AnagramV2 a2 = new AnagramV2();
		System.out.println("The words " + a + " & " + b + " are anagram?");
		// System.out.println(a2.anagramChecks(a,b));
		a2.anagramChecksV2(a, b);
		System.out.println("The words " + b + " & " + c + " are anagram?");
		// System.out.println(a2.anagramChecks(b,c));
		a2.anagramChecksV2(b, c);
	}
}
