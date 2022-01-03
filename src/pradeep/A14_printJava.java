package pradeep;

import java.util.Scanner;

public class A14_printJava {
		
	int countDuplicareChar(String input) {
		int countDuplicate=0;
		String temp="";
		for(int index=0; index<input.length(); index++) {
			char ch = input.charAt(index);
			if(!temp.contains(ch+"")) {
				if(input.indexOf(ch)!= input.lastIndexOf(ch)) {
					countDuplicate++;
					temp = temp + ch;
				}
			}
		}
		System.out.println("No of Duplicate characters are: " + countDuplicate);
		return countDuplicate;
	}
	
	int countUniqueChar(String input) {
		int countUnique = 0;
		for(int index=0; index<input.length(); index++) {
			char ch = input.charAt(index);
			if(input.indexOf(ch)==input.lastIndexOf(ch)) {
				countUnique++;
			}
		}
		System.out.println("No of Unique characters are: " + countUnique);
		return countUnique;		
	}
	
	void checkGreatorNum(String input) {
		int countDuplicate = countDuplicareChar(input);
		int countUnique = countUniqueChar(input);
		if(countDuplicate>countUnique) {
			System.out.println("Java");
		}else {
			System.out.println("Selenium");
		}
	}
	
	public static void main(String[] args) {
		A14_printJava a14_printJava =new A14_printJava();
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		a14_printJava.checkGreatorNum(input);
		sc.close();
	}
}
