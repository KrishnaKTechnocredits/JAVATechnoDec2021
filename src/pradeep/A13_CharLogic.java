package pradeep;

import java.util.Scanner;

public class A13_CharLogic {
	
	//check duplicate character and use of contains method in String class
	void printDuplicateChar(String input) {
		String temp="";
		for(int index=0; index<input.length(); index++) {
			char ch = input.charAt(index);
			if(!temp.contains(ch+"")) {			
				if(input.indexOf(ch) != input.lastIndexOf(ch)) {
					System.out.println(ch + "is Duplicate");
				}
				temp =temp +ch;
			}
		}		
	}
	
	//print all unique character
	void printAllUniqueChar(String input) {		
		for(int index=0; index<input.length(); index++) {
			char ch = input.charAt(index);
			if(input.indexOf(ch) == input.lastIndexOf(ch)) {
				System.out.println(ch + "is Unique");
			}				
		}		
	}
	
	//Return first unique character
	char returnFirstUniqueChar(String input) {
		char ch=' ';
		for(int index=0; index<input.length(); index++) {
			ch = input.charAt(index);
			if(input.indexOf(ch) == input.lastIndexOf(ch)) {
				break;
			}				
		}
		return ch;
	}
	
	//Return first Duplicate character
	char returnFirstDuplicateChar(String input) {
		char ch=' ';
		for(int index=0; index<input.length(); index++) {
			ch = input.charAt(index);
			if(input.indexOf(ch) != input.lastIndexOf(ch)) {
				break;
			}				
		}
		return ch;
	}
	
	public static void main(String[] args) {
		A13_CharLogic a13_CharLogic = new A13_CharLogic();
		Scanner sc = new Scanner(System.in);		
		String input = sc.next();
		System.out.println("***Program 1***");
		a13_CharLogic.printDuplicateChar(input);
		System.out.println("***Program 2***");
		a13_CharLogic.printAllUniqueChar(input);
		System.out.println("***Program 3***");
		char uniqueChar = a13_CharLogic.returnFirstUniqueChar(input);
		System.out.println("First Unique character is " + uniqueChar);
		System.out.println("***Program 4***");
		char duplicateChar = a13_CharLogic.returnFirstDuplicateChar(input);
		System.out.println("First Duplicate character is " + duplicateChar);
		sc.close();
	}
}
