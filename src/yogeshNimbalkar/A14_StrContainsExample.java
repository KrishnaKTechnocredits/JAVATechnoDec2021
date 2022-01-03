package yogeshNimbalkar;

import java.util.Scanner;

public class A14_StrContainsExample {
	
	int findDuplicateCharCount(String str) {
		int duplicateCount = 0;
		for(int index=0; index<str.length(); index++){
			char ch = str.charAt(index);
			if(index == str.indexOf(ch))
				if(str.indexOf(ch) != str.lastIndexOf(ch))
//					System.out.print(ch);
					duplicateCount++;
		}
		return duplicateCount;
	}
	
	int findUniqueCharCount(String str) {
		int uniqueCount = 0;
		for(int index=0; index<str.length(); index++) {
			char ch = str.charAt(index);
			if(index == str.indexOf(ch))
				if(str.indexOf(ch) == str.lastIndexOf(ch))
//					System.out.print(ch);
					uniqueCount++;
		}
		return uniqueCount;
	}
	
	void compareUniqueDuplicateCount (String str) {
		if(findDuplicateCharCount(str) > findUniqueCharCount(str))
			System.out.println("Java");
		else 
			System.out.println("Selenium");
	}
	
	public static void main(String[] args) {
		A14_StrContainsExample strContainsExample = new A14_StrContainsExample();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a String :");
		String input = scanner.next();
		strContainsExample.compareUniqueDuplicateCount(input);
		scanner.close();
	}
}
