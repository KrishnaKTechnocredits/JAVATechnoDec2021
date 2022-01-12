package sagarAcharya;

import java.util.Scanner;
class A13_IndexMethods{
	
	public static void main(String[] args){
		A13_IndexMethods a13 = new A13_IndexMethods();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your input to check it's First Unique/duplicate characters and all unique/duplicate characters : ");
		String str = sc.next();
		a13.firstUnique(str);
		a13.firstDuplicate(str);
		a13.printUniqueChar(str);
		a13.printDuplicateChar(str);
	}
	
	void printDuplicateChar(String input){
		System.out.println("\n"+"Duplicate characters are : ");
		for(int index = 0;index<input.length();index++){
			String temp = "1";
			char ch = input.charAt(index);
			if(input.indexOf(ch) != input.lastIndexOf(ch)){
				System.out.print(ch);
			}
		}
	}
	
	void printUniqueChar(String input){
		System.out.println("\n"+"Unique characters are : ");
		for(int index = 0;index<input.length();index++){
			char ch = input.charAt(index);
			if(input.indexOf(ch) == input.lastIndexOf(ch)){
				System.out.print(ch);
			}
		}
	}
	
	void firstUnique(String input){
		System.out.println("\n"+"First Unique character is : ");
		for(int index = 0;index<input.length();index++){
			char ch = input.charAt(index);
			if(input.indexOf(ch) == input.lastIndexOf(ch)){
				System.out.print(ch);
				break;
			}
		}
	}
	
	void firstDuplicate(String input){
		System.out.println("\n"+"First Duplicate character is : ");
		for(int index = 0;index<input.length();index++){
			char ch = input.charAt(index);
			if(input.indexOf(ch) != input.lastIndexOf(ch)){
				System.out.print(ch);
				break;
			}
		}
	}
}

/* Write a program to satisfy below requirement using indexOf and lastIndexOf method. 
1. Print all duplicate characters from the given string.
2. Print all unique characters from a given string.
3. Return the first unique character from the given string.
4. Return the first duplicate character from the given string.  */
