/*
 * Assignment - 13 : 28th Dec'2021

Write a program to satisfy below requirement using indexOf and lastIndexOf method.

1. Print all duplicate characters from given string.
2. Print all unique characters from given string.
3. Return first unique character from given string.
4. Return first duplicate character from given string.     
*/
package anjali;

import java.util.Scanner;

public class Anjali_Assignment13 {
	
	void printAlluniqueCharString(String name){
		for(int index=0;index<name.length();index++){
			char ch= name.charAt(index);
			if(name.indexOf(ch)==name.lastIndexOf(ch)) 
				System.out.println(ch);
		}
	}	
	
	void printAllDuplicateCharString(String name){
		String z="";  
		char ch=' ';
		for(int index=0;index<name.length();index++){
			if(!z.contains(String.valueOf(name.charAt(index))))
			ch= name.charAt(index);
			if(name.indexOf(ch)!=name.lastIndexOf(ch)) {
				System.out.println(ch);
				z=z+String.valueOf(name.charAt(index));
			}
	    }
	}
	
	char firstUniqueChar(String name) {
		int index=0;
		char ch= ' ';
		for(index=0;index<name.length();index++){
			ch= name.charAt(index);
			if(name.indexOf(ch)==name.lastIndexOf(ch)) {
				break;
			}
		}
		return ch;
	}
	
	char firstDuplicateChar(String name) {
		char ch=' ';
		for(int index=0;index<name.length();index++){
			ch= name.charAt(index);
			if(name.indexOf(ch)!=name.lastIndexOf(ch)) 
			 break;
		}
		return ch;
	}
	
	public static void main(String[] args) {
		Anjali_Assignment13 a13= new Anjali_Assignment13();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please Enter the String :");
		String input=scanner.next();
		
		System.out.println("The duplicate characters from given string are: ");
		a13.printAllDuplicateCharString(input);
		
		System.out.println("The Unique characters from given string are: ");
		a13.printAlluniqueCharString(input);
	    System.out.println("************************************************");
	    
	    char C1 =a13.firstDuplicateChar(input);
	    System.out.println("first duplicate character from given string: "+C1);
		System.out.println("************************************************");

		char C2=a13.firstUniqueChar(input);
		System.out.println(" first unique character from given string : "+C2);
		scanner.close();
	}

}
