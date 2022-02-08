package gauravk.Assignment07;

import java.util.ArrayList;

/*
 * Assignment - 7 : 19th Dec'2021  
Create only one program having the following 2 methods. 

1.Print all characters at an even position from the given string.
input : technocredits
output : ehordt

2. Print only vowels from a given string.
input : technocredits
output : eoei

 */
public class StringProgram2 {
	
	void allCharAtEvenPosition(String str) {
		System.out.println("\nPrinting characters at even position from "+str+": using method "+new Object() {}.getClass().getEnclosingMethod().getName());
		for(int i=1; i<str.length(); i=i+2) {
			System.out.print(str.charAt(i));
		}
	}
	
	void onlyVowels(String str) {
		//char[] c = str.toCharArray();
		System.out.println("\nPrinting only vowels from "+str+": using method "+new Object() {}.getClass().getEnclosingMethod().getName());
		for(int i=0; i<str.length(); i++) {
			if(Character.valueOf(str.charAt(i)).equals('a')|| Character.valueOf(str.charAt(i)).equals('e')||Character.valueOf(str.charAt(i)).equals('i')||Character.valueOf(str.charAt(i)).equals('o')||Character.valueOf(str.charAt(i)).equals('u'))
				System.out.print(str.charAt(i));
		}
	}
	
	void onlyVowels2(String str) {
		char[] c = str.toCharArray();
		System.out.println("\nPrinting only vowels from "+str+": using method "+new Object() {}.getClass().getEnclosingMethod().getName());
		for(int i=0; i<c.length; i++) {
			if(Character.valueOf(c[i]).equals('a')|| Character.valueOf(c[i]).equals('e')||Character.valueOf(c[i]).equals('i')||Character.valueOf(c[i]).equals('o')||Character.valueOf(c[i]).equals('u'))
				System.out.print(str.charAt(i));
		}
	}
	
	void onlyVowels3(String str) {
		char[] c = str.toCharArray();
		System.out.println("\nPrinting only vowels from "+str+": using method "+new Object() {}.getClass().getEnclosingMethod().getName());
		for(int i=0; i<c.length; i++) {
			if(c[i]=='a'|| c[i]=='e'||c[i]=='i'||c[i]=='o'||c[i]=='u')
				System.out.print(str.charAt(i));
		}
	}
	
	void onlyVowels4(String str) {
		char[] c = str.toCharArray();
		ArrayList<Character> als1 = new ArrayList<Character>();
		ArrayList<Character> als2 = new ArrayList<Character>();
		char[] vowel = {'a','e','i','o','u'};
		for(char ch: vowel) {
			als2.add(ch);
		}
		for(char ch1: c) {
			als1.add(ch1);
		}
		als1.retainAll(als2);
		System.out.println("\nPrinting only vowels from "+str+": using method "+new Object() {}.getClass().getEnclosingMethod().getName());
		System.out.println(als1);
	}
	
	public static void main(String[] args) {
		StringProgram2 sp2 = new StringProgram2();
		sp2.allCharAtEvenPosition("technocredits");
		sp2.onlyVowels("technocredits");
		sp2.onlyVowels2("technocredits");
		sp2.onlyVowels3("technocredits");
		sp2.onlyVowels4("technocredits");
	}
}
