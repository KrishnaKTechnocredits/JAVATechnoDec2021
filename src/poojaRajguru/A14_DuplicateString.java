package poojaRajguru;

import java.util.Scanner;

public class A14_DuplicateString {
	int duplicateChar(String str) {
		int duplicateCount = 0;
		for(int index=0; index<str.length(); index++){
			char ch = str.charAt(index);
			if(index == str.indexOf(ch))
				if(str.indexOf(ch) != str.lastIndexOf(ch))
					duplicateCount++;
		}
		return duplicateCount;
	}

	int uniqueChar(String str) {
		int uniqueCount = 0;
		for(int index=0; index<str.length(); index++) {
			char ch = str.charAt(index);
			if(index == str.indexOf(ch))
				if(str.indexOf(ch) == str.lastIndexOf(ch))
					uniqueCount++;
		}
		return uniqueCount;
	}

	void duplicateUnique (String str) {
		if(duplicateChar(str) > uniqueChar(str))
			System.out.println("Java");
		else 
			System.out.println("Selenium");
	}

	public static void main(String[] args) {
		A14_DuplicateString duplicateString = new A14_DuplicateString();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a String :");
		String str = scanner.next();
		duplicateString.duplicateUnique(str);
		scanner.close();
	}




}
