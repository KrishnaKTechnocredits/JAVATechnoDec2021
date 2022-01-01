package vaishnavi;

import java.util.Scanner;

public class A14_DuplicateAndUniqueChar {

	
	void printDuplicateAndUniqueChar(String name){
		int duplicateCount = 0;
		int uniqueCount = 0;
		char ch = ' ';
		for(int index = 0; index < name.length(); index++) {
			ch = name.charAt(index);
			
				if(name.indexOf(ch) == name.lastIndexOf(ch)){
				uniqueCount++;
				}
				if(index == name.indexOf(ch)) {
				if(name.indexOf(ch) != name.lastIndexOf(ch)){
				duplicateCount++;
				}
		}
	}
				if (uniqueCount < duplicateCount) {
					System.out.println("Java");
				}
				else
					System.out.println("Selenium");
		}
	public static void main(String[] args) {
		A14_DuplicateAndUniqueChar a14_DuplicateAndUniqueChar = new A14_DuplicateAndUniqueChar();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name :");
		String name = sc.next();
		a14_DuplicateAndUniqueChar.printDuplicateAndUniqueChar(name);
		sc.close();
		
	}

}
