package poojaRajguru;

import java.util.Scanner;

public class A13_StringIndexOperation {

	char firstRepeatChar(String str) {
		char ch = ' ';
		for(int index=0; index<str.length(); index++) {
			ch = str.charAt(index);
			if(str.indexOf(ch) != str.lastIndexOf(ch)) {
				break;
			}
		}
		return ch;
	}

	char firstNonRepeatChar(String str) {
		char ch = ' ';
		for(int index=0; index<str.length(); index++) {
			ch = str.charAt(index);
			if(str.indexOf(ch) == str.lastIndexOf(ch)) {
				break;
			}
		}
		return ch;
	}

	String allRepeatChar(String str) {
		String allChar="";
		for(int index=0; index<str.length(); index++) {
			char ch = str.charAt(index);
			if(str.indexOf(ch) != str.lastIndexOf(ch)) {
				if(isCharPresent(allChar, ch)==true) {
					allChar = allChar + ch;
				}			
			}
		}
		return allChar;
	}

	boolean isCharPresent(String str, char ch) {
		boolean flag = true;
		for(int index=0; index<str.length(); index++) {
			if(str.charAt(index)==ch) {
				flag = false;
				break;
			}
		}
		return flag;
	}

	String allNonRepeatChar(String str) {
		String allChar="";
		for(int index=0; index<str.length(); index++) {
			char ch = str.charAt(index);
			if(str.indexOf(ch) == str.lastIndexOf(ch)) {
				allChar= allChar + ch;
			}
		}
		return allChar;
	}

	public static void main(String[] args) {
		A13_StringIndexOperation stringIndexOperation = new A13_StringIndexOperation();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the string : ");
		String str = scanner.next();
		System.out.println("First repeating character is : " + stringIndexOperation.firstRepeatChar(str));
		System.out.println();
		System.out.println("First Non-repeating character is : " + stringIndexOperation.firstNonRepeatChar(str));
		System.out.println();
		System.out.println("All Unique-repetable characters are : " + stringIndexOperation.allRepeatChar(str));
		System.out.println();
		System.out.println("All Non-repetable characters are : " + stringIndexOperation.allNonRepeatChar(str));
		scanner.close();
	}
}

