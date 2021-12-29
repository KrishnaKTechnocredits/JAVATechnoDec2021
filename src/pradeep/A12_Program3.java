package pradeep;

import java.util.Scanner;
 
public class A12_Program3 {
	int count;
	
	void findCharInString(String input, char ch) {
		count=0;
		for(int index=0; index<input.length(); index++) {
			if(input.charAt(index)==ch) {
				count++;
			}
		}
	}
	
	//find the first non repeating character from given string.
	void findFirstNonRepeatingCharInString(String input) {
		for(int index=0; index<input.length();index++) {
			char ch =input.charAt(index);
			findCharInString(input, ch);
			if(count==1) {
				System.out.println(ch + " is first non repeating character in " + input);
				break;
			}			
		}		
	}
	
	//find the first repeating character from given string.
	void findFirstRepeatingCharInString(String input) {
		for(int index=0; index<input.length();index++) {
			char ch =input.charAt(index);
			findCharInString(input, ch);
			if(count>1) {
				System.out.println(ch + " is first repeating character in " + input);
				break;
			}			
		}		
	}
	
	//find reverse string
	String returnReverseString(String input) {
		String reverse = "";
		for(int index=input.length()-1; index>=0; index--) {
			reverse =reverse + input.charAt(index);			
		}
		return reverse;
	}
	
	public static void main(String[] args) {
		A12_Program3 a12_Program3 =new A12_Program3();
		Scanner sc = new Scanner(System.in);
		
		String input = sc.next();
		a12_Program3.findFirstNonRepeatingCharInString(input);
		a12_Program3.findFirstRepeatingCharInString(input);
		String reverse = a12_Program3.returnReverseString(input);
		System.out.println("Reverse String is -> " + reverse);
		sc.close();
	}
}
