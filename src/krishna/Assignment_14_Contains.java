package krishna;

import java.util.Scanner;

public class Assignment_14_Contains {
	char ch = ' ';
	int uChar = 0; 
	int dChar=0;
	void findDupliChar(String provide) {
		for(int i = 0; i< provide.length(); i++) {
			ch = provide.charAt(i);
			if(i == provide.indexOf(ch)) {
				if(provide.indexOf(ch) != provide.lastIndexOf(ch))
					dChar++;
			}
			if(provide.indexOf(ch) == provide.lastIndexOf(ch))
				uChar++;
		}
		if(uChar > dChar) {
			System.out.println("Selenium");
			//System.out.println();
		}else
			System.out.println("Java");
	}
		
	public static void main(String[] arr) {
		Assignment_14_Contains ass14 = new Assignment_14_Contains();
		Scanner sc = new Scanner(System.in);
		for(int index = 1; index <= 2; index++) {
			System.out.println("Enter the string : ");
			String provide = sc.next();
			System.out.println(" ");
			ass14.findDupliChar(provide);
		}
	}
}
