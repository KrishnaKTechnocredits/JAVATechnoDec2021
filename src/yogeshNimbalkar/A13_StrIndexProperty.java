package yogeshNimbalkar;

import java.util.Scanner;

public class A13_StrIndexProperty {
	
	char getFirstRepeatChar(String str) {
		char ch = ' ';
		for(int index=0; index<str.length(); index++) {
			ch = str.charAt(index);
			if(str.indexOf(ch) != str.lastIndexOf(ch)) {
//				System.out.println(ch);
				break;
			}
		}
		return ch;
	}
	
	char getFirstNonRepeatChar(String str) {
		char ch = ' ';
		for(int index=0; index<str.length(); index++) {
			ch = str.charAt(index);
			if(str.indexOf(ch) == str.lastIndexOf(ch)) {
//				System.out.println(ch);
				break;
			}
		}
		return ch;
	}
	
	String getAllRepeatChar(String str) {
		String allrepeatchar="";
		for(int index=0; index<str.length(); index++) {
			char ch = str.charAt(index);
			if(str.indexOf(ch) != str.lastIndexOf(ch)) {
//				System.out.print(ch);
				if(isCharPresent(allrepeatchar, ch)==true) {
					allrepeatchar = allrepeatchar + ch;
				}			
			}
		}
//		System.out.println(allrepeatchar);
		return allrepeatchar;
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
	
	String getAllNonRepeatChar(String str) {
		String allnonrepeatchar="";
		for(int index=0; index<str.length(); index++) {
			char ch = str.charAt(index);
			if(str.indexOf(ch) == str.lastIndexOf(ch)) {
//				System.out.print(ch);
				allnonrepeatchar = allnonrepeatchar + ch;
			}
		}
//		System.out.println(allnonrepeatchar);
		return allnonrepeatchar;
	}
		
	public static void main(String[] args) {
		A13_StrIndexProperty strIndexProperty = new A13_StrIndexProperty();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a string : ");
		String input = scanner.next();
		System.out.println("First repeating character is : " + strIndexProperty.getFirstRepeatChar(input));
		System.out.println("First non repeating character is : " + strIndexProperty.getFirstNonRepeatChar(input));
		System.out.println("All unique repetable characters are : " + strIndexProperty.getAllRepeatChar(input));
		System.out.println("All non repetable characters are : " + strIndexProperty.getAllNonRepeatChar(input));
		scanner.close();
	}
}
